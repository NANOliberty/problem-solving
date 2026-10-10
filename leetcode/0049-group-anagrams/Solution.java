class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String s = String.valueOf(charArray);

            if (map.containsKey(s)) map.get(s).add(strs[i]);
            else {
                map.put(s, new ArrayList<>());
                map.get(s).add(strs[i]);
            }
        }
        
        List<List<String>> answer = new ArrayList<>(map.values());
        return answer;
    }
}