<?php
require_once("Payment.php");
class Cash extends Payment{
    public $idCash;

    public function __construct($id, $idCash){
        parent::__construct($id);
        $this->idCash = $idCash;
    }
}
?>