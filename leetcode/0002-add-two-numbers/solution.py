# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: ListNode | None, l2: ListNode | None) -> ListNode | None:
        answer = ListNode(0)
        head = answer # Start Node to return the answer
        carry = 0

        while l1 is not None or l2 is not None or carry > 0 :
            val1 = l1.val if l1 else 0
            val2 = l2.val if l2 else 0

            sum_val = val1 + val2 + carry
            carry = sum_val // 10
            digit = sum_val % 10

            answer.next = ListNode(digit)
            answer = answer.next

            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next

        return head.next # Return the next of head because head is a dummy node with value 0