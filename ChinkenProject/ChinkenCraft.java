import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (Ben Callaghan)
 * @version (V1.06)
 */
public class ChinkenCraft{

    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        int choice = 0;

        Chicken chick1 = new Chicken("NATHAN");
        Chicken chick2 = new Chicken("NANCY");
        Chicken chick3 = new Chicken("DAVE");

        while(true){   

            System.out.println("1. " + chick1);
            System.out.println("2. " + chick2);
            System.out.println("3. " + chick3);

            System.out.println();
            System.out.println();
            System.out.println("What do you want to do? Please enter a number from 1-3:");
            System.out.println("\t1. Feed");
            System.out.println("\t2. Play");
            System.out.println("\t3. Hit");
            System.out.println("\t4. Get Eggs");
            System.out.println("\t5. Quit");
            System.out.print("Selection: ");
            choice = input.nextInt();
            System.out.println();
            System.out.println();

            //feed
            if(choice == 1){
                //ask the user for how much seed is to be fed 
                double amount = 0.5;

                //Which chicken
                System.out.print("Which chicken do you want to feed (1-3) : ");
                int which = input.nextInt();
                input.nextLine();

                System.out.println();

                System.out.print("How many Kg of seeds do you want to feed? (0.5 Kg) : ");
                amount = input.nextDouble();
                input.nextLine();

                if(which == 1){
                    chick1.Feed(amount);
                    if(chick1.getHealth() == "DEAD"){
                        System.out.println("_________________________________________________________________________________");
                        System.out.println(chick1.getName() + " has DIED");
                        System.out.println("---------------------------------------------------------------------------------");
                    } else {
                        System.out.println("_________________________________________________________________________________");
                        System.out.println(chick1.getName() + " has been fed");
                        System.out.println("---------------------------------------------------------------------------------");
                    }
                }

                if(which == 2){
                    chick2.Feed(amount);
                    if(chick2.getHealth() == "DEAD"){
                        System.out.println("_________________________________________________________________________________");
                        System.out.println(chick1.getName() + " has DIED");
                        System.out.println("---------------------------------------------------------------------------------");
                    }else {
                        System.out.println("_________________________________________________________________________________");
                        System.out.println(chick1.getName() + " has been fed");
                        System.out.println("---------------------------------------------------------------------------------");
                    }
                }

                if(which == 3){
                    chick3.Feed(amount);
                    if(chick3.getHealth() == "DEAD"){
                        System.out.println("_________________________________________________________________________________");
                        System.out.println(chick1.getName() + " has DIED");
                        System.out.println("---------------------------------------------------------------------------------");
                    }else {
                        System.out.println("_________________________________________________________________________________");
                        System.out.println(chick1.getName() + " has been feeed");
                        System.out.println("---------------------------------------------------------------------------------");
                    }
                }

            }

            //play
            if(choice == 2){
                //which chicken wants to play
                System.out.print("Pick first chicken to play! : (1-3)");
                int which = input.nextInt();
                input.nextLine();
                //which chicken do you want to play with
                System.out.println();

                System.out.print("Pick second chicken to play! (must be differnt from first) : ");
                int which2 = input.nextInt();
                input.nextLine();
                if(which != which2){

                    if(which == 1){
                        if(which2 == 2){
                            chick1.Play(chick2);
                            System.out.println("_________________________________________________________________________________");
                            System.out.println(chick1.getName() + " is playing with " + chick2.getName() + " and are both now happy");
                            System.out.println("---------------------------------------------------------------------------------");
                        }

                        if(which2 == 3){
                            chick1.Play(chick3);
                            System.out.println("_________________________________________________________________________________");
                            System.out.println(chick1.getName() + " is playing with " + chick3.getName() + " and are both now happy");
                            System.out.println("---------------------------------------------------------------------------------");
                        }

                    }

                    if(which == 2){
                        if(which2 == 1){
                            chick2.Play(chick1);
                            System.out.println("_________________________________________________________________________________");
                            System.out.println(chick2.getName() + " is playing with " + chick1.getName() + " and are both now happy");
                            System.out.println("---------------------------------------------------------------------------------");
                        }

                        if(which2 == 3){
                            chick2.Play(chick3);
                            System.out.println("_________________________________________________________________________________");
                            System.out.println(chick2.getName() + " is playing with " + chick3.getName() + " and are both now happy");
                            System.out.println("---------------------------------------------------------------------------------");
                        }

                    }

                    if(which == 3){
                        if(which2 == 2){
                            chick1.Play(chick2);
                            System.out.println("_________________________________________________________________________________");
                            System.out.println(chick3.getName() + " is playing with " + chick2.getName());
                            System.out.println("---------------------------------------------------------------------------------");
                        }

                        if(which2 == 1){
                            chick1.Play(chick1);
                            System.out.println("_________________________________________________________________________________");
                            System.out.println(chick3.getName() + " is playing with " + chick1.getName());
                            System.out.println("---------------------------------------------------------------------------------");
                        }

                    }

                } else {
                    System.out.println("_________________________________________________________________________________");
                    System.out.println("ERROR: cannot use same chicken twice please try again but with a differnt chicken");
                    System.out.println("    for the second option");
                    System.out.println("---------------------------------------------------------------------------------");
                }
            }

            //Hit
            if(choice == 3){
                //which chicken is getting hit
                System.out.print("Which chicken would you like to HIT (1-3) : ");
                int which = input.nextInt();
                input.nextLine();

                if(which == 1){
                    chick1.Hit();
                    if(chick1.getHealth() == "DEAD"){
                        System.out.println("_______________________________________________________________");
                        System.out.println(chick1.getName() + " has DIED" );
                        System.out.println("---------------------------------------------------------------");
                    } else {
                        System.out.println("_______________________________________________________________");
                        System.out.println(chick1.getName() + " has been HIT!" );
                        System.out.println("---------------------------------------------------------------");
                    }

                }

                if(which == 2){
                    chick2.Hit();
                    if(chick2.getHealth() == "DEAD"){
                        System.out.println("_______________________________________________________________");
                        System.out.println(chick2.getName() +  " has DIED" );
                        System.out.println("---------------------------------------------------------------");
                    }else {
                        System.out.println("_______________________________________________________________");
                        System.out.println(chick2.getName() + " has been HIT!" );
                        System.out.println("---------------------------------------------------------------");
                    }

                }

                if(which == 3){
                    chick3.Hit();
                    if(chick3.getHealth() == "DEAD"){
                        System.out.println("_______________________________________________________________");
                        System.out.println(chick3.getName() +  " has DIED" );
                        System.out.println("---------------------------------------------------------------");
                    } else {
                        System.out.println("_______________________________________________________________");
                        System.out.println(chick3.getName() + " has been HIT!" );
                        System.out.println("---------------------------------------------------------------");
                    }

                }

            }

            //get Eggs
            if(choice == 4){
                //which chicken is going to lay eggs
                System.out.print("Which chicken would you like to lay an Egg (1-3) : ");
                int which = input.nextInt();
                input.nextLine();

                if(which == 1){
                    chick1.getEggs();
                    if(chick1.getEggs() > 0){
                        System.out.println("_______________________________________________________________");
                        System.out.println(chick1.getName() + " has layed an egg" );
                        System.out.println("---------------------------------------------------------------");
                    }
                }

                if(which == 2){
                    chick2.getEggs();
                    if(chick2.getEggs() > 0){
                        System.out.println("_______________________________________________________________");
                        System.out.println(chick2.getName() + " has layed an egg" );
                        System.out.println("---------------------------------------------------------------");
                    }
                }

                if(which == 3){
                    chick3.getEggs();
                    if(chick3.getEggs() > 0){
                        System.out.println("_______________________________________________________________");
                        System.out.println(chick3.getName() + " has layed an egg" );
                        System.out.println("---------------------------------------------------------------");
                    }
                }

            }

            if(choice == 5){
                break;
            }
        }
        System.out.println("_______________________________________________________________");
        System.out.println("GAMEOVER: Game Has Ended Please come back for more farming SOON!!!");
        System.out.println("Thanks for playing Chicken craft!!!!");
        System.out.println("---------------------------------------------------------------");

    }
}
