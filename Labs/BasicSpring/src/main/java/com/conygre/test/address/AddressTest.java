package com.conygre.test.address;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AddressTest {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfiguration.class);
//        context.getBean(Person.class).getPet().feed();

        ApplicationContext context = new AnnotationConfigApplicationContext(AddressConfigurerAnnotations.class);
        Person p = context.getBean("person", Person.class);
        p.getAddress().print();
    }
}
