def solution(prices):
    answer = list(range(len(prices)-1, -1, -1))
    
    distance = 0
    
    for i in range(len(prices)) :
        for j in range(i+1, len(prices)) :
        # yes
            if prices[i] > prices[j] :
                answer[i] = j - i
                break
            
    return answer   
        # no