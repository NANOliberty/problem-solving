class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for i in s :
            if i == '(' or i == '{' or i == '[' :
                stack.append(i)
            else :
                if not stack :
                    return False
                else :
                    top = stack.pop()
                    if (i == ')' and top != '(') :
                        return False 
                    if (i == '}' and top != '{') :
                        return False 
                    if (i == ']' and top != '[') :
                        return False   
        if not stack :
            return True
        else :
            return False