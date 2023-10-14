
/**
 * The AudioPlayer class implements the IMediaPlayer interface and provides the ability to play audio files.
 * It checks the audio type and plays the file accordingly. If the audio type is not supported, it uses a media adapter to play the file.
 */
public class AudioPlayer implements IMediaPlayer {

    private IMediaAdapter mediaAdapter=null;
    
    /**
     * Plays the audio file with the given audio type and file name.
     * If the audio type is mp3, it plays the file directly.
     * If the audio type is not mp3, it uses a media adapter to play the file.
     * @param audioType The type of the audio file.
     * @param fileName The name of the audio file.
     */
    public void play(String audioType, String fileName)  {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else {
            if(mediaAdapter==null){
                System.out.println("Please setup the media adapter first");
                return;
            }
            mediaAdapter.play(audioType, fileName);
        }
    }

    /**
     * Sets the media adapter to be used for playing non-mp3 audio files.
     * @param mediaAdapter The media adapter to be used.
     */
    public void setMediaAdapter(IMediaAdapter mediaAdapter) {
        this.mediaAdapter = mediaAdapter;
    }

}
