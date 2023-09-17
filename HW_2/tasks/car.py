from vehicle import Vehicle


class Car(Vehicle):
    def __init__(self, company, model, year):
        self.company = company
        self.model = model
        self.yearRelease = year
        self.numWheels = 4
        self.speed = 0

    def testDrive(self):
        self.speed = 60

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
        return "yearRelease"
