/**
 * The MediaAdapter class implements the IMediaAdapter interface and provides a way to play different types of media files.
 * It uses the Mp4Player and VLCPlayer classes to play mp4 and vlc files respectively.
 * If the media type is not supported, it prints an error message.
 */
public class MediaAdapter implements IMediaAdapter {

    IAdvancedMediaPlayer mp4Player = new Mp4Player();
    IAdvancedMediaPlayer vlcPlayer = new VLCPlayer();

    
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            mp4Player.playMp4(fileName);
        }else{
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
