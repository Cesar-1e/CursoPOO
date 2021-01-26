var car = new Car("AW456", new Account("Andres Herrera", "QWE458"));
car.passenger = 4;
car.printDataCar();

var uberX = new UberX("AW456", new Account("Andrea Herrera", "ANDA765"), "Chevrolet", "Spark");
uberX.passenger = 4;
uberX.printDataCar();

console.log("Account");

var user = new User("César Augusto", "ADS789");
user.printDataAccount();

var driver = new Driver("Gabriel", "AWE754");
driver.printDataAccount();