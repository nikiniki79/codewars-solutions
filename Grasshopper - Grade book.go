package kata

func GetGrade(a,b,c int) rune {
    avg := (a + b + c) / 3
    if (avg >= 90 && avg <=100) {
      return 'A'
    } 
    if (avg >= 80 && avg < 90) {
      return 'B'
    }
    if (avg >= 70 && avg < 80) {
      return 'C'
    }
    if (avg >= 60 && avg < 70) {
      return 'D'
    } else {
      return 'F'
    }
}