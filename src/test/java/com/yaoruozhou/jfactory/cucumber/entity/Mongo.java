package com.yaoruozhou.jfactory.cucumber.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mongo")
@Getter
@Setter
public class Mongo {

    private String someString;
    private int someInt;
    private boolean someBoolean;

}
