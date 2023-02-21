package kata

import "strings"

func FindShort(s string) int {
  str := strings.Split(s, " ")
  minValue := str[0]
  for i := 0; i < len(str); i++ {
    if (len(str[i]) < len(minValue)) {
      minValue = str[i]
    }
  }
  res := len([]rune(minValue))
  return res
}