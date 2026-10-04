import heapq
def solution(scoville, K):
    heapq.heapify(scoville)
    
    answer = 0
    while (scoville[0] < K) :
        if (len(scoville) < 2) :
            return -1
        
        first = heapq.heappop(scoville)
        second = heapq.heappop(scoville)
        mix = first + second * 2
        heapq.heappush(scoville, mix)
        answer += 1
    
    for i in scoville :
        if i < K :
            return -1
        
    return answer