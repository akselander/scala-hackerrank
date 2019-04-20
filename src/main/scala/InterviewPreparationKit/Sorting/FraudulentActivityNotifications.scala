package InterviewPreparationKit.Sorting

import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, Queue, HashMap}



object FraudulentActivityNotifications {
  def activityNotifications(expenditure: Array[Int], d: Int): Int = {
    val count: Array[Int] = Array.fill[Int](201)(0)
    (0 until d).foreach(i => count(expenditure(i)) += 1)
    var notifications: Int = 0
    (d until expenditure.length).foreach{ i =>
      val value: Int = expenditure(i)
      val median: Double = searchMedian(count, d)
      if (value.toDouble >= 2 * median) notifications += 1
      count(expenditure(i)) += 1
      count(expenditure(i - d)) -= 1
    }
    notifications
  }

  // this is pretty ugly, I should find a better solution
  def searchMedian(arr: Array[Int], size: Int):Double={
    var i: Int = 0
    var current: Int = 0
    while(arr(i) + current < size / 2){
      current+=arr(i)
      i+=1
    }
    if (arr(i) + current == size / 2){
      val first: Int = i
      while(arr(i) + current <= size / 2){
        i+=1
        current+=arr(i)
      }
      if (size % 2 == 0) (first + i) / 2.0 else i.toDouble
    }
    else i.toDouble
  }

}
