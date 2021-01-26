class Main{
   public static void main(String[] args) {
       System.out.println("Hola mundo");
       Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
       car.passegenger = 4;
       car.printDataCar();

       Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876"));
       car2.passegenger = 3;
       car2.printDataCar();

       System.out.println("Account");

       User user = new User("César Augusto", "QWE789");
       user.printDataUser();

       Driver driver = new Driver("Gabriel", "ASR754");
       driver.printDataDriver();
   } 
}