package kata

func Past(h, m, s int) int {
    s *= 1000
    m *= 60000
    h *= 3600000
    result := s + m + h
    return result
}