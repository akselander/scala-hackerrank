package InterviewPreparationKit.Sorting

class MarkAndToys {
  def maximumToys(prices: Array[Int], k: Int): Int = {
    var sum: Int = 0
    var count: Int = 0
    val sortedPrices: Array[Int] = prices.sorted
    while(sum < k){
      sum += sortedPrices(count)
      count += 1
    }
    count - 1
  }
}
