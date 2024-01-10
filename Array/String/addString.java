class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        StringBuilder result = new StringBuilder();
        
        while(i>=0 || j>=0 || carry!=0){
            int val1=0;
            int val2=0;
            if(i>=0) val1 = num1.charAt(i--)-'0';
            if(j>=0) val2 = num2.charAt(j--) -'0';
            
            int sum = val1+val2+carry;
            result.append(sum%10);
            carry = sum/10;
            
            }
        String sum = result.reverse().toString();
        return sum;  
    }
        
}
