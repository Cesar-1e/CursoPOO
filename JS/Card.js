class Card extends Payment{
    constructor(id, idCard, number, cvv, date){
        super(id);
        this.idCard = idCard;
        this.number = number;
        this.cvv = cvv;
        this.date = date;
    }
}