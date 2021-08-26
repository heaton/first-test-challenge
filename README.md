# First test challenge

Write only the first test without any implementation code.

The test should meet the following criteria
* The test should describe some business value
* The test should be readable by a non-technical person
* The test should not compile
* The test should be able to be easily implemented without changing the test

## Problem 1 (Example)

You work for a company which provides taxi services with self-driving cars. The pricing team decides to charge each ride based on how far it travels and how long it waits. The minimal charge is $6 which covers the first 2 km, then add $1.2 per km. Additionally, add extra 20% per km after 8 km. Free wait for the first minute, then add $1.5 per minute. The total price is rounded to the nearest whole number.

You are asked to write a program to calculate the price.

### The first test of the problem

[TaxiSpec](app/src/test/kotlin/me/heaton/TaxiSpec.kt)