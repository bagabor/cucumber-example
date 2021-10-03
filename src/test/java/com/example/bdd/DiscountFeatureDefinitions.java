package com.example.bdd;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DiscountFeatureDefinitions extends SpringIntegrationContextConfig {

    @When("^the client calls \\/discounts\\/(\\d+)$")
    public void the_Client_Calls_Discount_Id(final Integer amount) {
        executeGet("http://localhost:8080/discounts/" + amount);
    }

    @And("^the client receives discount equals with (.+)$")
    public void the_client_receives_server_version_body(String discount) {
        assertThat(latestResponse.getBody(), is(discount));
    }
}
