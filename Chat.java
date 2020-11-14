package TD7;

public class Chat extends Animal implements Bruit {
	
	public void seDeplacer (int x, int y) {
		super.seDeplacer(x,y) ;
		System.out.println("Je bouge, miaou !") ;
	}
	
	public void faireDuBruit() {
		System.out.println("Miaou !") ;
	}

	//changement à retirer
}
