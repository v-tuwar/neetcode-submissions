class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        ArrayList<Integer> n=new ArrayList<>();
        for(int num:nums){
            if(!freq.containsKey(num)){
                freq.put(num,1);
            }
            else{
                freq.put(num,freq.get(num)+1);
            }
        }
        List<Map.Entry<Integer,Integer>>list=new ArrayList<>(freq.entrySet());
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=list.get(i).getKey();
        }
        return res;
    }
}
