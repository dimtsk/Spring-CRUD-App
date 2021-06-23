package com.project.springdata;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class Config {

      @Bean//-->WHATEVER THIS METHOD RETURNS TAKE IT TO THE APPLICATION CONTEXT
    public MessageSource messageSource(){
        ReloadableResourceBundleMessageSource messageSource=new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:errorMessage"); //MESSAGE PATH
        messageSource.setCacheSeconds(10); //RELOAD MESSAGE EVERY 10 SEC
        return messageSource;
    }
}
