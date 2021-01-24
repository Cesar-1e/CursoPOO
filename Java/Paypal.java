public class Paypal extends Payment{
    public Integer idPaypal;
    public String email;

    public Paypal(Integer id, Integer idPaypal, String email){
        super(id);
        this.idPaypal = idPaypal;
        this.email = email;
    }
}
