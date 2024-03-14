/**
 * 
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
	/* il problema si trova nel fatto che non è r=0 oppure non moltiplicherà mai;
	 * nel for al posto di deve partire da s e finire a f-1;
	 * al posto di r=r+r bisogna fare r=r*i;
	*/
	public int ZollinoMet(int s, int f) {
		int r = 1;
		for (int i = s; i < f+1; i++) {
			r=r*i;
		}
		return r;
	}
/**
 * Verifica del funzionamento della classe
 */
	public static void main(String[] args) {
		Verifica q= new Verifica();
		System.out.println(q.ZollinoMet(5,7));
	}
}
