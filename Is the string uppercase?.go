package kata

import "unicode"

type MyString string

func (s MyString) IsUpperCase() bool {
  for _, x := range s {
		if !unicode.IsUpper(x) && unicode.IsLetter(x) {
			return false
		}
	}
	return true
}