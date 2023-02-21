package kata

func Between(a, b int) []int {
  var s []int
  for i := a; i <= b; i++ {
    s = append(s, i)
  }
  return s
}