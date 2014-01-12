/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 *
 * @author Helmut
 */

@RunWith(Cucumber.class)
@Cucumber.Options(
        features = "MockApp",//path to the features
        format = {"json:target/integration_cucumber.json"},//what formatters to use
        tags = {"@run"})//what tags to include(@)/exclude(@~)

public class LoginTest {
}