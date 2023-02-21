package kata

func monkeyCount(n int) []int {
  var s []int
  for i := 1; i <= n; i++ {
     s = append(s, i);
  }
  return s;
}