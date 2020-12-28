Feature: Test feature
#<PROP: Value is defined in property file
#<EXT: Value is defined in external source ex. Excel, JSON
  @ParamScenario
  Scenario: Scenario1
    Given Application $PROP:Application.url is launched
    Then User enters $EXT:SC1~Username ,$EXT:SC1~Password


  @DataTableScenario2
  Scenario Outline: Scenario3
    Given Application $PROP:Application.url is launched
    Then User enters <Username> ,<Password>

    Examples:
      | Username          | Password          |
      | $EXT:SC1~Username | $EXT:SC1~Password |
      | $EXT:SC2~Username | $EXT:SC2~Password |


  @DataTableScenario1
  Scenario Outline: Scenario2
    Given Data setup is done properly
    Then fetch data map for <usecase>

    Examples:
      | usecase  |
      | $EXT:SC1 |
      | $EXT:SC2 |