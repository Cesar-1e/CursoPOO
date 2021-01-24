<?php
require_once("Payment.php");
class Paypal extends Payment{
    public $idPaypal;
    public $email;

    public function __construct($id, $idPaypal, $email){
        parent::__construct($id);
        $this->idPaypal = $idPaypal;
        $this->email = $email;
    }
}
?>