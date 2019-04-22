package InterviewPreparationKit.StringManipulation

class MakingAnagrams {
  def makeAnagram(a: String, b: String): Int = {
    val freq: Array[Int] = Array.fill[Int](26)(0)
    var count: Int = 0
    for(i <- a) freq((i - 'a')) += 1
    for(i <- b) freq((i - 'a')) -= 1
    for(i <- freq) count += Math.abs(i)
    count
  }
}
