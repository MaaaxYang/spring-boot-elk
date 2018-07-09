package com.elk.demo.log4jdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Elklf4jTest {

    private static final Logger logger = LoggerFactory.getLogger(ElkLog4jTest.class);

    public static void main(String[] args) throws Exception {
        logger.debug("This is a debug message! 222222");
        logger.info("This is info message!  222");
        logger.warn("This is a warn message! 222");
        logger.error("This is error message! 22222");

        try{
            System.out.println(5/0);
        }catch(Exception e){
            logger.error("错误日志",e);
        }
    }
}
