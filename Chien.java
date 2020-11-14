package TD7;

public class Chien extends Animal implements Bruit {
	
	public void seDeplacer (int x, int y) {
		// TODO Auto-generated method stub
		super.seDeplacer(x,y) ;
		System.out.println("Je bouge, wouf !") ;
	}
	
	public void faireDuBruit() {
		System.out.println("Wouf !") ;
	}

}
