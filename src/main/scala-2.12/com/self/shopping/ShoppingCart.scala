package com.self.shopping

import com.self.shopping.offer.Offer

/**
  * Created by rangak on 10/01/2017.
  */
class ShoppingCart(val itemList: List[Item], val offers: List[Offer]) {

  def this(itemList: List[Item]) {
    this(itemList, List());
  }

  def calculatePrice() : BigDecimal = {
    val totalPrice = itemList.map(x => x.price).sum
    val offerPrice = offers.map(offer => offer.calculatePrice(itemList)).sum
    totalPrice - offerPrice
  }

}
