/**
 * The IAdvancedMediaPlayer interface provides methods to play VLC and MP4 files.
 */
public interface IAdvancedMediaPlayer {
    
    /**
     * Plays a VLC file with the given file name.
     * @param fileName the name of the VLC file to be played
     */
    public void playVlc(String fileName);
    
    /**
     * Plays an MP4 file with the given file name.
     * @param fileName the name of the MP4 file to be played
     */
    public void playMp4(String fileName);

}
