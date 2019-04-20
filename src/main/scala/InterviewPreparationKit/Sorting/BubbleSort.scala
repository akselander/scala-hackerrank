package InterviewPreparationKit.Sorting

class BubbleSort {

  def countSwaps(a: Array[Int]) {
    var count: Int = 0
    for (i <- a.indices; j <- 0 until a.length - 1) {
      val n: Int = a(j)
      val m: Int = a(j + 1)
      if (n > m) {
        a(j) = m
        a(j + 1) = n
        count += 1
      }
    }
    println(s"Array is sorted in $count swaps.")
    println("First Element: " + a(0))
    println("Last Element: " + a.last)
  }
}
