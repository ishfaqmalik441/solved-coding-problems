class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        merged_str = ""
        len_1 = len(word1)
        len_2 = len(word2)
        i = j = 0

        if len_1 >= len_2:
            while j < len(word2):
                merged_str += word1[i]
                merged_str += word2[j]
                i += 1
                j += 1
            merged_str += word1[i:]
        else:
            while i < len(word1):
                merged_str += word1[i]
                merged_str += word2[j]
                i += 1
                j += 1
            merged_str += word2[j:]
        return merged_str
        