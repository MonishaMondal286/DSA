class Solution {
    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i] != nums[k-1]){
                nums[k] = nums[i];
            k++;
            }
            
           
        }
         return k;
        
    }

    public static void main(String args[]){
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }
}