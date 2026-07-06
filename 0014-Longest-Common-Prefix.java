class Solution {
    public String longestCommonPrefix(String[] str) {
        if(str.length == 0){
            return "";
        }

        int small_word_length = str[0].length();
        String final_word = str[0];

        for(int i = 1;i< str.length;i++){

            if(str[i].length() < small_word_length){
                small_word_length = str[i].length();
                final_word = str[i];
            }
        }

        int count = 0;
        
        for(int i = final_word.length(); i > 0; i--){
            String word = final_word.substring(0,i);

            count = 0;

            for (String str1 : str) {
                if(str1.startsWith(word)){
                    count ++;
                }
            }
            
            if(count == str.length){
                return word;
            }   
            
        }
        return "";
}
}

    
