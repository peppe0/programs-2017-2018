<!doctype html>
<html>
<head>
<title>Sconto Articoli</title>
</head>
<body>
<?php
	$quantita=$_GET["quantita"];
	$prezzo=$_GET["prezzoFinale"];
	if($quantita<10)
	{
	  $prezzoFinale=$prezzo;
	}
	else if($quantita>=10 && $quantita<30)
	{
	  $PrezzoSconto=($prezzo*10)/100;
	  $prezzoFinale=$prezzo-$PrezzoSconto;
	}
	else if($quantita>=30 && $quantita<60)
	{
	  $PrezzoSconto=($prezzo*25)/100;
	  $prezzoFinale=$prezzo-$PrezzoSconto;
	}
        else if($quantita>=60 && $quantita<100)
	{
	  $PrezzoSconto=($prezzo*50)/100;
	  $prezzoFinale=$prezzo-$PrezzoSconto;
	}
        
        echo " Il prezzo scontato e':". $prezzoFinale;
?>
<br />
<br />
<table width="50%" border="1" align="left" bgcolor="#FFFFFF">
	<tr><td>Quantita'</td><td>Sconto</td></tr>
   	<tr><td>10</td><td>0%</td></tr>
    	<tr><td>DA 10 A 30</td><td>10%</td></tr>
    	<tr><td>DA 30 A 60</td><td>25%</td></tr>
	<tr><td>DA 60 A 100</td><td>50%</td></tr>
</table>
</body>
</html>