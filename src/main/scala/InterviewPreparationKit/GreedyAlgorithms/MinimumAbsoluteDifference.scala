package InterviewPreparationKit.GreedyAlgorithms

class MinimumAbsoluteDifference {
  def minimumAbsoluteDifference(arr: Array[Int]): Int = {
    val sortedArray: Array[Int] = arr.sorted
    var minimum: Int = Int.MaxValue
    for (i <- 0 until sortedArray.length - 1; absMin = Math.abs(sortedArray(i) - sortedArray(i + 1))) {
      if (absMin < minimum) minimum = absMin
    }
    minimum
  }
}
