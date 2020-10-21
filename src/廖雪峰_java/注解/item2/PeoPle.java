package 廖雪峰_java.注解.item2;

/**
 * FileName: PeoPle
 * Date: 2020/10/12 17:07
 * Author:cs
 * Description: 一个人喜欢玩游戏，他喜欢玩英雄联盟，绝地求生，极品飞车，尘埃4等，则我们需要定义一个人的注解，
 * 他属性代表喜欢玩游戏集合，一个游戏注解，游戏属性代表游戏名称
 */

import java.lang.annotation.*;

/**玩家注解*/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface PeoPle {
    Game[] value();
}
