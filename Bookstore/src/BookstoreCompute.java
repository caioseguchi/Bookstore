import java.util.Scanner;

public class BookstoreCompute {
    //Declare variables

    //Book Attributes variables
    private int id;
    private String title;
    private String author;
    private String category;
    private Double price;


    //Book comparison variables
    private Double highestPrice;//price comparison
    private Double lowestPrice;//price comparison
    private int highestPriceAddress;//position inside the array
    private int lowestPriceAddress;//position inside the array

    //Book average price variables
    private Double sumPrice;
    private Double averagePrice;


    //Declare Array of objects
    Book[] books = new Book[5];


    //Declare the counter for array
    private int count = 0;


    //Develop methods
    //Option1 add new book
    public void addNewBook(Scanner scanner){
        //Full warning
        if (count >= books.length){
            System.out.println("Bookstore is full");
            return;
        }

        //Input
        System.out.println("Enter book id: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter book title: ");
        title = scanner.nextLine();
        System.out.println("Enter book author: ");
        author = scanner.nextLine();
        System.out.println("Enter book category: ");
        category = scanner.nextLine();
        System.out.println("Enter book price: ");
        price = scanner.nextDouble();

        //Save new Book
        books[count] = new Book(id, title, author, category, price);
        System.out.println("Book added: " + books[count]);
        count++;
    }//add new book

    //Option 2 List of all Books
    public void getAllBooks(Scanner scanner){
        //Verify if it is empty
        if(count == 0){
            System.out.println("No book was added.");
            return;
        }

        //Print all books
        System.out.println("Book list");
        for (int i = 0; i < count; i++){
            System.out.println(books[i].toString());
        }
    }//getAllBooks

    //Option 3 Highest price
    public void highest(Scanner scanner){
        highestPrice = books[0].getPrice();//Set highest price the first value of list
        highestPriceAddress = 0;//Set highest address in the first position
            for (int j = 0; j < count; j++){//Run all positions inside the array
                if (books[j].getPrice() > highestPrice) {//Compare the highest price with the current position
                    highestPrice = books[j].getPrice();//set new price if it is highest
                    highestPriceAddress = j;//set new position
                }//if
            }//for
        System.out.println("The highest book price is: "+books[highestPriceAddress]);//print highest price
    }//highest

    //Option 4 Lowest price
    public void lowest(Scanner scanner){
        lowestPrice = books[0].getPrice();//Set lowest price the first value of list
        lowestPriceAddress = 0;//set the lowest price address in the in first position
            for (int k = 0; k < count; k++){//run all positions
                if (books[k].getPrice() < lowestPrice){//compare the current price with the lowest price
                    lowestPrice = books[k].getPrice();//set new lowest price
                    lowestPriceAddress = k;//set new highest price
                }//if
            }//for
        System.out.println("The lowest book price is: "+books[lowestPriceAddress]);//print lowest price
    }//lowes

    //Option 5 Average price
    public void average(Scanner scanner){
        sumPrice = 0.0;//set sumPrice
        for (int l = 0; l < count; l++) {//run all positions
            sumPrice = sumPrice + books[l].getPrice();//sum sumPrice with the current position
        }//for
        averagePrice = sumPrice/count;//calculate the average
        System.out.println("The average price of books is: "+averagePrice);//print average
    }//average
}//class
