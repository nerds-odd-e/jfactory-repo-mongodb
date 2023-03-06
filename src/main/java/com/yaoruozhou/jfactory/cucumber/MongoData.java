package com.yaoruozhou.jfactory.cucumber;

import com.github.leeonky.jfactory.JFactory;
import com.github.leeonky.jfactory.cucumber.JData;
import com.github.leeonky.jfactory.cucumber.Table;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MongoData {

    private final JData jData;

    public MongoData(JFactory jFactory) {
        jData = new JData(jFactory);
    }

    @Given("Exists {int} mongo data {string}:")
    public void exists_mongo_data(Integer number, String spec) {
        jData.prepare(number, spec);
    }

    @Then("All mongo data {string} should be:")
    public void all_mongo_data_should_be(String spec, String expression) {
        jData.allShould(spec, expression);
    }

    @Given("Exists mongo data {string}:")
    public void existsMongoData(String spec, Table table) {
        jData.prepare(spec, table);
    }
}
