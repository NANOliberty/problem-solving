def solution(citations):
    citations.sort()
    n = len(citations)
    if citations[-1] == 0 : 
        return 0
    for i in range(n) :
        if citations[i] >= n - i and i <= citations[i] :
            return n - i;