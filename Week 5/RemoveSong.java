import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner; 

public class RemoveSong {
     private ArrayList<String> songs; 
     
     public RemoveSong(ArrayList<String> newSong) {

        songs = newSong;
     }



    
    public ArrayList<String> removeSong (String songToRemove) { //remove songs
        
        int count = 0;
         ArrayList<String> Songs = new ArrayList<String>();
        songs.remove(new Song ("Seigfried, ", "Frank Ocean, ", 48972473));
        songs.remove(new Song ("Unloyal, ", "Summer Walker, ", 77532502));  
        songs.remove(new Song ("Show me Love, ", "Alicia Keys, ", 583043920)); 
        songs.remove(new Song ("Nzaza, ", "Asake, ", 938932092));
        songs.remove(new Song ("Stamina, ", "Tiwa Savage, ", 69532502)); 
        songs.remove(new Song ("Savior, ", "Kendrick Lamar, ", 895320982));
        songs.remove(new Song ("Me You I, ", "The Cavemen, ", 73589580));   
   


        for( int i = songs.size() -1; i >= 0; i--) 
        {
            if(songs.get(i).indexOf(songToRemove) != -1)
                {
                   String tempRemoved = songs.remove(i);
                   Songs.add(tempRemoved);
                    count++;
                }
        }
        return Songs;

    } 
    public void removeSong() {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("What is the name of the song title you'd like to remove?");
        String songTitle = scanner.nextLine(); 

        System.out.println("What's the artist's name you'd like to remove?");
        String artistName = scanner.nextLine(); 

        System.out.println("Playcount" ); //generating a random playcount using random
        Random rand = new Random();
        int playCount = rand.nextInt(50000000); 
        

        Song userSong = new Song(songTitle, artistName, playCount); 
        songs.remove(userSong);
    }


        public void removeSongs() {
            //for (Song removeSongs:songs) { 
            System.out.println( "The song has now been removed!"); 
            
       
       
        }
    }

