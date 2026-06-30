class Solution {
    public boolean isAnagram(String s, String t) {
        int m=s.length()-1;
        int n=t.length()-1;
        if(m!=n){
            return false;
        }
        int []count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int num:count){
            if(num!=0){
                return false;
            }
        }
        return true;
    }
}
