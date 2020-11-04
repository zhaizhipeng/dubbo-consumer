package com.ysdrzp.consumer;

import com.ysdrzp.provider.api.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 *
 */
public class App {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
        context.start();

        HelloService helloService = (HelloService) context.getBean("helloService");
        helloService.sayHello("lee");
        // 按任意键退出
        System.in.read();
    }

}
