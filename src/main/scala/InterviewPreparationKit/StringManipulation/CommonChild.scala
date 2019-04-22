package InterviewPreparationKit.StringManipulation

class CommonChild {
  def commonChild(s1: String, s2: String): Int = {
    val child: Array[Array[Int]] = Array.ofDim[Int](s1.length + 1, s2.length + 1)
    for (i <- 0 until s1.length; j <- 0 until s2.length){
      child(i+1)(j+1) = if(s1(i) == s2(j)) child(i)(j) + 1 else child(i)(j+1) max child(i+1)(j)
    }
    child(s1.length)(s2.length)
  }
}
