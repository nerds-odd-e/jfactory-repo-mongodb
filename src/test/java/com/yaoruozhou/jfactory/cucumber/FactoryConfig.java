package com.yaoruozhou.jfactory.cucumber;

import com.github.leeonky.jfactory.JFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class FactoryConfig {

    @Bean
    public JFactory factorySet(MongoTemplate mongoTemplate) {
        return new EntityFactory(new MongoDBRepository(mongoTemplate));
    }

}
