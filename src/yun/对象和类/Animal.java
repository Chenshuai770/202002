package yun.对象和类;

/**
 * FileName: Main
 * Date: 2020/11/6 15:23
 * Author:cs
 * Description:动物类
 * class开头的就是类,本类就是Animal类
 */
public class Animal {
    //属性
    private String type;

    public Animal() {
    }

    public Animal(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void eat() {

    }

    public void sleep() {

    }
}
