package InterviewPreparationKit.Arrays

class LeftRotation {
  def rotLeft(a: Array[Int], d: Int): Array[Int] = {
    val const: Array[Int] = new Array(a.length)
    print(a.length)
    for(i <- a.indices) {
      const(i) = if (i+d < a.length) a(i+d) else a((i+d) % a.length)
    }
    const
  }
}
