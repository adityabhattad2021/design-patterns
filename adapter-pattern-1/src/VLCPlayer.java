public class VLCPlayer implements IAdvancedMediaPlayer{
    
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }
    
    public void playMp4(String fileName) {
        throw new UnsupportedOperationException();
    }

}
