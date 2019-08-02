import unittest

from src.main.python.leetcode_by_python.backtracking.No93_Restore_IP_Addresses import Solution


class MyTestCase(unittest.TestCase):
    def setUp(self) -> None:
        self.solution = Solution()

    def test(self):
        expected = ["255.255.11.135", "255.255.111.35"]
        res = self.solution.restoreIpAddresses("25525511135")
        print(res)
        self.assertEqual(sorted(expected), sorted(res))


if __name__ == '__main__':
    unittest.main()
