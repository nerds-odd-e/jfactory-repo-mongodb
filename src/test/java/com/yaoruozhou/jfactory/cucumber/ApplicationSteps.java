package com.yaoruozhou.jfactory.cucumber;

import com.yaoruozhou.jfactory.cucumber.entity.Mongo;
import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {CucumberConfig.class}, loader = SpringBootContextLoader.class)
@CucumberContextConfiguration
public class ApplicationSteps {

    @Autowired
    MongoTemplate mongoTemplate;

    @Before
    public void clean() {
        mongoTemplate.dropCollection(Mongo.class);
    }

}