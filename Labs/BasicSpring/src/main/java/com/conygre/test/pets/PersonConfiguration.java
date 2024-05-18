package com.conygre.test.pets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfiguration {
    /*AutoWire: person with Pet, no need to set Person's pet each time.*/
    @Bean
    public Pet pet() {
        return new Cat();
    }
    @Bean
    public Person person(@Autowired Pet pet) {
        return new Person(pet);
    }
}
