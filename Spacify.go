package kata

import "strings"

func Spacify(s string) string {
  arr := strings.Split(s, "")
  justString := strings.Join(arr, " ")
  return justString
}