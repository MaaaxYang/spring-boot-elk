package com.elk.demo.log4jdemo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ElkLog4jTest {

    private static final Logger logger = LogManager.getLogger(ElkLog4jTest.class);

    public static void main(String[] args) throws Exception {
        logger.debug("This is a debug message!");
        logger.info("This is info message!");
        logger.warn("This is a warn message!");
        logger.error("This is error message!");

        try{
            System.out.println(5/0);
        }catch(Exception e){
            logger.error(e);
        }
    }
}