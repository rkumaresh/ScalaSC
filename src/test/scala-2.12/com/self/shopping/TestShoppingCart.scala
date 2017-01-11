package com.self.shopping

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}
import Item.{Apple, Orange}
import com.self.shopping.offer.BuyOneGetOneFree
/**
  * Created by rangak on 10/01/2017.
  */
@RunWith(classOf[JUnitRunner])
class TestShoppingCart extends FlatSpec with Matchers{

  "Shopping cart" should "calculate correct price from the list" in {
    new ShoppingCart(List()).calculatePrice()  shouldBe   0.0
    new ShoppingCart(List(Orange)).calculatePrice() shouldBe .25
    new ShoppingCart(List(Orange, Orange)).calculatePrice() shouldBe .50
    new ShoppingCart(List(Apple)).calculatePrice() shouldBe .60
    new ShoppingCart(List(Apple, Apple)).calculatePrice() shouldBe 1.20
  }

  "Shopping cart" should "calculate correct price for Buy One Get One Offer" in {
    val offerItems = List(Orange)
    val offers = List(new BuyOneGetOneFree(offerItems))
    new ShoppingCart(List(Orange, Orange, Orange), offers).calculatePrice() shouldBe .50
  }
}
