package com.self.shopping.offer

import com.self.shopping.Item

/**
  * Created by rangak on 12/01/2017.
  */
abstract class Offer {

  def calculatePrice(itemList : List[Item]) : BigDecimal
}
