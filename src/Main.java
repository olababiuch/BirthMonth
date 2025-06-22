import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            Scanner in =  new Scanner(System.in);
            int birthMonth = 0;
            String trash = "";

            System.out.print("Enter your birth month (1-12): ");

            if(in.hasNextInt()) {
                birthMonth = in.nextInt();
                in.nextLine();
                if (birthMonth >= 1 && birthMonth <= 12) {
                    System.out.println("Your birthday month is " + birthMonth);
                } else {
                    System.out.println("Invalid input: " + birthMonth + ". The number should be between 1-12");
                }
            } else  {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + ". Enter a number between 1-12");


                }

            }
        }
