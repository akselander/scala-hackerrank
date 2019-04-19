package InterviewPreparationKit.Arrays

class ArrayManipulation {
  def arrayManipulation(n: Int, queries: Array[Array[Int]]): Long = {
    val arr: Array[Int] = Array.ofDim[Int](n)
    for(i <- queries.indices; first = queries(i)(0) - 1; last = queries(i)(1); value = queries(i)(2)){
      arr(first) += value
      if (last < arr.length) arr(last ) -= value
    }
    var runningSum: Long = 0.toLong
    var max: Long = 0.toLong
    for (i <- arr) {
      runningSum += i
      max = runningSum.max(max)
    }
    max
  }
}
