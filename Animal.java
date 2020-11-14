package TD7;

public abstract class Animal {

	private String nom ;
	private Point point = new Point() ;
	
	public void seDeplacer (int x, int y) {
		point.translation(x,y) ;
	}
	

}
