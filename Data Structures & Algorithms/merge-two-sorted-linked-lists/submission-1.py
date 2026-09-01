# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        l1 = list1
        l2 = list2
        value_arr = []
        while l1:
            value_arr.append(l1.val)
            l1 = l1.next
        while l2:
            value_arr.append(l2.val)
            l2 = l2.next
        
        value_arr.sort()
        if len(value_arr) == 0:
            return None
        head = ListNode(value_arr[0])
        current = head
        for value in value_arr[1:]:
            current.next = ListNode(value)
            current = current.next
        return head


        