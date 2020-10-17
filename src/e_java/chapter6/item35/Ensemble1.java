package e_java.chapter6.item35;

/**
 * FileName: Ensemble1
 * Date: 2020/10/13 16:34
 * Author:cs
 * Description:
 */
public enum  Ensemble1 {
    SOLO,DUET,TRIO,QUARTET;
    public  int getNub(){
        return ordinal() + 1;
    }

    public static void main(String[] args) {
        int nub = Ensemble1.SOLO.getNub();
        System.out.println(nub);
    }
}
