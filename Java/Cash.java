public class Cash extends Payment{
    public Integer idCash;

    public Cash(Integer id, Integer idCash){
        super(id);
        this.idCash = idCash;
    }
}
