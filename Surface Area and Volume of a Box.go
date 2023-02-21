package kata

func GetSize(w,h,d int) [2]int {
    area := 2 * (d*w + d*h + w*h)
    volume := w * h * d
    var arr [2]int
    arr[0] = area
    arr[1] = volume

    return arr
}