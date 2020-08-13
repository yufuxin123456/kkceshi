package com.czxy.fang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @version 2017.1.1
 * @Auther Du Ruifang @Cute
 * @Date 2020/8/13 09:19
 * @description 该类的作用
 */
@SpringBootApplication
public class FangApplication {
    public static void main(String[] args) {
        System.out.println("是子");
        SpringApplication.run(FangApplication.class);
        System.out.println("于福鑫");
        System.out.println("大锅电饭锅子");
    }
}
