class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<2){
            return s;

        }
        String LPS="";
        for(int i=0;i<s.length();i++){
        int low=i;
        int high=i;
        while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)){
            low--;
            high++;
        }
        String p=s.substring(low+1,high);
        if(p.length()>LPS.length()){
            LPS=p;
        }
        
        low=i;
        high=i+1;
        while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)){
            low--;
            high++;
        }
        p=s.substring(low+1,high);
            if(p.length()>LPS.length()){
                LPS=p;
            }
        }
        return LPS;


        
    }
}