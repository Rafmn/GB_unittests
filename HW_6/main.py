from diff_lists import DiffLists


lst1 = DiffLists()
lst2 = DiffLists()
lst1.setListOne([1, 3, 7, 8])
lst2.setListTwo([2, 5, 7, 2, 7])
result = DiffLists()
result.diff_lists()
