package com.cs.注解.item3;

import java.lang.reflect.Method;

/**
 * FileName: BankService
 * Date: 2020/10/13 10:33
 * Author:cs
 * Description: 下面我们看一个银行转账的例子，假设银行有个转账业务，转账的限额可能会根据汇率的变化而变化，
 * 我们可以利用注解灵活配置转账的限额，而不用每次都去修改我们的业务代码
 */

public class BankService {
    @BankTransferMoney(maxMoney = 15000)
    public static void TransferMoney(double money){
        System.out.println(processAnnotationMoney(money));
    }

    private static String processAnnotationMoney(double money){
        try {
            Method transferMoney = BankService.class.getDeclaredMethod("TransferMoney", double.class);
            boolean annotationPresent = transferMoney.isAnnotationPresent(BankTransferMoney.class);
            if (annotationPresent) {
                BankTransferMoney annotation = transferMoney.getAnnotation(BankTransferMoney.class);
                double l = annotation.maxMoney();
                if (money>l) {
                    return "转账金额大于限额，转账失败";
                }else {
                    return"转账金额为:"+money+"，转账成功";
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return "转账处理失败";
    }

    public static void main(String[] args) {
        TransferMoney(20000);
    }
}
