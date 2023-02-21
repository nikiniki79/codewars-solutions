public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
      int sheeps = 0;
      for(Boolean sheep: arrayOfSheeps){
        if (sheep != null && sheep == true){
          sheeps++;
        }
      }return sheeps;
    } 
  }