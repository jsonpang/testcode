
class Solution {
    public static void main(String[] args) {
        // int[] arr = {11, 22, 33, 44, 0, 5, 6, 8, 0, 8};
        int[] arr = new int[7];
        arr[0] = 10;
        arr[1] = 0;
        arr[2] = 40;
        arr[3] = 0;
        arr[4] = 50;
        arr[5] = 8;
        arr[6] = 9;
        moveZeroes(arr);
        for (int element: arr) {
            System.out.println(element);
        }
        
    }
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i< nums.length; i++) {
            if (nums[i] != 0) {
                System.out.println("22hang code i" + i + "," + nums[i]);
                System.out.println("23hang code j" + j + "," + nums[j]);
                nums[j] = nums[i];
                System.out.println("25hang code i" + i + "," + nums[i]);
                System.out.println("26hang code j" + j + "," + nums[j]);
                if (i != j) {
                    System.out.println("i != j  i"+ i );
                    System.out.println("i != j  j"+ j );

                    nums[i] = 0;

                    System.out.println("nums[" + i + "]" + nums[i]);
                }
                System.out.println("before j++ now j is " + j);

                j++;
                System.out.println("now j is " + j);
                System.out.println("now i is " + i);
            }
            System.out.println("num[i] is 0 skip i" + i + "," + nums[i]);
        }
    }
    // 10 0 40 0 50
    // j=0 i=0 i < 5 
    // nums[0]=10 10!=0 
    // nums[j]=nums[i]
    //nums[0]=nums[0]
    //j=1 i=1 1<5
    //nums[1]=0
    //跳出循环 
    // j=2 i=2 2<5
    // nums[2]=40 !=0
    //nums[2]=nums[2]

    
}