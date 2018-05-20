<?php         
    // WSDL-URL_Adresse 
    $client = new SoapClient("http://localhost:1234/ComputationService?wsdl");

    // Web Service Call
    $result1 = $client->getAlbum("Bonez");
    $result2 = $client->getAlbum("Sampler");
    $result3 = $client->getPrice("Sampler");
    $result4 = $client->getPrice("Bonez");
    $result5 = $client->buyAlbum("Sampler" ,"Sampler Mit den Jungs, Sampler Zeit / High");
    $result6 = $client->buyAlbum("Bonez", "Milliadär);

	echo $result1;
	echo "<br />";
	echo "<br />";
    echo $result2;
    echo "<br />";
	echo "<br />";
    echo $result3;
	echo "<br />";
	echo "<br />";
    echo $result4;
    echo "<br />";
	echo "<br />";
    echo $result5;
	echo "<br />";
	echo "<br />";
    echo $result6;

?>