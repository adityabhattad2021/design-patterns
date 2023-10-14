
/**
 * The App class contains the main method which demonstrates the usage of the IMediaPlayer interface and its implementations.
 */
public class App {

    public static void main(String[] args) throws Exception {
        
        IMediaPlayer audioPlayer = new AudioPlayer();
        
        audioPlayer.setMediaAdapter(new MediaAdapter());
        
        System.out.println("Using MediaAdapter");
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");

        audioPlayer.setMediaAdapter(new MediaAdapter1());
        System.out.println("Using MediaAdapter1");

        audioPlayer.play("avi", "mind me.avi");

    }
}
