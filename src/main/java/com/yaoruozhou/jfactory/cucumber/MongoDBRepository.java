package com.yaoruozhou.jfactory.cucumber;

import com.github.leeonky.jfactory.DataRepository;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.Collection;

public class MongoDBRepository implements DataRepository {
    private final MongoTemplate mongoTemplate;

    public MongoDBRepository(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public <T> Collection<T> queryAll(Class<T> type) {
        return mongoTemplate.findAll(type);
    }

    @Override
    public void clear() {

    }

    @Override
    public void save(Object object) {
        mongoTemplate.save(object);
    }
}
