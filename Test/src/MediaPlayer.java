import java.util.ArrayList;

public class MediaPlayer implements Element {
	private String numePlaylist;
    private ArrayList<Element> elements;

    public MediaPlayer() {
        this.numePlaylist = "";
        this.elements = new ArrayList<Element>();
    }

    public MediaPlayer(String numePlaylist) {
        this.numePlaylist = numePlaylist;
        this.elements = new ArrayList<Element>();
    }

    public MediaPlayer(String numePlaylist, ArrayList<Element> elements) {
        this.numePlaylist = numePlaylist;
        this.elements = elements;
    }

    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public void print() {
        System.out.println("Box " + this.numePlaylist);
        if (elements != null) {
            for (Element i: elements)
                i.print();
        }
    }

}



	


