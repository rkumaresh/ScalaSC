package com.self.shopping.offer

import com.self.shopping.Item
import com.self.shopping.Item.Apple

/**
  * Created by rangak on 12/01/2017.
  */
class BuyThreeForTwo extends Offer{

  override def calculatePrice(itemList: List[Item]): BigDecimal = {
    val size = itemList.filter(x => x.equals(Apple)).size
    if(size >= 3){
      size/3 * Apple.price
    }else{
      0.0
    }
  }
}
