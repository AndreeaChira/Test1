
public class Melodii extends Playlisturi {
	private int an;
	
	
	public Melodii(String titlu, int dimensiune, int an) {
        super(titlu, dimensiune);
        this.an = an;
    }

	public void print() {
        System.out.println("Anul de lansare al melodiei este: " + this.an);
    }
	
	@Override
    public void accept(Visitor visitor) {
        visitor.calculeazadimensiuneatotalaMelodii(this);
    }
}
