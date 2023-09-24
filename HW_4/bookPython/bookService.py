from bookRepository import BookRepository

class BookService():
    def __init__(self, rep_book: BookRepository):
        self._rep_book = rep_book

    def get_id_book(self, id):
        return self._rep_book.get_book(id)
    
    def get_all_books(self):
        return self._rep_book.get_all()
    