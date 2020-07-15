import sun.awt.AWTAccessor.SystemTrayAccessor;

public class _for_if {
    public static void main(String args[]){
       int [] numbers = {10, 0, 30, 40, 50};
       int j = 0;
       for(int i =0; i < numbers.length; i++ ){
          System.out.print( numbers[i] );
          if (numbers[i] != 0) {
              System.out.println("number[" + i + "]" + numbers[i] + "bu shi 0");
              numbers[j] = numbers [i];
              System.out.println("number[" + j + "]" + numbers[j] + "numbers[j]fuzhi");
          }
          System.out.print(",");
          
          j++;
       }
       for(int x : numbers ){
        System.out.print( x );
        System.out.print(",");
     }
       
    }
 }