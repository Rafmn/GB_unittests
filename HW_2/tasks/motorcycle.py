from vehicle import Vehicle


class Motorcycle(Vehicle):
    def __init__(self, company, model, year):
        self.company = company
        self.model = model
        self.yearRelease = year
        self.numWheels = 2
        self.speed = 0

    def testDrive(self):
        self.speed = 75

    def park(self):
        self.speed = 0

    def getCompany(self):
        return self.company

    def getModel(self):
        return self.model

    def getYearRelease(self):
        return self.yearRelease

    def getNumWheels(self):
        return self.numWheels

    def getSpeed(self):
        return self.speed

    def toString(self):
        return "This motorcycle is a " + self.yearRelease + " make " + self.model
    