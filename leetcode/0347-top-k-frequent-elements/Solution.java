class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i : nums) {
            hash.put(i, hash.getOrDefault(i, 0) + 1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hash.entrySet());
        list.sort((b, a) -> a.getValue() - b.getValue());

        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> entry = list.get(i);
            answer[i] = entry.getKey();
        }
        return answer;
    }
}