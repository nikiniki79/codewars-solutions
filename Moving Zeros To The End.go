package kata

func MoveZeros(arr []int) []int {
	var s []int
	var s2 []int

	for i := 0; i < len(arr); i++ {
		if arr[i] != 0 {
			s = append(s, arr[i])
		} else if arr[i] == 0 {
			s2 = append(s2, arr[i])
		}
	}

	for j := 0; j < len(s2); j++ {
		s = append(s, s2[j])
	}

	return s
}