from collections import deque
begin = "aab"
target = "aba"
words = ["abb", "aba"]

def bfs(start, end):
    n = len(graph)
    visited = [False] * n
    d = [0] * n

    queue = deque([start])
    visited[start] = True

    while queue:
        node = queue.popleft()
        for neighbor in range(n):
            if graph[node][neighbor] == 1 and not visited[neighbor]:
                d[neighbor] = d[node] + 1
                visited[neighbor] = True
                queue.append(neighbor)

                if neighbor == end:
                    return d[neighbor]
    return 0


def solution(begin, target, words):
    words.append(begin)
    if target not in words:
        return 0
    global n 
    n = len(words)
    strLen = len(words[0])
    global graph 
    graph = [[0 for _ in range(n)] for _ in range(n)]
    for i in range(n):
        for j in range(n):
            if i == j or graph[i][j] == 1:
                graph[i][j] = 1
                continue
            s1 = words[i]
            s2 = words[j]
            cnt = 0
            for x in range(strLen):
                if s1[x] == s2[x]:
                    cnt += 1
            if cnt >= strLen - 1:
                graph[i][j] = 1
                graph[j][i] = 1
      
    
    result = bfs(words.index(begin),words.index(target))        
    return result


solution(begin, target, words)