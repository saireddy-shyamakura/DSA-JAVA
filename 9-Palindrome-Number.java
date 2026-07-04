class Solution {
    public boolean isPalindrome(int x) {

         if (x < 0){
           return false;
        }
        
        int number = x;
        int reverse_number = 0;
        int last_number = 0;

        while(number != 0){
            reverse_number = reverse_number*10;
            last_number = number % 10;
            number = number / 10 ;
            reverse_number = reverse_number + last_number;
        }
       
        return x  == reverse_number;
        
    }
}
