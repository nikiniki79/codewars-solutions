public class School{
    public static int getAverage(int[] marks){
   int sum = 0, count = 0;  
   for (int i = 0; i < marks.length; i++) {
     sum += marks[i];
     count++;
   }
   return (int)Math.floor(sum / count);
   }
}