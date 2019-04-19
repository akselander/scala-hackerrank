package InterviewPreparationKit.Hashmaps

import scala.collection.mutable.HashMap
import scala.collection.mutable.ArrayBuffer

class FrequencyQueries {
  def freqQuery(queries: Array[Array[Int]]): Array[Int] = {
    val hashMap: HashMap[Int, Int] = HashMap[Int, Int]()
    val freqMap: HashMap[Int, Int] = HashMap[Int, Int]()
    val array: ArrayBuffer[Int] = ArrayBuffer[Int]()
    for (i <- queries; query = i(0); value = i(1)) {
      query match {
        case 1 =>
          val freq: Int = hashMap.getOrElse(value, 0)
          freqMap.update(freq , freqMap.getOrElse(freq, 1) - 1)
          hashMap.update(value, freq + 1)
          freqMap.update(hashMap(value), freqMap.getOrElse(hashMap(value), 0) + 1)
        case 2 =>
            if(hashMap.get(value).isDefined){
              freqMap.update(hashMap(value), freqMap(hashMap(value)) - 1)
              hashMap.update(value, hashMap(value) - 1)
              freqMap.update(hashMap(value), freqMap.getOrElse(hashMap(value), 0) + 1)
              if(hashMap(value) < 0) hashMap(value) = 0
          }
        case 3
        => if (freqMap.get(value).isDefined && freqMap(value) > 0) array += 1 else array += 0
      }
    }
    array.toArray
  }
}