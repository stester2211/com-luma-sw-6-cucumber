package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MenTestSteps
{
    @And("I Mouse Hover on Men Menu and Mouse Hover on Bottoms and Click on Pants")
    public void iMouseHoverOnMenMenuAndMouseHoverOnBottomsAndClickOnPants() {
        new HomePage().clickOnDropdownMen();
    }

    @When("I Mouse Hover on product name Cronus Yoga Pant and click on size.")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnSize() {
        new MenPage().verifyUserSelectSize();
    }

    @And("I Mouse Hover on product name Cronus Yoga Pant and click on colour Black.")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack() {
        new MenPage().verifyUserClickOnColor();
    }

    @And("I Mouse Hover on product name Cronus Yoga Pant and click on Add To Cart Button.")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton() {
        new MenPage().verifyUserClickOnAddToCart();
    }

    @And("Verify the text You added Cronus Yoga Pant to your shopping cart {string}")
    public void verifyTheTextYouAddedCronusYogaPantToYourShoppingCart(String expectedMsg) {
        Assert.assertEquals("Added message not found", expectedMsg,new MenPage().verifyTextAddedToCart());
    }

    @And("I Click on shopping cart Link into message")
    public void iClickOnShoppingCartLinkIntoMessage() {
        new MenPage().verifyUserclickOnShoppingCartLink();
    }

    @And("I verify the text Shopping Cart {string}.")
    public void iVerifyTheTextShoppingCart(String expectedMsg) {
        Assert.assertEquals("Shopping cart text not found", expectedMsg,new ShoppingCartPage().verifyTextShoppingCart());
    }

    @And("I verify the product name {string}")
    public void iVerifyTheProductName(String expectedMsg) {
        Assert.assertEquals("Cronus Pant text not found", expectedMsg,new ShoppingCartPage().verifyTextCronusPant());
    }

    @And("I verify the product size {string}")
    public void iVerifyTheProductSize(String expectedMsg) {
        Assert.assertEquals("Size text not found", expectedMsg,new ShoppingCartPage().verifyTextOfSize());
    }

    @Then("I verify the product colour {string}")
    public void iVerifyTheProductColour(String expectedMsg) {
        Assert.assertEquals("Black text not found", expectedMsg,new ShoppingCartPage().verifyTextOfColor());
    }


}
