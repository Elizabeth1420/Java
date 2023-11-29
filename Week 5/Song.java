import java.util.ArrayList;

public class Song {        //created song class
    public String songTitle;
    public String artistName; 
    public int playCount;

    public Song (String songTitle, String artistName, int playCount){
        this.songTitle = songTitle;
        this.artistName = artistName; 
        this.playCount = playCount;
    }

    /*ArrayList<Song> songs = new ArrayList<Song>();
   public Song () { 
    songs.add(new Song ("Seigfried", "Frank Ocean", 48972473)); 
   } */ 

    /*public void addSong() {
         Song songToAdd = new Song(this.songTitle, this.artistName, this.playCount);
         Songs.add(songToAdd);
    }*/ 

    public String getTitle() { 
        return songTitle;
    }

    public String getArtist() {
        return artistName; 
    }

    public int getPlaycount () {
        return playCount; 
    }


    /*public void printSongTitle() {
        for (Song s : songs) {
            System.out.println(s.songTitle);
        }
    }*/

    // public void printSongs() {
    //     ArrayList<String> songs = new ArrayList<String>();
    //     songs.add("Seigfried"); 
    // }

    public String getInfo() {
        return songTitle + " " +  artistName + " " + playCount; 
    }
}

