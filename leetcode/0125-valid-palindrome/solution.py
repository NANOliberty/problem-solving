class Solution:
    def isPalindrome(self, s: str) -> bool:
        answer = [c.lower() for c in s if c.isalnum()]

        if answer == answer[::-1] :
            return True
        else : 
            return False