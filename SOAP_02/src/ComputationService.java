import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


//Man muss @WebService angegeben damit man exportieren kann
@WebService(name = "ComputationService", targetNamespace = "http://localhost:1234/ComputationService")
//Es wird anggeben,dass Soap als Kommunikation genutzt wird und remote procedure call style ist
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class ComputationService {

		@WebMethod(operationName="getPrice") // Funktion getPrice wird erstellt
		@WebResult(name = "preisBandName")
		public float getPrice(@WebParam(name="bandName") String bandName)
		{
		
			float preis = 0;
			
			if(bandName.equals("Sampler"))
			{
				preis = 1500;
			}
			else if(bandName.equals("Bonez"))
			{
				preis = 2000;
			}
			return preis;
	    }
		@WebMethod(operationName="getAlbum") //Funktion getAlbum wird erstellt
		@WebResult(name = "album")
		public String getAlbum(@WebParam(name="artist") String artist)
		{
		
			// Die Alben und der dazugehörige Künstler wird übergeben
			
			String album = null;
			
			if(artist.equals("Sampler"))
			{
				album = "Sampler Mit den Jungs, Sampler Zeit / High";
			}
			else if(artist.equals("Bonez"))
			{
				album = "Millionär, 30er Zone";
			}
			return album;
	    }
		@WebMethod(operationName="buyAlbum") // Funktion buyAlbum wird erstellt
		@WebResult(name = "rechnung")
		public String buyAlbum(@WebParam(name="artist") String artist, @WebParam(name="album") String album)
		{
			//Es wird der Name des Künstlers angegeben und der des Albums und man erhält eine Art Rechnung
			String rechnung = null;
			
			if(artist.equals("Sampler") && album.equals("Sampler Mit den Jungs") || artist.equals("Sampler"))
			{
				rechnung = "Sie haben Sampler Mit den Jungs from Sampler für 15.00Euro gekauft";
			}
			else if(artist.equals("Sampler") && album.equals("Sampler Zeit / High"))
			{
				rechnung = "Sie haben Sampler Zeit / High from Sampler für 15.00Euro gekauft";
			}
			else if(artist.equals("Bonez") && album.equals("Millionär"))
			{
				rechnung = "Sie haben Millionär from Bonez für 10.00Euro gekauft";
			}
			else if(artist.equals("Bonez") && album.equals("30er Zone"))
			{
				rechnung = "Sie haben 30er Zone from Bonez für 10.00Euro gekauft";
			}
			else
			{
				rechnung = "Album ist nicht verfügbar";	// Falsche eingabe wird Fehler angezeigt
			}
			
			return rechnung;
	    }
}