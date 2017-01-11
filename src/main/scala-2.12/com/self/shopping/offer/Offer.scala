package com.self.shopping.offer

import com.self.shopping.Item

/**
  * Created by rangak on 10/01/2017.
  */
abstract class Offer(unit: Unit) {

  def calculatePrice(itemList : List[Item]) : BigDecimal
}
