class Containers {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length - 1; i < j;) {
            int minheight = height[i] < height[j] ? height[i++] : height[j--];
            // +1 是因为i++了
            int width = j - i + 1;
            int area = width * minheight;
            max = Math.max(max, area);
        }
        return max;

    }
}