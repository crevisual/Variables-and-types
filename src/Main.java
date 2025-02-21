public class Main{
    public static void main(String[] args) {
        
        MusicBox mbox = new MusicBox("S34TG65", 'Y', "Raindrops", "Misty", 
        "The path less traveled", "Country", "BZEE Music", "Rhythm Divine");

        System.out.println("Now playing the song");
        mbox.playSong(mbox.getSongID(), mbox.getPremiumSong(), 2);
        
        // --- TODO

        /* Repeat the above code to create another object  
         * Pass different parameters to the MusicBox constructor, but initialise premiumSong to N and when calling the
         * playSong method, pass ads parameter as just 1
         * 
         * 
        */
        MusicBox mbox2 = new MusicBox("1234567", 'N', "song_title", "song_artists",
                "song_Album", "song_genre", "song_producer", "song_label");

        System.out.println("Now playing the song");
        mbox.playSong(mbox2.getSongID(), mbox2.getPremiumSong(), 1);
        

    }
}




