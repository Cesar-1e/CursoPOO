from payment import Payment

class Card(Payment):
    idCard = int
    number = int
    cvv = int
    date = str

    def __init__(self, id, idCard, number, cvv, date):
        super.__init__(id)
        self.idCard = idCard
        self.number = number
        self.cvv = cvv
        self.date = date