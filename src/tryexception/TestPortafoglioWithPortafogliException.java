package tryexception;

class Portafoglio3_0 {
	
	private int disponibilita = 0;
	
	/**
	 * 
	 * @param value
	 * @return la disponibilità ad operazione avvenuta
	 */
	public int versa(int value) {
		this.disponibilita += value;
		return this.disponibilita;
	}
	
	/**
	 * 
	 * @param value
	 * @return la disponibilità ad operazione avvenuta
	 * @throws PortafoglioException se la disponibilità è < della richiesta di 
	 * prelievo.
	 * 
	 */
	public int preleva(int value) throws PortafoglioException {
		if (this.disponibilita < value) 
			throw new PortafoglioException("Disponiblità: " + this.disponibilita 
					+ " < richiesta prelievo: " + value);
		
		this.disponibilita -= value;
		return this.disponibilita;
	}
	
	public int getDisponibilita() {
		return this.disponibilita;
	}
	
}

public class TestPortafoglioWithPortafogliException {
    	
	public static void main(String[] args) {
		
		Portafoglio3_0 portLucia = new Portafoglio3_0();
		
		portLucia.versa(400);
		try {
			portLucia.preleva(600);
		} catch (PortafoglioException e) {
			System.out.println("PortafoglioException: " + e.getMessage());
			
		}
		
		System.out.println("SONO QUI");
		
	}

}
