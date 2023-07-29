package Arrays;

public class program30 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,5,6};
        int target = 4;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        if(nums.length == 0) return -1;

        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start+(end-start)/2;

            if(nums[mid] == target){
                return mid;
            }
            if(target > nums[mid]){
                start= mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return start;
    }

}
