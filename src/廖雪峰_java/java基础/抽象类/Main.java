package 廖雪峰_java.java基础.抽象类;

/**
 * FileName: Main
 * Date: 2020/10/21 9:42
 * Author:cs
 * Description:
 * 面向抽象编程的本质就是：
 *
 * 上层代码只定义规范（例如：abstract class Person）；
 *
 * 不需要子类就可以实现业务逻辑（正常编译）；
 *
 * 具体的业务逻辑由不同的子类实现，调用者并不关心。
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

abstract class Income {
    protected double income;

    public Income(double income) {
        this.income = income;
    }

    public abstract double getTax();
}

class SalaryIncome extends Income {
    public SalaryIncome(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        if (this.income <= 5000) {
            return 0;
        }
        return (this.income - 5000) * 0.2;
    }
}

class RoyaltyIncome extends Income {
    public RoyaltyIncome(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        return this.income * 0.2;
    }
}
