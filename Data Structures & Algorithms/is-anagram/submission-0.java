class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) {
            return false;
        }
        HashMap<Character,Integer> hm = new HashMap<>();
        HashMap<Character,Integer> hm1 = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            System.out.println(s.charAt(i));
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
            hm1.put(t.charAt(i),hm1.getOrDefault(t.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer>e:hm.entrySet()) {
            char hmChar = e.getKey();
            if(hm1.containsKey(hmChar)){
                int hm1Value = hm1.get(hmChar);
                int hmValue = e.getValue();
                if(hm1Value != hmValue) {
                    System.out.print("inside ");
                    return false;

    
                } else {
                    continue;
                }
            } else {
                return false;
            }
        }
        return true;

    }
}
