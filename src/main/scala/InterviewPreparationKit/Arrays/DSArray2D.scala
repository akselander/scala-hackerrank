package InterviewPreparationKit.Arrays

class DSArray2D {

  // Complete the hourglassSum function below.
  def hourglassSum(arr: Array[Array[Int]]): Int = {
    var globalMax: Int = Int.MinValue
    for(i <- 0 until 4; j <- 0 until 4) {
      val currentSum = arr(i)(j) + arr(i)(j + 1) + arr(i)(j + 2) + arr(i+1)(j+1) + arr(i + 2)(j) + arr(i + 2)(j + 1) + arr(i + 2)(j + 2)
      globalMax = globalMax max currentSum
    }
    globalMax
  }
}