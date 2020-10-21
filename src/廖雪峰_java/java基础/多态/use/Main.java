package 廖雪峰_java.java基础.多态.use;

/**
 * FileName: Main
 * Date: 2020/10/21 9:29
 * Author:cs
 * Description: 多态的具体使用
 * 观察totalTax()方法：利用多态，totalTax()方法只需要和Income打交道，它完全不需要知道Salary和StateCouncilSpecialAllowance的存在，就可以正确计算出总的税。如果我们要新增一种稿费收入，只需要从Income派生，然后正确覆写getTax()方法就可以。把新的类型传入totalTax()，不需要修改任何代码。
 * 可见，多态具有一个非常强大的功能，就是允许添加更多类型的子类实现功能扩展，却不需要修改基于父类的代码。
 */

//假设我们定义一种收入，需要给它报税
class Income {
    protected double income;

    public double getTax() {
        return income * 0.1;// 税率10%
    }

    public Income(double income) {
        this.income = income;
    }
}

//对于工资收入，可以减去一个基数
class Salary extends Income {
    public Salary(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}

//如果你享受国务院特殊津贴,免税
class StateCouncilSpecialAllowance extends Income {
    public StateCouncilSpecialAllowance(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        return 0;
    }
}


public class Main {
    public static void main(String[] args) {
        Income[] incomes = new Income[]{
                new Income(3000),
                new Salary(7500),
                new StateCouncilSpecialAllowance(15000)
        };

        System.out.println(totalTax(incomes));
    }

    /**
     * 现在，我们要编写一个报税的财务软件，对于一个人的所有收入进行报税
     *
     * @param incomes
     * @return
     */
    public static double totalTax(Income... incomes) {
        double total = 0;
        for (Income income : incomes) {
            System.out.println(income.getTax());
            total = total + income.getTax();
        }
        return total;
    }
}
