package kata

func Xor(a, b bool) bool {
  // your code here:
  if ((a == true && b != true) || (a != true && b ==true)) {
    return true
  }
  return false
}