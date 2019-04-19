package InterviewPreparationKit.Hashmaps

class RansomNote {
  def checkMagazine(magazine: Array[String], note: Array[String]) {
    if((note diff magazine).isEmpty) println("Yes") else println("No")
  }
}
