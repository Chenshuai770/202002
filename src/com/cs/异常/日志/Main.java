package com.cs.异常.日志;

import java.util.logging.Logger;

/**
 * Created by pc on 2020/10/19 22:16
 * Description: Demo1
 */
public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.info("start process...");
        logger.warning("memory is running out...");
        logger.fine("ignored.");
        logger.severe("process will be terminated...");


    }
}
