/**
 * This interface represents a media player that can play audio files of different types.
 */
public interface IMediaPlayer {
    
    /**
     * Plays the audio file with the given audio type and file name.
     * @param audioType The type of the audio file.
     * @param fileName The name of the audio file.
     */
    public void play(String audioType, String fileName);

    /**
     * Sets the media adapter for the media player.
     * @param mediaAdapter The media adapter to be set.
     */
    public void setMediaAdapter(IMediaAdapter mediaAdapter);

}
