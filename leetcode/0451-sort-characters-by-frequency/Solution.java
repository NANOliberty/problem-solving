class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        List<Map.Entry<Character, Integer>> enlist = new ArrayList<>(map.entrySet());
        enlist.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        StringBuilder sb = new StringBuilder();

        for (var e : enlist) {
            for (int i = 0; i < e.getValue(); i++)
                sb.append(e.getKey());
        }
        
        String answer = sb.toString();
        return answer;
    }
}