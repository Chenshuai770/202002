package 廖雪峰_java.枚举.item1;

/**
 * FileName: Color
 * Date: 2020/10/13 13:26
 * Author:cs
 * Description: 枚举的基本使用
 */
public enum Color {
    RED,GREEN, BLUE;

    private Color() {
        System.out.println("Constructor called for : " + this.toString());
    }

    public void colorInfo(){
        System.out.println("Universal Color");
    }

}
