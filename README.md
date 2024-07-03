# Minimal Project to Demo The Nested Test Injection Problem

## Description of the problem

We are migrating from KAPT to KSP (see build.gradle.kts), but have noticed that once KSP is implemented, Micronaut is no longer able to inject dependencies
into nested tests


## Temp Workaround

As a temporary workaround we can move all of our nested tests to be not nested, but we would like to reinstate nested tests as they help keep our test 
suites organised


## How To Recreate Problem.

* Run `DemoTest`, this will successfully inject `myThing` and call the `helloWorld()` method, which will print "hello world"
* Uncomment line 12,13 & 32 from `DemoTest` (this will turn the test into a nested test), run it again and test will fail due to dependencies not being
injected

