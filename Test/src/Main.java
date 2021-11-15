import java.util.ArrayList;

public class Main {
	 public static void main(String[] args) {
	
	MediaPlayer  playlist = new MediaPlayer("Media Player");

    ArrayList<Element> elements = new ArrayList<Element>();

    Video videoclip1 =  new Video("Video", 20, 10);
    Video videoclip2 =  new Video("Vide 1", 14, 7);

    Melodii melodie = new Melodii("Melodie 1", 10, 9 );
    Gifuri gif = new Gifuri("Gif 1", 8, 6);
    Playlisturi plst= new Playlisturi("Playlist 1",10);

    playlist.add(videoclip1);
    playlist.add(videoclip2);
    playlist.add(melodie);
    playlist.add(gif);
    playlist.add(plst);

    playlist.print();
	

}
}

