package InterviewPreparationKit.Warmup

class CountingValleys {
  def countingValleys(n: Int, s: String): Int = {
    var level = 0
    var count = 0
    for(i <- s) {
      if(i == 'D') {
        level -= 1
      }
      else if(i == 'U') {
        level += 1
        if(level == 0) count += 1
      }
    }
    count
  }
}
