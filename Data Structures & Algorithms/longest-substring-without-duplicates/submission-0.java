class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> count=new HashSet<>();
        int left=0;
        int right=0;
        int ans=0;
        for(;right<s.length();right++){
            while(count.contains(s.charAt(right))){
                count.remove(s.charAt(left));
                left++;
            }
            count.add(s.charAt(right));
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}
