package InterviewPreparationKit.Warmup

class RepeatedString {
  def repeatedString(s: String, n: Long): Long = {
    val repetitions: Long = n / s.length
    val rest: Long = n % s.length
    val count: Long = repetitions * s.count(_ == 'a') + s.substring(0, rest.toInt).count(_ == 'a')
    count
  }
}
