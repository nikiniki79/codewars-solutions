package kata

import "strings"

func StringToArray(str string) []string {
    res := strings.Split(str, " ")
    return res
}