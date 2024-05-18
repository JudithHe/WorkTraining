package com.conygre.test.pets;

import com.conygre.test.address.AddressConfigurerAnnotations;
import com.conygre.test.pets.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfiguration.class);
        context.getBean(Person.class).getPet().feed();

//        ApplicationContext context = new AnnotationConfigApplicationContext(AddressConfigurerAnnotations.class);
//        Person p = context.getBean("person", Person.class);
//        p.getAddress().print();
    }
}
