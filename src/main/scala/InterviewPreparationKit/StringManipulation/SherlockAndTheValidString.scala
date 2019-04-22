package InterviewPreparationKit.StringManipulation

class SherlockAndTheValidString {
  def isValid(s: String): String = {
    val freq: Array[Int] = new Array[Int](26)
    for(c <- s) freq(c - 'a') += 1
    var maxCount: Int = 0
    var minCount: Int = 0
    val freqNoZero: Array[Int] = freq.filter(_ != 0)
    val max: Int = freqNoZero.max
    val min: Int = freqNoZero.min
    for(i <- freqNoZero) if(i == max) maxCount += 1 else if(i == min) minCount += 1
    if(max == min) "YES"
    else if(maxCount == 1 && max == min + 1) "YES"
    else if(minCount == 1 && min == 1) "YES"
    else "NO"
  }
}
