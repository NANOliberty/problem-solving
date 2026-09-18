def solution(array, commands):
    answer = []
    for i in commands :
        sorted_array = sorted(array[i[0]-1:i[1]])
        print(sorted_array)
        answer.append(sorted_array[i[2]-1])
    return answer