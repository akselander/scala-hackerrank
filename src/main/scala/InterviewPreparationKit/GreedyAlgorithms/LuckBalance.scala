package InterviewPreparationKit.GreedyAlgorithms

import scala.collection.mutable


class LuckBalance {
  def luckBalance(k: Int, contests: Array[Array[Int]]): Int = {
    var luckBalance: Int = 0
    val importantContests: mutable.PriorityQueue[Int] = new mutable.PriorityQueue[Int]
    contests.foreach(e => {
      if(e(1) == 0) luckBalance += e(0)
      else {
        importantContests += e(0)
        if(importantContests.length > k) luckBalance -= importantContests.dequeue()
      }
    })
    for(i <- 0 until k){
      luckBalance += importantContests.dequeue
    }
    luckBalance
  }

  def luckBalance2(k: Int, contests: Array[Array[Int]]): Int = {
    var luckBalance: Int = 0
    var importantContests: mutable.PriorityQueue[Int] = new mutable.PriorityQueue[Int]
    contests.foreach(e => {
      if(e(1) == 0) luckBalance += e(0)
      else {
        importantContests += e(0)
        if(importantContests.length > k) {val reverseIC = importantContests.reverse
          luckBalance -= reverseIC.dequeue
          importantContests = reverseIC.reverse
        }
      }
    })
    println(importantContests)
    for(i <- 0 until k){
      luckBalance += importantContests.dequeue
    }
    luckBalance
  }
}
