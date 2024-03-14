/**
 * F
 * @author zollino andrea
 * <U> IV AI</U>
 *<C>14|03|2024</C>
 *
 */
public class Verifica {
	public Verifica() {
	}
/**
 * 
 * @param s primo indice
 * @param f secondo indice
 * @return r un valore al momento nullo 
 */
	/**
	 * la classe ZollinoMet consiscte in un calcolatore di produttoria di un certo range di numeri
	 * 
	 */
	public int ZollinoMet(int s, int f) {
		int r = 0;
		
		for (int i = 1; i < f; i++) {
			r = r + r;
		}
		return r;
	}
/**
 * Verifica del funzionamento della classe
 */
	public static void main(String[] args) {
		Verifica q= new Verifica();
		System.out.println(q.ZollinoMet(2,3));
	}
}
