import unittest

class TestExamples(unittest.TestCase):

    # Метод setUp, который вызывается перед каждым тестовым методом
    def setUp(self):
        self.resource = [1, 2, 3] # Некоторый общий ресурс

    # Метод tearDown, который вызывается после каждого тестового метода
    def tearDown(self):
        self.resource = None

    # Пример пропуска теста
    @unittest.skip("demonstrating skipping")
    def test_nothing(self):
        self.fail("shouldn't happen")

    # Пример использования subTest
    # не прервётся выполнение метода, пройдут все тесты
    # удобно для циклов, когда каждая итерация является тестом
    def test_even(self):
        for i in range(0, 6):
            with self.subTest(i=i):
                self.assertEqual(i % 2, 0)

if __name__ == '__main__':
    unittest.main()