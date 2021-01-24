<?php
require_once("Car.php");
require_once("Account.php");

$Car = new Car("ABC123", new Account("César Augusto", "EEE158"));
$Car->printDataCar();
?>