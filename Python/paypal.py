from payment import Payment

class Paypal(Payment):
    idPaypal = int
    email = str

    def __init__(self, id, idPaypal, email):
        super.__init__(id)
        self.idPaypal = idPaypal
        self.email = email