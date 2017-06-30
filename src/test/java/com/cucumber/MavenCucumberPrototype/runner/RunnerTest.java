package com.cucumber.MavenCucumberPrototype.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resource/features/myFeature.feature",
glue="com.cucumber.MavenCucumberPrototype.stepdefination",
tags="@demo")
public class RunnerTest {

}
