'''Сравнение списков
'''
class DiffLists:
    '''Сравнение списков'''
    def __init__(self, lst1: list[int | float], lst2: list[int | float]):
        for item in lst1:
            if not isinstance(item, (int, float)):
                raise ValueError(f'Element {item} not int or float')
        self.list_one = lst1
        for item in lst2:
            if not isinstance(item, (int, float)):
                raise ValueError(f'Element {item} not int or float')
        self.list_two = lst2

    def diff_lists(self) -> str:
        '''Основной модуль сравнения'''
        average_one_list = sum(self.list_one) / len(self.list_one)
        average_two_list = sum(self.list_two) / len(self.list_two)
        if average_one_list > average_two_list:
            return 'Первый список имеет большее среднее значение'
        if average_one_list < average_two_list:
            return 'Второй список имеет большее среднее значение'
        return 'Средние значения равны'
