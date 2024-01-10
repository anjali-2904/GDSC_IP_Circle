class Solution {
    public boolean isPalindrome(String s) {
        
        int n = s.length();
        int start=0;
        int end = n-1;

        while(start<end){

            while(!Character.isLetterOrDigit(s.charAt(start)) && start<n-1 ) start++;
            while(!Character.isLetterOrDigit(s.charAt(end)) && end>0) end--;
            
            if(start>end) return true;
            
if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))) return false;
            start++;
            end--;
        }
        return true;       
    }
}
