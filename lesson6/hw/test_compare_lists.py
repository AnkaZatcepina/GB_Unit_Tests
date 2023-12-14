import pytest
from compare_lists import CompareLists

FIRST_BIGGER = 'Первый список имеет большее среднее значение'
SECOND_BIGGER = 'Второй список имеет большее среднее значение'
EQUAL = 'Средние значения равны'

@pytest.fixture
def list_1():
    return [1, 1, 2, 2]

@pytest.fixture
def list_1_mixed():
    return [2, 1, 1, 2]

@pytest.fixture
def list_2():
    return [10, 10, 20, 20]


def test_first_bigger(list_2, list_1):
    compare = CompareLists(list_2, list_1)
    assert compare.compare_lists() == FIRST_BIGGER

def test_second_bigger(list_1, list_2):
    compare = CompareLists(list_1, list_2)
    assert compare.compare_lists() == SECOND_BIGGER

def test_equal(list_1, list_1_mixed):
    compare = CompareLists(list_1, list_1_mixed)
    assert compare.compare_lists() == EQUAL


