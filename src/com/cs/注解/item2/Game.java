package com.cs.注解.item2;

import java.lang.annotation.*;

/**
 * FileName: Game
 * Date: 2020/10/12 17:09
 * Author:cs
 * Description: 游戏注解
 */
@Repeatable(PeoPle.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Game {
    String value() default "";
}
