package kata

import "strconv"

func CountBits(x uint) int {
	res := strconv.FormatInt(int64(x), 2)
  count := 0
	for _, v := range res {
		if v == '1' {
			count++
		}
	}
	return count
}