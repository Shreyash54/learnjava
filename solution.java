import java.util.Scanner;

class solution {
      public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu Options\n");
            System.out.println("(1) - do this");
            System.out.println("(2) - quit");

            System.out.print("Please enter your selection:\t");
            int selection = scanner.nextInt();

            if (selection == 1) {
                System.out.print("Enter a sentence:\t");
                String sentence = scanner.nextLine();

                System.out.print("Enter an index:\t");
                int index = scanner.nextInt();

                System.out.println("\nYour sentence:\n" + sentence);
                System.out.println("Your index:\t" + index);
            }
            else if (selection == 2) {
                break;
            }
        }
        
    }
      }
