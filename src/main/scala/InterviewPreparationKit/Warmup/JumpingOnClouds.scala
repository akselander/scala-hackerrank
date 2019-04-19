package InterviewPreparationKit.Warmup

class JumpingOnClouds {
  def jumpingOnClouds(c: Array[Int]): Int = {
    var position = 0
    var count = 0
    while(position != c.length - 1) {
      if(position == c.length -2 || c(position+2) == 1) position += 1 else position += 2
      count += 1
    }
    count
  }
}
