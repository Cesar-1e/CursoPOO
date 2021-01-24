public class Card extends Payment{
    public Integer idCard;
    public Integer number;
    public Integer cvv;
    public String date;

    public Card(Integer id, Integer idCard, Integer number, Integer cvv, String date){
        super(id);
        this.idCard = idCard;
        this.number = number;
        this.cvv = cvv;
        this.date = date;
    }
}
