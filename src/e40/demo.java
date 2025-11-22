package e40;

public class demo {
    public static void main(String[] args) {
        MusicDownloader downloader =new MusicDownloader("Pink Pony Club",
                "Chappell Roan",
                "Midwest Princess",
                "https://www.spotify.com/pink-pony-club.mp3",
                2023
        );
        downloader.showFileLink("Pink Pony Club");
    }
}
