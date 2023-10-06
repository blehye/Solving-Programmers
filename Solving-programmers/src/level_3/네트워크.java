package level_3;

public class 네트워크 {
    public static boolean[] visited = null;

    public static void main(String[] args) {
        int n = 3;
        int[][] computers = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
        System.out.println(solution(n, computers));
    }

    private static int solution(int n, int[][] computers) {
        int result = 0;
        visited = new boolean[n];

        // 모든 컴퓨터 순회
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(n, computers, i);
                result++;
            }

        }
        return result;
    }

    public static void dfs(int n, int[][] computers, int i) {
        // 방문처리
        visited[i] = true;

        for (int j = 0; j < n; j++) {
            // 연결된 컴퓨터가 있다면 타고들어감
            if (computers[i][j] == 1 && !visited[j] && j != i) {
                dfs(n, computers, j);

            }
        }

    }

}
