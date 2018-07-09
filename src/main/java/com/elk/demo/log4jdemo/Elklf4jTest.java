package com.elk.demo.log4jdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Elklf4jTest {

    private static final Logger logger = LoggerFactory.getLogger(ElkLog4jTest.class);

    public static void main(String[] args) throws Exception {

        for(int i = 0;i<10;i++){

            logger.debug("This is a debug message! 222222 " + i);

            logger.info("This is info message!  222 " + i);
            logger.warn("This is a warn message! 222 " + i);
            logger.error("This is error message! 22222 " + i);

            try{
                System.out.println(5/0);
            }catch(Exception e){
                logger.error("错误日志",e);
            }
        }

    }
}
