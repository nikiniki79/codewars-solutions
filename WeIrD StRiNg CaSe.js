function toWeirdCase(string){
    let str = string.split(" ")
    let result = ""
    
    for (let i = 0; i < str.length; i++) {
      for (let j = 0; j < str[i].length; j++) {
        if (j % 2 == 0) {
          result += str[i][j].toUpperCase()
        } else {
          result += str[i][j].toLowerCase()
        }
      }
      result += " "
    }
    return result.trim()
  }