'''Тестирование класса DiffLists'''
import pytest

from diff_lists import DiffLists


def test_diff_lists():
    '''Тестирование двух списков'''
    lst1 = [1, 3, 7, 8]
    lst2 = [2, 5, 7, 2, 7]
    lst3 = [3, 5, 6, 2]
    lst4 = [5, 6, 2, 3]
    result_1 = DiffLists(lst1, lst2)
    assert result_1.diff_lists() == 'Первый список имеет большее среднее значение', 'test filed'
    result_2 = DiffLists(lst3, lst2)
    assert result_2.diff_lists() == 'Второй список имеет большее среднее значение', 'test filed'
    result_3 = DiffLists(lst3, lst4)
    assert result_3.diff_lists() == 'Средние значения равны', 'test filed'

# def test_list_not_num():
#     '''Тестирование списка на корректность значений'''
#     lst1 = [1, 3, 7, 8]
#     lst5 = [3, 6, 'r']
#     result_4 = DiffLists(lst5, lst1)
#     with pytest.raises(ValueError):
#         result_4.diff_lists()


if __name__ == '__main__':
    # ['-v'] - для подробных выводов
    pytest.main(['-v'])
