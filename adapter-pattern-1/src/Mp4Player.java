public class Mp4Player implements IAdvancedMediaPlayer {
    
    public void playVlc(String fileName) {
        throw new UnsupportedOperationException();
    }
    
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }

}
