package kata

func SumCubes(n int) int {
  var s []int
  for i := 0; i <= n; i++ {
    s = append(s, i)
  }
  sumOfCubes := 0
  for j := 0; j < len(s); j++ {
    sumOfCubes += j * j * j
  }
  return sumOfCubes
}