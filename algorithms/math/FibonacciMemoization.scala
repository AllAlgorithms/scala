import scala.collection.mutable

object FibonacciMemoization {
  val mem: mutable.HashMap[Int, Long] = mutable.HashMap(
    (0, 0),
    (1, 1)
  )

  def fibonacci(n: Int): Long = {
    if(!mem.contains(n)) {
      mem(n) = fibonacci(n-1) + fibonacci(n-2)
    }
    mem(n)
  }
}
