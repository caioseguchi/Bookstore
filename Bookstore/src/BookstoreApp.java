import java.util.Scanner;

public class BookstoreApp {
    public static void main(String[] args) {
        //Declare Constructor
        Scanner scanner = new Scanner(System.in);
        Book[] book = new Book[5];
        BookstoreCompute compute = new BookstoreCompute();
        int option;

        do{
            System.out.println("Menu\n" +
                    "1) Add new book\n" +
                    "2) Print Book list\n" +
                    "3) Highest book price\n" +
                    "4) Lowest book price\n" +
                    "5) Display book chosen category\n" +
                    "6) Exit");

            //Input
            option = scanner.nextInt();
            scanner.nextLine();

            //Process and Output
            switch (option){
                case 1:
                    compute.addNewBook(scanner);
                    break;
                case 2:
                    compute.getAllBooks(scanner);
                    break;
                case 3:
                    compute.highest(scanner);
                    break;
                case 4:
                    compute.lowest(scanner);
                    break;
                case 5:
                    compute.average(scanner);
                    break;
                case 6:
                    System.out.println("Existing app");
                    break;
                default:
                    System.out.println("This options is not valid");
                    break;
            }//switch
        } while(option != 6);
    }//main
}//class
