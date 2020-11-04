package com.ysdrzp.consumer;

import com.ysdrzp.provider.api.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 消费者启动类
 * @author 向往的生活
 */
public class App {

    public static void main(String[] args) throws IOException, InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
        HelloService helloService = (HelloService) context.getBean("helloService");
        System.out.println("消费者启动...");
        System.out.println(helloService.sayHello("lee"));
        Thread.sleep(Long.MAX_VALUE);
    }

}
