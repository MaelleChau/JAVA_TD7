package TD7;

public abstract class Animal {

	private String nom ;
	private int abs ;
	private int ord ;
	
	
	public void seDeplacer (int x, int y) {
		abs+=x;
		ord+=y; 
	}
	

}
