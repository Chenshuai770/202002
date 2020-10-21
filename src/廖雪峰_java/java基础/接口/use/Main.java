package 廖雪峰_java.java基础.接口.use;

/**
 * FileName: Main
 * Date: 2020/10/21 10:16
 * Author:cs
 * Description:
 */
public class Main {

    public static void main(String[] args) {
        // TODO: 用抽象类给一个有工资收入和稿费收入的小伙伴算税:
        Income[] incomes = new Income[]{new SalaryIncome(7500), new RoyaltyIncome(12000)};
        double total = 0;
        // TODO:
        for (Income income : incomes) {
            total += income.getTax();
        }
        System.out.println(total);
    }
}

interface Income {                    //改这里就行了
    double getTax();                //还有这里
}

class SalaryIncome implements Income {  //这里用implements来调用接口
    protected double income;

    public SalaryIncome(double income) {
        this.income = income;
    }

    @Override
    public double getTax() {
        if (this.income <= 5000) {
            return 0;
        }
        return (this.income - 5000) * 0.2;
    }
}

class RoyaltyIncome implements Income {      //这里也用implements来调用接口
    protected double income;

    public RoyaltyIncome(double income) {
        this.income = income;
    }

    @Override
    public double getTax() {
        return this.income * 0.2;
    }
}
