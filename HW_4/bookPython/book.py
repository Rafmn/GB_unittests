class Book():
    def __init__(self, id, title, author):
        self.id = id
        self.title = title
        self.author = author

    @property
    def id(self):
        return self.id
    
    @id.setter
    def id(self, id):
        self.id = id

    @property
    def title(self):
        return self.title
    
    @title.setter
    def title(self, title):
        self.title = title

    @property
    def author(self):
        return self.author

    @author.setter
    def author(self, author):
        self.author = author
    