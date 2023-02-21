package kata

func DigitalRoot(n int) int {
  x := 0
  for n > 0 {
    x += n % 10
    n /= 10
  }
  y := 0
  for x > 0 {
    y += x % 10
    x /= 10
  }
  z := 0
  for y > 0 {
    z += y % 10
    y /= 10
  }
  return z
}