package kata

func combat(health, damage float64) float64 {
  if (health < damage) {
    return 0
  }
  return (health - damage)
}