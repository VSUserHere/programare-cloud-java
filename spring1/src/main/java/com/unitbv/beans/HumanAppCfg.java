package com.unitbv.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.unitbv.beans"} )
public class HumanAppCfg {

//    @Bean
//    Person person(){
//        return new Person();
//    }
}
