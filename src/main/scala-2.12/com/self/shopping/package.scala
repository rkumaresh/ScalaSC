package com.self

import java.util.stream.Collectors

/**
  * Created by rangak on 12/01/2017.
  */
package object shopping {

  def isPangram(strings_size : Int, pangrams : List[String]) :String = {

    pangrams.map(x=> {
      if(x.replaceAll("\\s", "").distinct.length==26) 1 else 0
    }).mkString(" ")
  }

  def compress(msg: List[Char], rep:Int): List[Char] = msg match {
    case x::y::xs => if (x == y) compress(y::xs, rep + 1) else { if (rep > 1) x::rep.toString.toList:::compress(y::xs, 1) else x::compress(y::xs, 1) }
    case x::_ => if (rep > 1) x::rep.toString.toList:::compress(List(), 1) else x::compress(List(), 1)
    case List() => List()
  }

  def compress(s: String): String = {
    if (s.isEmpty) s
    else {
      val (l,r) = s.span(_ == s.head)
      (if (l.size == 1) l else l.head + l.size.toString) + compress(r)
    }
  }

  def shortestPalindrome(str : String): String ={
    (for { i <- (str.size to 2 by -1).view ; s <- str.sliding(i) if s == s.reverse} yield s) head
  }

  def closestNumber(array : Array[Int]) = {
    val sortedArray = array.sorted
    val pairs = sortedArray.sliding(2).toList
    val minDiffPairs = pairs.filter(p => {
      val minDifference = 2
      p(1) - p(0) == minDifference
    }).map(arr => arr(0) + " " + arr(1))
    minDiffPairs.mkString(" \n")
  }

  def repeatListNTimes(num:Int,arr:List[Int]):List[Int] = {
    arr.flatMap(List.fill(num)(_))
  }

  def filterOddPosition(arr:List[Int]):List[Int] = {
    println( "Input : " +  arr.mkString(" "))
    arr.dropWhile(_ % 2 !=1)
    println( "Sliding(1,2) : " +  List(3,2,4,6,5,7,8,0,1).sliding(1,2).mkString(" "))
    println( "Sliding(1,2) sum : " +  List(3,2,4,6,5,7,8,0,1).sliding(1,2).flatten.sum)
    arr.drop(1).sliding(1, 2).flatten.toList
  }
  def sumOfOddElements(arr:List[Int]):List[Int] = {
    val l = List(3,2,4,6,5,7,8,0,1)
    println( "Input : " +  l.mkString(" "))
    val filter = l.filter(_ % 2 != 0)
    println( "filter Odd elements : " +  filter.mkString(" "))
    println( "filter Odd elements sum : " +  l.filter(_% 2 != 0).sum)
    filter
  }

  def stringMingling(array : Array[String]) = {
    ((array(0), array(1)).zipped).map((x, y) => "" + x + y).mkString("")
  }

//  def stringPermute(array : Array[String]) :String = {
//    val by = array(0).reduceLeft((_)reverse(_,_))
//    def reverse(a:Char, b:Char):String = "" + b + a
//    by
//  }

  def stringPermutePrintln(array : Array[String]) {
    val by = array(0).reduceLeft((a,b) => rev(a,b))
    def rev(a:Char, b:Char):String = "" + b + a
    println(by)
  }
}
