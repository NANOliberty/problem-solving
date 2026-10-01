from collections import deque
def solution(priorities, location):
    queue = deque([(i, j) for i, j in enumerate(priorities)])
    
    answer = 0
    while queue :
        higher = False
        current = queue.popleft()
        for i in queue :
            if current[1] < i[1] :
                higher = True
                break;
        if (higher) :
            queue.append(current)
            continue
        else :
            answer += 1
        if (current[0] == location) :
            return answer