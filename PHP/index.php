<?php
require_once("Car.php");
require_once("UberX.php");
require_once("UberPool.php");
require_once("Account.php");
require_once("User.php");
require_once("Driver.php");

$Car = new Car("ABC123", new Account("César Augusto", "EEE158"));
$Car->printDataCar();
echo "<br>";
$uberX = new UberX("CVB123", new Account("Andres Herrera", "AND456"), "Chevrolet", "Sparl");
$uberX->printDataCar();
echo "<br>";
$uberPool = new UberPool("TYU567", new Account("Andrea Herrera", "AND765"), "Dodge", "Attitude");
$uberPool->printDataCar();
echo "<br>Account<br>";
$user = new User("César Augusto", "ASD123");
$user->dataPrintAccount();
$driver = new Driver("Gabriel", "AWE458");
$driver->dataPrintAccount();



?>