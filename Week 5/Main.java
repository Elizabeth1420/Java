import java.util.Scanner; //import Scanner Class for userinput 

public class Main {
    public static void main(String[] args) {
    //User Input
    Library getLibrary = new Library(); 
    Scanner scanner = new Scanner(System.in); 
    System.out.println("Welcome to Spotify!"); // introduction
    int userInput; //userinput can be accessed outside of do while loop 
    do { 
      //System.out.println("What would you like to do?");
      System.out.println("Enter 1 to add a song \n" //introduction for userinput 
        + "Enter 2 to remove a song \n" 
        + "Enter 3 to see library \n" 
        + "Enter 4 to get song by playcount \n"
        + "Enter 5 to to cancel program"); 
      userInput = scanner.nextInt(); 
      Song song;
        // String userInput; 
        switch (userInput) {
          case 1: 
            getLibrary.addSongs(); 
            System.out.println("Your song has now been added, please enter 3 to view added song in the library!");break;
          case 2: 
            System.out.println("Hey, you'd like to remove songs!");
            getLibrary.removeSong();
            break; 
          case 3:
            System.out.println("Here's the library:");
            getLibrary.printSongs();break; 
          case 4:
            System.out.println("Enter a playcount number!");
            song = getLibrary.searchSongs();
            if (song.artistName != null) { // if the playcount matches the artist name, it'll get that song with playcount 
              System.out.println("song title: " + song.songTitle + ", artist name: " + song.artistName //printing song with that particular playcount 
              + ", streams: " + song.playCount);
            } else {
            System.out.println("cannot find song");
            }
            break;
          case 5: 
            System.out.println("You have now canceled the program!");
            System.out.println("Welcome to Spotify!"); 
        } 
          } while (userInput != 4); // can't input any number higher than 4
  }
}


