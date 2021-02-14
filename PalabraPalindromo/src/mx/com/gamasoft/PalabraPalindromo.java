/**
 * 
 */
package mx.com.gamasoft;

/**
 * @author Cesar
 *
 */
public class PalabraPalindromo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sPalabra = "HolaaloH";
		
		int incremento = 0;
		int decremento = sPalabra.length()-1;
		boolean bError = false;

		while (incremento < decremento && !bError) {
			if (sPalabra.charAt(incremento) == sPalabra.charAt(decremento)) {
				incremento++;
				decremento--;
			} else {
				bError = true;
			}
		}

		if (!bError) {
			System.out.println("Es palindromo");
		} else {
			System.out.println("No es palindromo");
		}
	}
}