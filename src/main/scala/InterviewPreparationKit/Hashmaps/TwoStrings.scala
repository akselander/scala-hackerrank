package InterviewPreparationKit.Hashmaps

class TwoStrings {
  def twoStrings(s1: String, s2: String): String = {
    if((s1 intersect s2).length != 0) "YES" else "NO"
  }
}
