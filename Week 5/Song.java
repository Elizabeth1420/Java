public class Song {  //created song class
    public String songTitle;
    public String artistName; 
    public int playCount;

    public Song (String songTitle, String artistName, int playCount){ //created a arraylist for the song title, artist namr and playcount in library
        this.songTitle = songTitle;
        this.artistName = artistName; 
        this.playCount = playCount;
    }

    //returning title, artist name and playcount
    public String getTitle() { 
        return songTitle;
    }

    public String getArtist() {
        return artistName; 
    }

    public int getPlaycount () {
        return playCount; 
    }


    public String getInfo() {
        return songTitle + " " +  artistName + " " + playCount; 
    }
}

