package kata

func Gimme(array [3]int) int {
  var max int = array[0]
  var min int = array[0]
  var mid int
    for _, value := range array {
      if max < value {
          max = value
      }
      if min > value {
          min = value
      }
	}
    for i, j := range array {
      if j < max && j > min {
      mid = i
      }
  }
  return mid
}