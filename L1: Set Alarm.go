package kata

func SetAlarm(employed, vacation bool) bool {
  if (employed == true && vacation == true) {
    return false
  }
  if (employed == false && vacation == true) {
    return false
  }
  if (employed == false && vacation == false) {
    return false 
  }
  return true
}