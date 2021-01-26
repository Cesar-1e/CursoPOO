from car import Car
from account import Account
from user import User
from driver import Driver

if __name__ == "__main__":
    print("Hola mundo")
    car = Car("AMS234", Account("Andres Herrera", "ANDA876"))
    print(vars(car))
    print(vars(car.driver))
    print("Account")
    user = User("Cesar Augusto", "QWE789")
    print(vars(user))
    driver = Driver("Gabriel", "ASD421")
    print(vars(driver))
    