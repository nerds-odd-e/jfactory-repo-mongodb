package com.yaoruozhou.jfactory.cucumber.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mongo_with_banana")
@Getter
@Setter
public class MongoWithBanana {

    private String someString;
    private Banana banana;

    @Getter
    @Setter
    @Document(collection = "banana")
    public static class Banana {
        private String yaString;
    }
}
