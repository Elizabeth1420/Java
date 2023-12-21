import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//Option 3 to see library class
public class Library {
    private ArrayList<Song> songs = new ArrayList<Song>();
    public Library() {
        songs.add(new Song("Seigfried", "Frank Ocean", 489722473));
        songs.add(new Song("Unloyal", "Summer Walker", 775325502));
        songs.add(new Song("Show me Love", "Alicia Keys", 583043920));
        songs.add(new Song("Nzaza", "Asake", 938932092));
        songs.add(new Song("Stamina", "Tiwa Savage", 69532502));
        songs.add(new Song("Savior", "Kendrick Lamar", 895320982));
        songs.add(new Song("Me You I", "The Cavemen", 73589580));
        songs.add(new Song("Sunshine", "The Cavemen", 7354530));
        songs.add(new Song("Soon As I Get Home", "Faith Evans", 59304530));
        songs.add(new Song("Tonight", "Burna Boy", 13802530));
    }

    // Option 1 to add songs 
    public void addSongs() { // method to add songs in the library
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the song title?"); // priniting user input instructions 
        String songTitle = scanner.nextLine();

        System.out.println("What's the artist's name?");
        String artistName = scanner.nextLine();

        System.out.println("Playcount"); // generating a random playcount using random
        Random rand = new Random();
        int playCount = rand.nextInt(50000000);

        Song userSong = new Song(songTitle, artistName, playCount); //setting arraylist of artistname, song titile and playvpunt stpred in library 
        songs.add(userSong);


    }

    public void printSongs() { // printing out added songs
        for (Song printSongs : songs) {
            System.out.println(" song title: " + printSongs.getTitle() + ", artist name: " + printSongs.getArtist()
                    + ", streams: " + printSongs.getPlaycount());
        }
    }

    // Option 2 to remove songs 
    public void removeSong() { // method to remove songs from the library
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 to remove by song title or Enter 2 to remove by artist");
        int userInput = scanner.nextInt();
        scanner.nextLine();
        if (userInput == 1) {
            System.out.println("What is the name of the song title you'd like to remove?"); // user input (pressing 1)  to remove song title
                                                                                    
            String songTitle = scanner.nextLine();
            ArrayList<Song> removedSongs = removeSong(songTitle, true);
            printRemovedSongs(removedSongs); // printing out removed songs
        } else if (userInput == 2) {
            System.out.println("What is the name of the artist you'd like to remove?"); // user input (pressing 2) to remove artist
                                                                                    
            String songArtist = scanner.nextLine();
            ArrayList<Song> removedSongs = removeSong(songArtist, false); //going through arraylist to have the song user inputting removed from library
            printRemovedSongs(removedSongs); // printing out removed artist
        } else {
            System.out.println("Invalid input");
        }
    }

    public void printRemovedSongs(ArrayList<Song> removedSongs) { // print removed songs from the ArrayList
        for (Song removedSong : removedSongs) {
            System.out.println("You have sucessfully removed a song!");
            System.out.println("Removed song title: " + removedSong.getTitle() + ", artist name: "
                    + removedSong.getArtist() + ", streams: " + removedSong.getPlaycount());
            sleep(2);
        }
    }

    public ArrayList<Song> removeSong(String songToRemove, boolean isTitle) { // An ArrayList storing a String method and boolean of songToRemove & isTitle.
        ArrayList<Song> removedSongs = new ArrayList<Song>(); // ArrayList to pass removed songs from the Library then removed songs will be returned
        for (int i = songs.size() - 1; i >= 0; i--) {
            if (isTitle) {
                if (songs.get(i).getTitle().equals(songToRemove)) { // created an if loop to remove Title name (getTitle) from Library
                    Song tempRemoved = songs.remove(i);
                    removedSongs.add(tempRemoved);
                }
            } else {
                if (songs.get(i).getArtist().equals(songToRemove)) { // created an if loop to remove Artist name (getArtist) from Library
                    Song tempRemoved = songs.remove(i);
                    removedSongs.add(tempRemoved);
                }
            }
        }
        return removedSongs;
    }
    
    // print out the song removed from Library.
    public void sleep(int seconds) { // Sleep method allows there to be a second (2 seconds) of pause then it'll print       
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //  option 4 - getting song by playcount numbers
    public void playCount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a playcount of any song"); //user inputing a playcount number 
        int userInput = scanner.nextInt();
        scanner.nextLine();
        for (int i = songs.size() - 1; i >= 50000000; i--);
    } 
        // Option 4 
    public Song searchSongs() { // method to search for songs with the playcount from the library
        Scanner scanner = new Scanner(System.in);
        
        int userInput = scanner.nextInt();
        
        Song songToReturn = new Song(null, null, userInput); //returning songToReturn
        
        scanner.nextLine(); 

        for ( int i = 0; i < songs.size(); i++){ 
            if ( songs.get(i).playCount == userInput){  //creating an if statement for inputing songs with that playcount 
                songToReturn.artistName = songs.get(i).artistName;
                songToReturn.songTitle = songs.get(i).songTitle;
                songToReturn.playCount = songs.get(i).playCount;
            }
        }
        return songToReturn;
    }

}