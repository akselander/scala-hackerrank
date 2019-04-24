package InterviewPreparationKit.GreedyAlgorithms

import scala.collection.mutable


class LuckBalance {
  def luckBalance(k: Int, contests: Array[Array[Int]]): Int = {
    var luckBalance: Int = 0
    val importantContests: mutable.PriorityQueue[Int] = new mutable.PriorityQueue[Int]
    contests.foreach(e => {
      if(e(1) == 0) luckBalance += e(0)
      else importantContests += e(0)
    })
    for(i <- 1 to importantContests.length){
      if(i <= k) luckBalance += importantContests.dequeue
      else luckBalance -= importantContests.dequeue
    }
    luckBalance
  }
}
