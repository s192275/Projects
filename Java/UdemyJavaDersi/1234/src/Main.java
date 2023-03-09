import java.util.Scanner;
public class Main {
    static Scanner scan = new Scanner(System.in);
    static Television tv;
    public static void main(String[] args) {
        showMenu();

    }

    public static void showMenu() {
        boolean tele = true;
        String choice1 = "";
        System.out.println("Welcome to TV Setup Wizard");
        System.out.println("***********MENU************");
        System.out.println("1-Setup the TV");
        System.out.println("2-Turn the volume down");
        System.out.println("3-Turn the volume up");
        System.out.println("4-Change the channel");
        System.out.println("5-Add a channel");
        System.out.println("6-Show menu");
        System.out.println("7-Exit");
        System.out.println("8-Turn off the setup");
        System.out.println("Please enter your choice");
        int choice = scan.nextInt();
        while (tele) {
            System.out.println("Welcome to TV Setup Wizard");
            System.out.println("***********MENU************");
            System.out.println("1-Setup the TV");
            System.out.println("2-Turn the volume down");
            System.out.println("3-Turn the volume up");
            System.out.println("4-Change the channel");
            System.out.println("5-Add a channel");
            System.out.println("6-Show status");
            System.out.println("7-Show menu");
            System.out.println("8-Exit");
            System.out.println("9-Turn off the setup");
            System.out.println("Please enter your choice");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    if (tv==null) {
                        scan.nextLine();
                        System.out.println("Please enter the TV's name:");
                        String tvName = scan.nextLine();
                        System.out.println("Please enter the TV's inch:");
                        String tvInch = scan.nextLine();
                      tv=new Television(tvName,tvInch);
                      tv.showTv(tvName,tvInch);
                    } else {
                        System.out.println("TV has been created before");
                    }
                    break;
                case 2:
                    if (tv == null) {
                        System.out.println("Tv has not been initialized...");
                    } else {
                        System.out.println("Sound: " + (tv.setSound(tv.getSound() - 1)));
                    }
                    break;
                case 3:
                    if (tv == null) {
                        System.out.println("Tv has not been initialized...");
                    } else {
                        int a=tv.getSound() +1;
                        System.out.println("Sound: " + a);
                    }
                    break;
                case 4:
                    if (tv == null) {
                        System.out.println("Tv has not been initialized...");
                    } else {
                        System.out.println("Please enter the channel number to change:");
                        choice = scan.nextInt();
                        System.out.println("New channel is: " + tv.changeFavoriteChannel(choice));
                    }
                    break;
                case 5:
                    if (tv== null) {
                        System.out.println("Tv has not been initialized....");
                    } else {
                        scan.nextLine();
                        System.out.println("Please enter a channel name to add: ");
                        choice1 = scan.nextLine();
                        System.out.println("Please enter a channel number to add:");
                        choice = scan.nextInt();
                    }
                    if (choice < 10) {
                        System.out.println("Sys err...");
                    } else {
                        Channel c1=new Channel(1,"HBO");
                        Channel c2=new Channel(2,"AMC");
                        Channel c3=new Channel(3,"FOX TV");
                        Channel c4=new Channel(4,"History Channel");
                        Channel c5=new Channel(5,"National Geographic");
                        Channel c6=new Channel(6,"CNBC-e");
                        Channel c7=new Channel(7,"Nicklelodeon");
                        Channel c8=new Channel(8,"Cartoon Network");
                        Channel c9=new Channel(9,"SkyNews");
                        Channel c10=new Channel(10,"BBC");
                        tv.abc.add(c1);
                        tv.abc.add(c2);
                        tv.abc.add(c3);
                        tv.abc.add(c4);
                        tv.abc.add(c5);
                        tv.abc.add(c6);
                        tv.abc.add(c7);
                        tv.abc.add(c8);
                        tv.abc.add(c9);
                        tv.abc.add(c10);
                        Channel c11 = new Channel(choice, choice1);
                        tv.abc.add(c11);
                    }
                    break;
                case 6:

                    break;
                case 7:
                    System.out.println("Exiting the system...");
                    tele = false;
                    break;
                case 8:
                    System.out.println("Setup is turning off...");
                    tele = false;
                    break;
                default:
                    System.out.println("Please enter a number between 1-9...");
                    break;
            }


        }
    }
}