class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nextG =nextGreater(nums2);
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i=0 ;i<nums2.length ;i++){
            map.put(nums2[i] , nextG[i]);
        }

        int[] result = new int[nums1.length];
        for(int i=0 ;i<nums1.length ;i++){
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
    public int[] nextGreater(int []nums){
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=nums.length-1 ;i>=0 ;i--){
            while(!stack.isEmpty() && stack.peek()<=nums[i] ) stack.pop();

            if(stack.isEmpty()) res[i]=-1;
            else res[i] =stack.peek();

            stack.push(nums[i]);
        }
        return res;
    }
}
