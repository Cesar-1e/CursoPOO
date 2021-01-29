class Main{
   public static void main(String[] args) {
       System.out.println("Hola mundo");
       UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Sonic");
       uberX.setPassenger(4);
       uberX.printDataCar();

       UberVan uberVan = new UberVan("FGH345", new Account("Andres Herrera", "AND123"));
       uberVan.setPassenger(6);
       uberVan.printDataCar();

       /*Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876"));
       car2.passegenger = 3;
       car2.printDataCar();

       System.out.println("Account");

       User user = new User("César Augusto", "QWE789");
       user.printDataUser();

       Driver driver = new Driver("Gabriel", "ASR754");
       driver.printDataDriver();*/
   } 
}