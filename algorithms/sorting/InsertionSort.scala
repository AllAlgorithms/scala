object InsertionSort {

  def insertionSort(array: Array[Int]): Array[Int] = {
    for(insertingElementIdx <- 1 to array.length-1) {

      val insertingElement = array(insertingElementIdx)
      var potentialPlaceForElement = insertingElementIdx - 1

      while(potentialPlaceForElement >= 0 && array(potentialPlaceForElement) > insertingElement) {
        moveToRight(array, potentialPlaceForElement)
        potentialPlaceForElement -= 1
      }

      array(potentialPlaceForElement+1) = insertingElement
    }
    array
  }

  def moveToRight(array: Array[Int], idx: Int): Array[Int] = {
    array(idx + 1) = array(idx)
    array
  }
}
