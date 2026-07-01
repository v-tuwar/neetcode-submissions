class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> freq=new HashMap<>();
        for(String s:strs){
            char []c=s.toCharArray();
            Arrays.sort(c);
            String key=new String(c);

            if(!freq.containsKey(key)){
                freq.put(key,new ArrayList<>());
            }
                freq.get(key).add(s); 
        } 
    return new ArrayList<>(freq.values());          
    }}
