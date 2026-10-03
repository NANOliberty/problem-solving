def solution(genres, plays):
    genre_dict = {}
    genre_list = []
    answer = []
    
    for i in range(len(genres)) :
        genre_dict[genres[i]] = genre_dict.get(genres[i], 0) + plays[i]
    for i in genre_dict :
        genre_list.append([i, genre_dict.get(i)])
    genre_list.sort(key = lambda x : (x[1]), reverse = True)
    
    plays_dict = {}
    for i in genre_list :
        if i[0] not in plays_dict:
            plays_dict[i[0]] = []
            
        for j in range(len(genres)) :
            if i[0] == genres[j] :
                plays_dict[i[0]].append([j, plays[j]])
    
    for i in plays_dict.values() :
        i.sort(key = lambda x : x[1], reverse = True)

    for i in plays_dict.keys() :
        answer.append(plays_dict.get(i)[0][0])
        if len(plays_dict.get(i)) >= 2 :
            answer.append(plays_dict.get(i)[1][0])
            
    return answer

'''
[['pop', 3100], ['classic', 1450]]
{'pop': [[4, 2500], [1, 600]], 'classic': [[3, 800], [0, 500], [2, 150]]}
'''