object Fibonacci {
  def fibonacci(n: Int): Long = {
    if(n < 2) {
      n
    } else {
      fibonacci(n-1) + fibonacci(n-2)
    }
  }
}
