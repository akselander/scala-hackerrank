package InterviewPreparationKit.Arrays

class NewYearChaos {
  def minimumBribes(q: Array[Int]) {
    var bribes: Int = 0
    for(i <- q.indices; startIndex =  q(i) - 1){
      if(startIndex - i > 2) {
        println("Too chaotic")
        return
      }
      else for(j <- (startIndex - 1 max 0) until i) {
        if(q(j) > startIndex) bribes += 1
      }
    }
    println(bribes.toString)
  }
}
