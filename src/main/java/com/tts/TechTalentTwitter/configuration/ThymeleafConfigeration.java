package com.tts.TechTalentTwitter.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.extras.springsecurity5.dialect.SpringSecurityDialect;

public class ThymeleafConfigeration {
    @Configuration
    public class ThymeleafConfiguration {
        @Bean
        public SpringSecurityDialect springSecurityDialect(){
            return new SpringSecurityDialect();
        }
    }
}
