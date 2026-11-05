class Solution {
    int[] picked;
    int r;
    int[] temp;
    List<List<Integer>> answer = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        picked = new int[k];
        r = k;
        temp = new int[n];
        for (int i = 0; i < temp.length; i++) temp[i] = i + 1;
        comb(0, 0);

        return answer;
    }

    void comb(int start, int depth) {
        if (depth == r) {
            List<Integer> sub = Arrays.stream(picked).boxed().toList();
            answer.add(sub);
            return;
        }
        for (int i = start; i < temp.length; i++) {
            picked[depth] = temp[i];
            comb(i + 1, depth + 1);
        }
    }

}