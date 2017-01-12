package com.self.shopping

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}
import Item.{Apple, Orange}
import com.self.shopping.offer.{BuyOneGetOneFree, BuyThreeForTwo}
/**
  * Created by rangak on 12/01/2017.
  */
@RunWith(classOf[JUnitRunner])
class TestShoppingCart extends FlatSpec with Matchers{

//  "Shopping cart" should "calculate correct price from the list" in {
//    new ShoppingCart(List()).calculatePrice()  shouldBe   0.0
//    new ShoppingCart(List(Orange)).calculatePrice() shouldBe .25
//    new ShoppingCart(List(Orange, Orange)).calculatePrice() shouldBe .50
//    new ShoppingCart(List(Apple)).calculatePrice() shouldBe .60
//    new ShoppingCart(List(Apple, Apple)).calculatePrice() shouldBe 1.20
//  }
//
//  "Shopping cart" should "calculate correct price for Buy One Get One Offer" in {
//    val offerItems = List(Orange)
//    val offers = List(new BuyOneGetOneFree())
//    new ShoppingCart(List(Orange, Orange, Orange), offers).calculatePrice() shouldBe .50
//  }
//
//  "Shopping Cart" should "calculate correct price for Buy Three for Two Offer" in {
//    val offerItem = List(Apple)
//    val offers = List(new BuyThreeForTwo())
//    new ShoppingCart(List(Apple, Apple, Apple, Apple), offers).calculatePrice() shouldBe 1.8
//  }

  "Shopping Cart" should "calculate correct price for Mixed Offers" in {
    val offerItem = List(Apple)
    val offers = List(new BuyThreeForTwo(), new BuyOneGetOneFree)
    new ShoppingCart(List(Apple, Apple, Apple, Apple, Orange, Orange, Orange, Orange), offers)
      .calculatePrice() shouldBe 2.30

    val testStr = "a0Bda9AlMasd"
    val split = testStr.split("\\d+")
    println(split.flatten.toString)
    println(split.reduceLeft((a, b) => if(a.length > b.length) a else b ))
    println(split.reduceLeft((a, b) => if(a.length > b.length) a else b).size)
    println("abc".matches(".*[A-Z].*"))
    println(!"abc".matches(".*[A-Z].*"))

    println(isPangram(1, List("we promtly judged antique ivory buckles for the next prie")))
    println(shortestPalindrome("abab"))
    println(closestNumber(Array(6,2,4,10)))
    println(closestNumber(Array(4,4,-2,-1,3)))

  }


}
