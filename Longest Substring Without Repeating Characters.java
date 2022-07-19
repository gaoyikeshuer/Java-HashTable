class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer>map = new HashMap <Character, Integer>();
       
        int start = 0;
        int length = 0;
        for (int i = 0; i< s.length(); i++){
                if(map.containsKey(s.charAt(i))){
               if(map.get(s.charAt(i))>=start){
                   start = map.get(s.charAt(i))+1;
               }
            }
            
            length = Math.max(length, i-start+1);
            map.put(s.charAt(i),i);
        
            
        }
       
      return length;
    }
}
