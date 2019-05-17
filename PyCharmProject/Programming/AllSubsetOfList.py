
def subsets(l):
    set = [[]]
    if len(l)==0:
        return set


    for i in range(len(l)+1):
        for j in range(i+1,len(l)+1):
            set.append((l[i:j]))
    return set

# def subsets(s):
#     if s == []:
#         return [s]
#     sets = [s]
#     for i in range(0, len(s)):
#         tmp_subsets = subsets(s[:i] + s[i+1:])
#         for subset in tmp_subsets:
#             if subset not in sets:
#                 sets.append(subset)
#     return sets

l=[1,2,3,4]
j=subsets(l)
print(j)

# [[1, 2, 3, 4], [2, 3, 4], [3, 4], [4], [], [3], [2, 4], [2], [2, 3], [1, 3, 4], [1, 4], [1], [1, 3], [1, 2, 4], [1, 2], [1, 2, 3]]