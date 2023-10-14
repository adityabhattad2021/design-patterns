public interface IMediaAdapter {
    
    /**
     * This interface defines the method to play media files of different types.
     * Implementing classes must provide an implementation for the play method.
     *
     * @param audioType the type of audio file to be played
     * @param fileName the name of the file to be played
     */
    public void play(String audioType, String fileName);

}
