package kata

func Grow(arr []int) int{
  sum := 1
  for i := 0; i < len(arr); i++ {
    sum *= arr[i]
  }
  return sum
}