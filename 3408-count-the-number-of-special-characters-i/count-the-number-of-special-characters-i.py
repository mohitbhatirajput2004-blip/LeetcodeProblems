class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        ls = list(word)
        pt1 = 0
        pt2 = len(ls)-1
        newls = []
        while(pt1<len(ls)-1):
            if ord(ls[pt1]) - ord(ls[pt2]) == 32 or ord(ls[pt1]) - ord(ls[pt2]) == -32 :
                newls.append(ls[pt1].lower())
            pt2-=1
            if pt2 == pt1:
                pt1+=1
                pt2 = len(ls)-1
        print(newls)
        newset = set(newls)
        return len(newset)