
class Solution {
    String[] vowels = {"A", "E", "I", "O", "U"};
    int count = 0;
    int answer = 0;

    public int solution(String word) {
        dfs("", word);
        return answer;
    }

    void dfs(String cur, String target) {
        if (cur.length() > 0) {
            count++;
            if (cur.equals(target)) {
                answer = count;
                return;
            }
        }
        if (cur.length() == 5) return;
        for (String v : vowels) {
            dfs(cur + v, target);
        }
    }
}