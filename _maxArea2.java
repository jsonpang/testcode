
class _maxArea2 {
    public static void main(String[] args) {
        // int[] arr = {1,8,6,2,5,4,8,3,7};
        int[] arr = {1,8,6,2,5,4,8,3,7,9,4,5};

        // int[] arr = new int[7];
        // arr[0] = 10;
        // arr[1] = 0;
        // arr[2] = 40;
        // arr[3] = 0;
        // arr[4] = 50;
        // arr[5] = 8;
        // arr[6] = 9;
        int abc = maxArea(arr);
        System.out.println("max area is " + abc);

        
    }
    public static int maxArea(int[] nums) {
        int max = 0;
        for (int left = 0, right = nums.length - 1; left < right; ) {
            //两者之间取最小
            int minHeight = nums[left] < nums[right] ? nums[left++] : nums[right--];
            int area = (right - left + 1) * minHeight;
            max = Math.max(max, area);
           
        }
        return max;
    }
    // 10 0 40 0 50
    // right=0 left=0 left < 5 
    // nums[0]=10 10!=0 
    // nums[right]=nums[left]
    //nums[0]=nums[0]
    //right=1 left=1 1<5
    //nums[1]=0
    //跳出循环 
    // right=2 left=2 2<5
    // nums[2]=40 !=0
    //nums[2]=nums[2]

    
}