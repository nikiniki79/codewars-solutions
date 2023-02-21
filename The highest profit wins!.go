package kata

func MinMax(arr []int) [2]int {
  var min int = arr[0]
  var max int = arr[0]
  
  for _, value := range arr {
    if max < value {
      max = value
    }
    if min > value {
      min = value
    }
  }

  res := [2]int{min, max}
  return res
}