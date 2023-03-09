import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main{
    public static void main(String [] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        Scanner scan = new Scanner(System.in);
        File file = new File("C:/Users/s7522/Downloads/Warzone - Anno Domini Beats.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        String choice="";
        while (!choice.equals("Q")){
            System.out.println("Please enter your choice : ");
            System.out.println("P = play, S = stop , R = reset , Q = quit  ");
            choice=scan.next();
            choice=choice.toUpperCase();
            switch (choice){
                case ("P"):
                    clip.start();
                    break;
                case ("S"):
                    clip.stop();
                    break;
                case ("R"):
                    clip.setMicrosecondPosition(0);
                    break;
                case ("Q"):
                    clip.close();
                    break;
                default:
                    System.out.println("Not a valid response.");
                    break;
            }
        }
        System.out.println("Bye !");

    }
}