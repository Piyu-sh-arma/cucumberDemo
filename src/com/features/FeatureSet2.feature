Feature: Test feature 2

  Scenario Outline: DataTable Scenario1
    Given Data setup is done properly
    Then fetch data map for <usecase>

    Examples:
      | usecase  |
      | $EXT:SC1 |
      | $EXT:SC2 |
