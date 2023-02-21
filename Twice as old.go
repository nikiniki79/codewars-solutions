package kata

func TwiceAsOld(dadYearsOld, sonYearsOld int) int {  
  res := dadYearsOld - 2 * sonYearsOld
  if (res < 0) {
    return res * -1
  }
  return res
}