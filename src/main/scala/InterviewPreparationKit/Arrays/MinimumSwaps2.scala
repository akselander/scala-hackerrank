package InterviewPreparationKit.Arrays

class MinimumSwaps2 {
  def minimumSwaps(arr: Array[Int]): Int = {
    val sortedArray: Array[(Int, Int)] = arr.zipWithIndex.sortWith(_._1 < _._1)
    val visited: Array[Boolean] = new Array[Boolean](arr.length)
    var response: Int = 0
    for(i <- arr.indices) {
      if(!(visited(i) || sortedArray(i)._2 == i)) {
        var cycle: Int = 0
        var j = i
        while(!visited(j)){
          visited(j) = true
          j = sortedArray(j)._2
          cycle += 1
        }
        if(cycle > 0) response += (cycle - 1)
      }
    }
    response
  }

}
