//原地就是说原来的位置上修改值
//双指针快慢指针法 如果快指针的值不等于慢指针
//慢指针加1 且值=快指针对应的值
class _removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(arr);
        System.out.println(k);
        for (int i = 0; i < arr.length; i++ ) {
            System.out.println(arr[i]);
        }

    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}