
public class Gifuri extends Playlisturi{
	private int durata;
	
	public Gifuri(String titlu, int dimensiune, int durata) {
        super(titlu, dimensiune);
        this.durata = durata;
    }
	
	public void print() {
        System.out.println("durata gif-ului este de: " + this.durata);
    }
	
	@Override
    public void accept(Visitor visitor) {
        visitor.calculeazadimensiuneatotalaGifuri(this);
    }

 
}
