public class moveZero {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = {4, 0, 6, 0, 50};
        _moveZero(arr);
        for (int element : arr) {
            System.out.println(element);

        }
        
    }
    public static void _moveZero(int[] nums ) {
        int j = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                
                if (j != i) {
                    nums[i] = 0;

                }
                j++;
            }
            
        }

    }
    
}