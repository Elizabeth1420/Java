import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner; 

public class Library {
    private ArrayList<Song> songs = new ArrayList<Song>();
    public Library () { 
     songs.add(new Song ("Seigfried, ", "Frank Ocean, ", 48972473));
     songs.add(new Song ("Unloyal, ", "Summer Walker, ", 77532502));  
     songs.add(new Song ("Show me Love, ", "Alicia Keys, ", 583043920)); 
     songs.add(new Song ("Nzaza, ", "Asake, ", 938932092));
     songs.add(new Song ("Stamina, ", "Tiwa Savage, ", 69532502)); 
     songs.add(new Song ("Savior, ", "Kendrick Lamar, ", 895320982));
     songs.add(new Song ("Me You I, ", "The Cavemen, ", 73589580));   

    
    }


    //Option 1 
    public void addSongs() {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("What is the song title?");
        String songTitle = scanner.nextLine(); 

        System.out.println("What's the artist's name?");
        String artistName = scanner.nextLine(); 

        System.out.println("Playcount" ); //generating a random playcount using random
        Random rand = new Random();
        int playCount = rand.nextInt(50000000); 
        

        Song userSong = new Song(songTitle, artistName, playCount); 
        songs.add(userSong); 
       // System.out.println("Here's the song : " + userSong.getInfo()); //printing out song



    }
     public void printSongs() { //adding songs
        for (Song printSongs:songs) {
        System.out.println( " song title: " + printSongs.getTitle() + " artist name: " + printSongs.getArtist() + " streams: " + printSongs.getPlaycount()); 

         }
    }

    ///////////////////////////////////////////////////////////////////////////////

   /*  public class Removesongs (ArrayList<String> removedSong) { 
        songs = removedSong; 
    }

    
    
    public ArrayList<String> removeSong (String songToRemove) { //remove songs
        
        int count = 0;
        ArrayList<String> removedSongs = new ArrayList<String>();

        for( int i = songs.size() -1; i >= 0; i--) {
            if(songs.get(i).indexOf(songToRemove) != -1)
                {
                   String tempRemoved = songs.remove();
                    count++;
                }
        }
        return removedSongs;




















      /* System.out.println("What is the song title?");
        String songTitle = scanner.nextLine(); 

        System.out.println("What's the artist's name?");
        String artistName = scanner.nextLine(); 

        System.out.println("Playcount" ); //generating a random playcount using random
        Random rand = new Random();
        int playCount = rand.nextInt(50000000); 
         */ 

      



         }
              