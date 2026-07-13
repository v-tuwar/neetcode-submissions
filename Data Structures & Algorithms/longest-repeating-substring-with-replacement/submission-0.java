class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int right=0;
        int count[]=new int[26];
        int window=0;
        int maxfreq=0;
        int rep=0;
        for(;right<s.length();right++){
            count[s.charAt(right)-'A']++;
            maxfreq=Math.max(maxfreq,count[s.charAt(right)-'A']);
            window=(right-left)+1;
            rep=window-maxfreq;
           while(rep>k){
                count[s.charAt(left)-'A']--;
                left++;
                window=right-left+1;
                rep=window-maxfreq;
            }
        }
        return window;
    }
}
