import java.util.*;

class Solution {
    List<Integer>[] graph;
    boolean[] visited;

    public int solution(int n, int[][] wires) {
        int answer = n;
        for (int i = 0; i < wires.length; i++) {
            graph = new List[n + 1];
            for (int j = 1; j <= n; j++) graph[j] = new ArrayList<>();
            for (int j = 0; j < wires.length; j++) {
                if (j == i) continue;
                graph[wires[j][0]].add(wires[j][1]);
                graph[wires[j][1]].add(wires[j][0]);
            }
            visited = new boolean[n + 1];
            int cnt = dfs(1);
            answer = Math.min(answer, Math.abs(n - 2 * cnt));
        }
        return answer;
    }

    int dfs(int node) {
        visited[node] = true;
        int count = 1;
        for (int next : graph[node]) {
            if (!visited[next]) count += dfs(next);
        }
        return count;
    }
}