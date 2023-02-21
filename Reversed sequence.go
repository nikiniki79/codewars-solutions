package kata

func ReverseSeq(n int) []int {
  var res []int
  for i := n; i >= 1; i-- {
    res = append(res, i)
  }; return res
}