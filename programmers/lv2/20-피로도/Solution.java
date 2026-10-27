class Solution {
    boolean[] visited;
    int answer = 0;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, 0, dungeons);
        return answer;
    
    }
    
    void dfs(int k, int count, int[][] array) {
        answer = Math.max(answer, count);
        for (int i = 0; i < array.length; i++) {
            int need = array[i][0];
            int minus = array[i][1];
            if (!visited[i] && k >= need) {
                visited[i] = true;
                dfs(k - minus, count + 1, array);
                visited[i] = false;
            }
        }
        
    }
    
}