package kata

import "regexp"

func alphanumeric(str string) bool {
  res, _ := regexp.MatchString(`^[a-zA-Z0-9]+$`, str)
  return res 
}