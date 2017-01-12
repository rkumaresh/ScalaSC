package com.self.shopping

/**
  * Created by rangak on 12/01/2017.
  */
case class Item(val id: Int, val name:String, val price : BigDecimal)

object Item{
  val Orange = new Item(1, "Orange", .25)
  val Apple = new Item(2, "Apple", .60)
}