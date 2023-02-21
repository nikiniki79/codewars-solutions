package kata

import "strings"

func Feast(beast string, dish string) bool {
  splittedBeast := strings.Split(beast, "")
  splittedDish := strings.Split(dish, "")
  
  b1 := splittedBeast[len(splittedBeast)-1]
  d1 := splittedDish[len(splittedDish)-1]
  b2 := splittedBeast[0]
  d2 := splittedDish[0]
  if (b1 == d1 && b2 == d2) {
    return true
  }
  return false
}