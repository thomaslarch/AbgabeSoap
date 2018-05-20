
public class Client {

	// to get stub execute in src directory: wsimport -d ./ -keep -p gen http://localhost:1234/ComputationService?wsdl
	
	public static void main(String args[]) {
		// get reference to remote service
		gen.ComputationService service = new gen.ComputationServiceService().getComputationServicePort();
			
		float result1 = service.getPrice("Sampler");	//Funktion getPrice wird ausgefuehrt
		float result2 = service.getPrice("Bonez");
		
		String result3 = service.getAlbum("Sampler");	//Funktion getAlbum wird ausgefuehrt
		String result4 = service.getAlbum("Bonez");
		
		String result5 = service.buyAlbum("Sampler", "Sampler Mit den Jungs");	//Funktion buyAlbum wird ausgefuehrt
		
		String result7 = service.buyAlbum("Bonez", "Milliardär"); //Fehler wird absichtlich eingebunden
		
		//Ausgabe der Ergebnisse
		
		System.out.println("Result 1: " + result1 + "");
		System.out.println("Result 2: " + result2 + "");
		System.out.println("Result 3: " + result3);
		System.out.println("Result 4: " + result4);
		System.out.println("Result 5: " + result5);
		System.out.println("Result 6: " + result6);
		System.out.println("Result 7: " + result7);
		
		
	}
}
