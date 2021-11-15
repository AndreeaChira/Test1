
public abstract class Playlisturi implements Element{
	protected String titlu;
	private int dimensiune;
	
	public Playlisturi(String titlu, int dimensiune) {
        this.titlu = titlu;
        this.dimensiune = dimensiune;

     }

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public int getDimensiune() {
		return dimensiune;
	}

	public void setDimensiune(int dimensiune) {
		this.dimensiune = dimensiune;
	}

	
		
		
}	

