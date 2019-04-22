package InterviewPreparationKit.StringManipulation

class AlternatingCharacters {
  def alternatingCharacters(s: String): Int = {
    var count: Int = 0
    for(i <- 1 until s.length) if(s(i -1) == s(i)) count += 1
    count
  }
}
