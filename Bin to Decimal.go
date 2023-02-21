package kata

import "strconv"

func BinToDec(bin string) int {
	x, _ := strconv.ParseInt(bin, 2, 64) 
  return int(x)
}