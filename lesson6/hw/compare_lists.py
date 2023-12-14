"""List Comparison"""
from typing import List

class CompareLists:
    """Compare averages of two lists"""
    def __init__(self, list_1: List[float], list_2: List[float]) -> None:
        self.list_1 = list_1
        self.list_2 = list_2

    def calc_list_average(self, l: List[float]) -> float:
        """Calc list average"""    
        return sum(l) / len(l)

    def compare_lists(self) -> str:
        """Compare averages of two lists"""     
        average_1 = self.calc_list_average(self.list_1)
        average_2 = self.calc_list_average(self.list_2)
        if average_1 > average_2:
            return 'Первый список имеет большее среднее значение'
        if average_2 > average_1:
            return 'Второй список имеет большее среднее значение'
        return 'Средние значения равны'


