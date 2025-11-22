package e40;

public class MusicDownloader {
    // 私有变量
    private String songName;
    private String artistName;
    private String album;
    private String fileLink;
    private int releaseYear;

    public void showFileLink(String songName) {
        if (this.songName.equalsIgnoreCase(songName)) {
            System.out.println("Link for " + songName + " is: " + fileLink);
        }
    }

    public MusicDownloader(String songName, String artistName, String album, String fileLink, int releaseYear) {
        this.songName = songName;
        this.artistName = artistName;
        this.album = album;
        this.fileLink = fileLink;
        this.releaseYear = releaseYear;
    }

}