package com.self.shopping.offer

import com.self.shopping.Item
import com.self.shopping.Item.Orange

/**
  * Created by rangak on 12/01/2017.
  */
//class BuyOneGetOneFree(offerItems:List[Item]) extends Offer(offerItems){
//  def calculatePrice(itemList : List[Item]) : BigDecimal = {
//    if(itemList.isEmpty){
//      return 0.0
//    }
//    val filterdItemList = itemList.filter(offerItems.contains(_))
//    val groupByName = filterdItemList.groupBy(w => w ).mapValues(_.size).map(_._2%2 )
//    var totalPrice:BigDecimal = 0.0
//    return 0.0
////    for(name <- groupByName){
////      totalPrice = totalPrice.+((name._2.size/2)* (name._2(0).price))
////    }
////    for(item <- filterdItemList){
////
////    }
////    val totalFilterdItemList = filterdItemList.size
////
////    filterdItemList.map(s => s.price).sum/2
//
////    val totalOrange = itemList.filter(x => x.equals(offerItems)).size
////    if(totalFilterdItemList >= 2){
////      totalOrange/2 * Orange.price
////    }else {
////      0.00
////    }
//  }
//}

class BuyOneGetOneFree extends Offer{
  def calculatePrice(itemList : List[Item]) : BigDecimal = {
    val totalOrange = itemList.filter(x => x.equals(Orange)).size
    if(totalOrange >= 2){
      totalOrange/2 * Orange.price
    }else {
      0.00
    }
  }
}
