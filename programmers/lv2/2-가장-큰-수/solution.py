def solution(numbers):
    str_numbers = [str(i) for i in numbers]
    str_numbers.sort(key=lambda x: x * 4, reverse=True)
    
    answer = ''.join(str_numbers)
        
    return answer if answer[0] != '0' else '0'