package InterviewPreparationKit.Hashmaps

import scala.collection.mutable.HashMap

class CountTriplets extends {
  def countTriplets(arr: Array[Long], r: Long): Long = {
    val holdingMap: HashMap[Long, Long] = HashMap[Long, Long]()
    val tripletMap: HashMap[Long, Long] = HashMap[Long, Long]()
    var totalCount: Long = 0
    for(value <- arr){
      if(tripletMap.contains(value)) totalCount += tripletMap(value)
      if(holdingMap.contains(value)){
        if(tripletMap.contains(value * r)) tripletMap(value * r ) += holdingMap(value)
        else tripletMap(value * r ) = holdingMap(value)
      }
      if(holdingMap.contains(value * r)) holdingMap(value * r) += 1
      else holdingMap(value * r) = 1
    }
    totalCount
  }
}
