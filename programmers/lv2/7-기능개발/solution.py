from collections import deque
import math
def solution(progresses, speeds):
    rates = [0 for _ in range(len(speeds))]
    for i in range(len(speeds)) :
        rates[i] = math.ceil((100.0 - progresses[i]) / speeds[i])
    dq = deque(rates)
    
    answer = []
    while dq :
        std = dq.popleft()
        count = 1
        
        while dq and std >= dq[0] :
            dq.popleft()
            count += 1
        answer.append(count)
    return answer