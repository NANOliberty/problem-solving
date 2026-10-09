def solution(answers):
    one = [1, 2, 3, 4, 5]
    two = [2, 1, 2, 3, 2, 4, 2, 5]
    three = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    
    rate = [0, 0, 0]
    
    for i in range(len(answers)):
        if one[i % len(one)] == answers[i]:
            rate[0] += 1
        if two[i % len(two)] == answers[i]:
            rate[1] += 1  
        if three[i % len(three)] == answers[i]:
            rate[2] += 1
            
    max_value = max(rate)
    
    result = []
    for i in range(len(rate)):
        if rate[i] == max_value:
            result.append(i + 1)
            
    return result