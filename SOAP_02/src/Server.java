


import javax.swing.JOptionPane;
import javax.xml.ws.Endpoint;

public class Server {

	public static void main(String[] args) {
		
		// Service wird über einen Endpoint veröffentlicht
		Endpoint endpoint = Endpoint.publish("http://localhost:1234/ComputationService", new ComputationService());
		
		// warten auf Termination, Abfrage ob der Server beendet werden soll
		JOptionPane.showMessageDialog( null, "Kill Server?" );
		
		// Der Endpoint wird heruntergefahren
		endpoint.stop();
		
	}
}
