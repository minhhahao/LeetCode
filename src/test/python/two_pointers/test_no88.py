import unittest

from src.main.python.leetcode_by_python.two_pointers.No88_Merge_Sorted_Array import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def test(self):
        nums1 = [1, 2, 3, 0, 0, 0]
        nums2 = [2, 5, 6]
        self.solution.merge(nums1, 3, nums2, 3)
        assert nums1 == [1, 2, 2, 3, 5, 6]


if __name__ == '__main__':
    unittest.main()
