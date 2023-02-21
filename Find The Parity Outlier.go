package kata

func FindOutlier(integers []int) int {
  odd := 0
  even := 0
  evenCount := 0
  oddCount := 0
  for _, v := range integers {
    if v % 2 == 0 {
      even += v
      evenCount++
    } else {
      odd += v
      oddCount++
    }
  }
    if oddCount > evenCount {
      return even
    }
    return odd
}