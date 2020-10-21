package 廖雪峰_java.枚举.item1;

/**
 * FileName: Test
 * Date: 2020/10/13 13:27
 * Author:cs
 * Description:
 */
public class Test {
    public static void main(String[] args) {

        Color red = Color.RED;
        System.out.println(red);
        System.out.println(Color.valueOf("RED"));//匹配大小写,要注意下

        for (Color value : Color.values()) {
            System.out.println(value+"\t"+value.ordinal());
        }

        switch(red) {
            case RED:
                System.out.println("红色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
        }

        red.colorInfo();
    }

}
