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


 //seems to fail few cases
  def luckBalance2(k: Int, contests: Array[Array[Int]]): Int = {
    var luckBalance: Int = 0
    var importantContests: mutable.PriorityQueue[Int] = new mutable.PriorityQueue[Int]
    contests.foreach(e => {
      if(e(1) == 0) luckBalance += e(0)
      else {
        
        val tempHeap: mutable.PriorityQueue[Int] = importantContests.clone
        tempHeap += e(0)
        if(tempHeap.length > k){
          importantContests.dequeueAll
          (0 until k).foreach(_ => importantContests += tempHeap.dequeue)
          (0 until tempHeap.length).foreach(_ => luckBalance -= tempHeap.dequeue)
        }
        else importantContests = tempHeap.clone
      }
    })
    (0 until k).foreach(_ => luckBalance += importantContests.dequeue)
    luckBalance
  }
}
