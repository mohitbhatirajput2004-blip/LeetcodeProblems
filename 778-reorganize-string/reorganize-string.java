class Solution {
    public String reorganizeString(String s) {
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->(b.count-a.count));
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char cc=s.charAt(i);
            map.put(cc,map.getOrDefault(cc,0)+1);
        }
        for(char c:map.keySet()){
            pq.add(new Pair(map.get(c),c));
        }
        StringBuilder sb=new StringBuilder();
        while(pq.size()>0){
            Pair maxElem=pq.poll();
            if(sb.length()>0 && sb.charAt(sb.length()-1)==maxElem.c){
                if(pq.size()==0){
                    break;
                }
                Pair secTop=pq.poll();
                sb.append(secTop.c);
                secTop.count--;
                if(secTop.count>0){
                    pq.add(secTop);
                }
            }else{
                sb.append(maxElem.c);
                maxElem.count--;
            }
            if(maxElem.count>0)
            pq.add(maxElem);
        }
        if(sb.length()==s.length()) return sb.toString();
        return "";
    }
}
class Pair{
    int count;
    char c;
    Pair(int count,char c){
        this.count=count;
        this.c=c;
    }
}