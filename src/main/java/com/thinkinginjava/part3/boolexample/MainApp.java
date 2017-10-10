package com.thinkinginjava.part3.boolexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vendin on 10.10.2017.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        BoolExample boolExample = (BoolExample) context.getBean("boolExample");
        boolExample.showExamples();
    }
}
