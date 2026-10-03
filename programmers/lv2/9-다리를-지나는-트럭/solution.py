from collections import deque
def solution(bridge_length, weight, truck_weights):
    bridge = deque([0] * bridge_length)
    wait = deque(truck_weights)
    
    time = 0
    sum = 0
    while bridge :
        time += 1
        sum -= bridge.popleft()
            
        if wait :
            current = wait[0]
            if (sum + current) <= weight :
                passing = wait.popleft()
                bridge.append(passing)
                sum += passing
            else :
                bridge.append(0)
            
    return time