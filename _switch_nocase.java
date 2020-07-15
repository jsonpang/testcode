public class _switch_nocase {
    //如果 case 语句块中没有 break 语句时，JVM 并不会顺序输出每一个 
    //case 对应的返回值，而是继续匹配，匹配不成功则返回默认 case。

   public static void main(String args[]){
      int i = 1;
      switch(i){
         case 0:
            System.out.println("0");
         case 1:
            System.out.println("1");
         case 2:
            System.out.println("2");
         default:
            System.out.println("default");
      }
   }
}