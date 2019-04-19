package InterviewPreparationKit.Warmup

import scala.collection.mutable

class SockMerchant {
  def sockMerchant(n: Int, ar: Array[Int]): Int = {
    var count: Int = 0
    val hashMap: mutable.HashMap[Int, Int] = mutable.HashMap[Int, Int]()
    for(i <- ar){
      val value = hashMap.getOrElse(i, 0)
      hashMap.update(i, value + 1)
      if((value + 1) % 2 == 0) count += 1
    }
    count
  }
}
