from car import Car

class UberBlack(Car):
    typeCarAccepted = []
    seatsMaterial = []

    def __init__(self, license, driver, typerCarAccepted, seatsMaterial):
        super.__init__(license, driver)
        self.typeCarAccepted = typerCarAccepted
        self.seatsMaterial = seatsMaterial