public class User extends Account{

    public User(String name, String document){
        super(name, document);
    }

    public void printDataUser(){
        System.out.println("Name: " + super.name + " Document: " + super.document);
    }
    
}
