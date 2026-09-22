def solution(N, stages):
    answer = []
    n = 0
    
    for i in range(1, N+1) :
        for s in stages :
            if (s >= i) :
                n += 1
        if n == 0 :
            answer.append([i, 0])
        else :
            fail_rate = stages.count(i) / n
            answer.append([i, fail_rate])
        n = 0
        
    answer.sort(key = lambda x : -x[1])
    answer_list = [x[0] for x in answer]
    
    return answer_list