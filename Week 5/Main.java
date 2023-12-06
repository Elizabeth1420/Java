import java.util.Scanner; //import Scanner Class for userinput 
import java. util.Random; // import random number generator 

public class Main {
    public static void main(String[] args) {
    //User Input
    Library getLibrary = new Library(); 
    Scanner scanner = new Scanner(System.in); 
       
        System.out.println("Welcome to Spotify!"); //into 
      int userInput; //userinput can be accessed outside of do while loop 
        do{ 
        //System.out.println("What would you like to do?");
         

        System.out.println("Enter 1 to add a song \n" //introduction for userinput 
         + "Enter 2 to remove a song \n" 
         + "Enter 3 to see library \n" 
         + "Enter 4 to print streaming numbers \n" 
         + "Enter 5 to cancel program");
         userInput = scanner.nextInt(); 

        Song songs;
      
        // String userInput; 
       switch (userInput) 
        {
        case 1: getLibrary.addSongs();break; 
        case 2: 
        System.out.println("What song would you like to remove?");break;
        getLibrary.removeSong();break;
        case 3:
         System.out.println("Here's the library");
         getLibrary.printSongs();break; 
        case 4: System.out.println("Here's the streaming numbers");break; 
        case 5: System.out.println("You have now canceled the program!");
        System.out.println("Welcome to Spotify!"); 
        } 
      } while (userInput != 5); 
        
        /*option 1 
        System.out.println("What is the song title?");
        String userInputTitle = scanner.nextLine(); 

        System.out.println("What's the artist's name?");
        String userInputArtist = scanner.nextLine(); 

        System.out.println("Playcount" ); //generating a random playcount using random
        Random rand = new Random();
        int value = rand.nextInt(50000000); 
        

        Song userSong = new Song(userInputTitle, userInputArtist, value); 
        songs.add(userSong); 
        System.out.println("Here's the song : " + userSong.getInfo()); //printing out song
        */
    
      // option 3 - the library 
        //Song mySong = new Song("Good Morning Gorgeous ", "Mary J Blige ", value);  
        // Song mySong = new Song("Seigfried ", "Frank Ocean ", value);  
        // Song mySong = new Song("Good Morning Gorgeous ", "Mary J Blige ", value);  
        // mySong.print();

       /*String userInputString = scanner.nextLine(); */ 

    }

       //3rd option

       //4th option 

       //5th option 

   
    }


