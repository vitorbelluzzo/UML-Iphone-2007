import devices.Browser;
import devices.Handset;
import devices.MusicPlayer;

public class Iphone {
    public static void main (String[] args) {
        Browser Safari = new Browser();
        Handset Phone = new Handset();
        MusicPlayer Itunes = new MusicPlayer();

        Safari.addTab();
        Safari.refreshPage();
        Safari.showPage("google.com");

        Phone.call(1199999999);
        Phone.answer();
        Phone.startVoiceMail();

        Itunes.play();
        Itunes.pause();
        Itunes.selectSong("Birds of a feather - Billie Eilish");
    }
}