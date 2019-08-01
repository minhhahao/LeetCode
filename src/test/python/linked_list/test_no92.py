import unittest

from src.main.python.leetcode_by_python.data_structure.ListNode import makeListNode, printListNode, isListNodeEqual
from src.main.python.leetcode_by_python.linked_list.No92_Reverse_Linked_List_II import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def test(self):
        head = makeListNode([1, 2, 3, 4, 5])
        expected = makeListNode([1, 4, 3, 2, 5])
        res = self.solution.reverseBetween(head, 2, 4)
        printListNode(res)
        self.assertTrue(isListNodeEqual(expected, res))


if __name__ == '__main__':
    unittest.main()
