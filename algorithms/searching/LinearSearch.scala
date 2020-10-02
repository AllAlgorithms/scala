object LinearSearch {
  def linearSearch(array: Array[Int], value: Int): Int = {
    for(idx <- 0 until array.length) {
      if(array(idx) == value) {
        return idx
      }
    }
    -1
  }
}
