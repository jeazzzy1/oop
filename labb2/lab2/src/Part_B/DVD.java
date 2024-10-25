package Part_B;

public class DVD extends LibraryItem {
    private int TimeOfVideo;

    public DVD(String title, String author, int year, int TimeOfVideo) {
        super(title, author, year);
        this.TimeOfVideo = TimeOfVideo;
    }

    public int getTimeOfVideo() {
        return TimeOfVideo;
    }

    public void setTimeOfVideo(int TimeOfVideo) {
        this.TimeOfVideo = TimeOfVideo;
    }

    public boolean forChildren() {
        return TimeOfVideo < 120;
    }

    @Override
    public String getItemType() {
        return "DVD";
    }

    @Override
    public String toString() {
        return super.toString() + ", Time of Video: " + TimeOfVideo + " minutes";
    }
}
