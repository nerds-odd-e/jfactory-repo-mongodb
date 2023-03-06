package com.yaoruozhou.jfactory.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MongoData {

    @Given("Exists {int} es data {string}:")
    public void exists_es_data(Integer number, String spec) {
    }

    @Then("All mongo data {string} should be:")
    public void all_mongo_data_should_be(String spec, String expression) {
    }
}
