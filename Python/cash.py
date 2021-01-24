from payment import Payment

class Cash(Payment):
    idCash = int

    def __init__(self, id, idCash):
        super.__init__(id)
        self.idCash = idCash