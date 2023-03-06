Feature: Mongodb Data Repository

  Scenario: Exists n mongo data
    Given Exists 1 mongo data "Mongo":
    Then All mongo data "Mongo" should be:
    """
    : [{
      someString='someString#1'
      someInt=1,
      someBoolean=true
    }]
    """
