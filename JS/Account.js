/*function Account(name, document){
    this.id;
    this.name = name;
    this.document = document;
    this.email;
    this.password;
}*/
class Account{
    constructor(name, document){
        this.id;
        this.name = name;
        this.document = document;
        this.email;
        this.password;
    }

    printDataAccount(){
        console.log("Name: " + this.name + " Document: " + this.document);
    }
}