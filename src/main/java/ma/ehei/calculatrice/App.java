0package ma.ehei.calculatrice;

public class App {
	public static void main(String[] args) {
    Calculatrice calcul = new Calculatrice();
    int result_add = calcul.add(5,5);
		System.out.println("Le résultat est : " + result_add);
		System.out.println(Calculatrice.add(5, 5));
		System.out.println(Calculatrice.mul(5, 5));
	}
}
