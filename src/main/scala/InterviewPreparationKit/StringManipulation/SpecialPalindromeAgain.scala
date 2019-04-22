package InterviewPreparationKit.StringManipulation

class SpecialPalindromeAgain {
  def substrCount(n: Int, s: String): Long = {
    var count: Long = 0
    var i: Int = 0
    while(i < n) {
      var repetitions: Long = 0
      var offset: Int = 1
      while (i - offset >= 0 && i + offset < n && s(i - offset) == s(i - 1) && s(i + offset) == s(i - 1)){
        offset += 1
        count += 1
      }
        while (i + 1 < n && s(i) == s(i + 1)) {
        repetitions += 1
        i += 1
      }
      count += repetitions * (repetitions + 1)/2
      i += 1
    }
    count + n
  }


}
