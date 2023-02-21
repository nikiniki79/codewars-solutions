package kata

func Factorial(n int) int {
	if (n > 0) {
    res := n * Factorial(n - 1)
    return res
  }
  return 1
 }