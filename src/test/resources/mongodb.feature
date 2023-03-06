Feature: Mongodb Data Repository

  Scenario: Exists n mongo data
    Given Exists 2 mongo data "Mongo":
    Then All mongo data "Mongo" should be:
    """
    = [{
      someString= someString#1
      someInt= 1
      someBoolean= true
    }, {
      someString= someString#2
      someInt= 2
      someBoolean= false
    }]
    """

  Scenario: Exists mongo data
    Given Exists mongo data "Mongo":
      | someString  | someInt | someBoolean |
      | stringValue | 101     | true        |
    Then All mongo data "Mongo" should be:
    """
    = [{
      someString= stringValue
      someInt= 101
      someBoolean= true
    }]
    """

  Scenario: Mongo data should be
    Given Exists mongo data "Mongo":
      | someString  | someInt | someBoolean |
      | stringValue | 101     | true        |
    Then Mongo data "Mongo.someString[stringValue]" should be:
    """
    = {
      someString= stringValue
      someInt= 101
      someBoolean= true
    }
    """

  Scenario: Exists mongo data with child object
    Given Exists mongo data "MongoWithBanana":
      | someString | banana.yaString |
      | someString | bananaString    |
    Then All mongo data "MongoWithBanana" should be:
    """
    = [{
      someString= someString
      banana= {
        yaString= bananaString
      }
    }]
    """
