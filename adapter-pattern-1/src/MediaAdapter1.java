public class MediaAdapter1 implements IMediaAdapter  {

    IAdvancedMediaPlayer mp4Player=new Mp4Player();
    IAdvancedMediaPlayer vlcPlayer=new VLCPlayer();
    AVIPlayer aviPlayer=new AVIPlayer();

    /**
     * This class acts as an adapter between the client and the media players.
     * It implements the MediaPlayer interface and uses the AdvancedMediaPlayer interface
     * to play different types of media files.
     * If the media type is not supported, it prints an error message.
     */
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            mp4Player.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("avi")) {
            aviPlayer.playAVI(fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }

}
