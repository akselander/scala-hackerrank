package InterviewPreparationKit.Sorting
//TODO
class CountingInversions {
  def countInversions(arr: Array[Int]): Long = {
    val temp: Array[Int] = new Array[Int](arr.length)
    mergeSort(arr, temp, 0, arr.length - 1)
  }

  def mergeSort(arr: Array[Int], temp: Array[Int], left: Int, right: Int): Long = {
    var middle: Int = 0
    var count: Long = 0
    if (right > left) {
      middle = (right + left) / 2
      count = mergeSort(arr, temp, left, middle)
      count += mergeSort(arr, temp, middle + 1, right)
      count += merge(arr, temp, left, middle + 1, right)
    }
    count
  }

  def merge(arr: Array[Int], temp: Array[Int], left: Int, middle: Int, right: Int): Long = {
    var i: Int = left
    var j: Int = middle
    var k: Int = left
    var count: Long = 0

    while ((i <= middle - 1) && (j <= right)) {
      if (arr(i) <= arr(j)) { temp(k) = arr(i); i += 1 }
      else temp(k) = arr(j); count += middle - i; j += 1
      k += 1
    }
    while (i <= middle - 1) temp(k) = arr(i); i += 1; j += 1
    while (j <= right) temp(k) = arr(j); k += 1; j += 1
    for (e <- left to right) arr(e) = temp(e)
    count
  }
}
