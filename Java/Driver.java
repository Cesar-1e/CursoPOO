public class Driver extends Account{
    
    public Driver(String name, String document){
        super(name, document);
    }

    public void printDataDriver(){
        System.out.println("Name: " + super.name + " Document: " + super.document);
    }
}
