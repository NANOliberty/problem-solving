def solution(participant, completion):
    participant.sort() # 시간복잡도를 줄이기 위해 정렬
    completion.sort()
    for i in range(len(participant)) :
        if i >= len(completion) :
            return participant[i]
        if participant[i] != completion[i] :
            return participant[i]