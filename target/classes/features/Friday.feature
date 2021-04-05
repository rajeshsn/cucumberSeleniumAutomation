@123runner
Feature: Test Friday
Test Friday

Scenario Outline: Today is or is not friday
Given Today is "<day>"
When I ask whether its friday yet
Then I should be told "<answer>"

Examples:
|day|     |answer|
|Friday|   | TGIF|
