
public class Video extends Playlisturi{
	private int pret;

	public Video(String titlu, int dimensiune, int pret) {
        super(titlu,dimensiune);
        this.pret = pret;
    }


   
    public void print() {
        System.out.println("Pretul este de: " + this.pret);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.calculeazadimensiuneatotalaVideo(this);
    }

}
