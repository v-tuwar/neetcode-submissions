class Solution {
    public String encode(List<String> strs) {
        StringBuilder en=new StringBuilder();
        for(String s:strs){
            en.append(s.length());
            en.append('#');
            en.append(s);
        }
        return en.toString();
    }
    public List<String> decode(String str) {
        List <String> res=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            String num=str.substring(i,j);
            int len=Integer.parseInt(num);
            res.add(str.substring(j+1,j+1+len));
            i=j+1+len;
        }
        return res;
    }
}
