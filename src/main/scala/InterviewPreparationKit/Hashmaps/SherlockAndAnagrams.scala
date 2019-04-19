package InterviewPreparationKit.Hashmaps

import scala.collection.mutable

class SherlockAndAnagrams {
  def sherlockAndAnagrams(s: String): Int = {
    var anagrams: Int = 0
    val hashMap: mutable.HashMap[String, Int] = new mutable.HashMap[String, Int]()
    for(i <- 0 until s.length; j <- i + 1 to s.length){
      val key: String = s.substring(i, j).sorted
      val value: Int = hashMap.getOrElse(key, 0)
      hashMap.update(key, value + 1)
      anagrams += value
    }
    anagrams
  }
}
