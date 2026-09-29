class Solution:
    def frequencySort(self, s: str) -> str:
        dic = {}
        for c in s :
            dic[c] = dic.get(c, 0) + 1
        
        sort_list = dict(sorted(dic.items(), key = lambda x : -x[1]))
        sort_dict = dict(sort_list)

        s = ''
        for key, value in sort_dict.items() :
            s += key * value

        return s