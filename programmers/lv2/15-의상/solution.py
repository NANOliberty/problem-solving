def solution(clothes):
    dict = {}
    for i in clothes :
        dict[i[1]] = dict.get(i[1], 0) + 1
    answer = 1
    for i in dict.values() :
        answer *= (i + 1)
    return answer - 1