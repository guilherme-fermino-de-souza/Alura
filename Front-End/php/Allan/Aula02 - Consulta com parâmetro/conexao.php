<?php 

    $servidor = "localhost";
    $banco = "bdCinema";
    $usuario = "root";
    $senha = "";
    
    $conn = new PDO("mysql:host=$servidor;dbname=$banco",$usuario,$senha);
    
?>
