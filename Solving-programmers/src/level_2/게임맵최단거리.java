package level_2;

import java.util.LinkedList;
import java.util.Queue;

public class 게임맵최단거리 {
    public static int[] dx = { 0, 0, 1, -1 };
    public static int[] dy = { -1, 1, 0, 0 };

    public static void main(String[] args) {
        int[][] map = { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1 }, { 0, 0, 0, 0, 1 } };
        System.out.println(solution(map));
    }

    private static int solution(int[][] maps) {
        int[][] visited = new int[maps.length][maps[0].length];

        // 처음 노드 방문 처리
        visited[0][0] = 1;

        // 너비 우선 탐색
        bfs(maps, visited);

        // 목적지의 visited 체크
        int result = visited[maps.length - 1][maps[0].length - 1];

        if (result == 0) {
            return -1;
        } else {
            return result;
        }
    }

    private static void bfs(int[][] maps, int[][] visited) {
        Queue<int[]> que = new LinkedList<>();

        // 처음 노드 큐에 넣기
        que.add(new int[] { 0, 0 });

        // 큐가 빌때까지
        while (!que.isEmpty()) {
            // 하나 꺼내서 4방 탐색
            int[] now = que.poll();
            int x = now[0];
            int y = now[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 범위 벗어나는지, 방문했는지, 갈수있는지 체크
                if (nx >= 0 && ny >= 0 && nx < maps.length && ny < maps[0].length && visited[nx][ny] == 0
                        && maps[nx][ny] == 1) {
                    // 방문처리
                    visited[nx][ny] = visited[x][y] + 1;

                    // 큐에 넣기
                    que.add(new int[] { nx, ny });

                }
            }
        }
        return;
    }

}
