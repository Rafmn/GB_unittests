import unittest
from unittest.mock import patch
from bookService import BookService

class TestBook(unittest.TestCase):
    @patch('bookRepository.BookRepository')
    def test_book(self, mock_book):
        self.book_service = BookService(mock_book)
        book_id = 3
        self.book_service.get_id_book(book_id)
        self.book_service.get_all_books()
