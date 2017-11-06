<!doctype html>
<html>
<head>
<title>Sconto</title>
</head>
<body>
<h2>Prezzo Scontato</h2>
<hr />
<?php
   $prezzoScont;
   $prezzo=$_POST["PrezzoFinale"];
   $quantita=$_POST["Quantita"];
   $sconti= array(10, 25, 50);
   $quant= array(10, 30, 50);
   $trovato=false;
   for($i=0;$i<3;$i++)
   {
         if($quantita<=$quant[$i]&& !$trovato)
		 {
			 $prezzoScont=$prezzo-($prezzo*$sconti[$i]/100);
			 $trovato=true;
		 }
   }
   echo $prezzoScont;
?>
</body>
</html>