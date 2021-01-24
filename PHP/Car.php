<?php
require_once("Account.php");
class Car{
    public $id;
    public $license;
    public $driver;
    public $passenger;

    public function __construct($license, Account $driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCar(){
        echo "License: " . $this->license . " Driver: " . $this->driver->name . " Document: " . $this->driver->document;
    }
}
?>