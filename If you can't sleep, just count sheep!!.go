package kata

import "strconv"

func countSheep(num int) string {
  str := ""
  sheep := " sheep..."
  for i := 1; i <= num; i++ {
    concatenated := strconv.Itoa(i) + sheep
    str += concatenated
  }; return str
}