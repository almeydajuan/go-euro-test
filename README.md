# README #

This is an implementation of the exercise: https://github.com/goeuro/dev-test

### Technology ###

* Java
* Spring - RestTemplate
* JUnit
* Jackson

### Assumptions ###

* API errors and fields in null were not taken into account.
* For the csv file I have not used any library, because commas, spaces,
or any other special character were not taken into account.
I did not want to make a overdesign.
* Java uses UTF-8 to write files.
* I have designed the solution with a TDD approach.
* The program is going to fail if the jar file is not executed with just one parameter.
* If the API does not find results, an empty file is going to be generated.