package Object_Oriented_programming;

import java.util.Scanner;

class library{

    Scanner sc = new Scanner(System.in);
    int a = 2;

    String addb;



    public void addbooks(){
        System.out.println("Enter the number of books you want to add");
        int add = sc.nextInt();
        String[] books = new String[add];

        System.out.println("Add the books");

        for(int i = 0; i < books.length; i++){
            books[i] = sc.next();
        }

        for(int j = 0; j < books.length; j++){
            System.out.println(books[j]);
        }
        System.out.println("These books are successfully added in the Object_Oriented_programming.library");
    }

    public void issuebook(){
        System.out.println("Enter the index of the book you want to issue");
        System.out.println("0. Story book\n" +  "1. Fantasy book\n" +  "2. physiology book\n" +
                "3. Biology Book\n" +  "4. Science book\n" + "5. Computer Science book\n");
        int r = sc.nextInt();
        String[] book = {"Story book", "Fantasy book", "physiology book","Biology Book", "Science book", "Computer Science book"};

        System.out.println("your " + book[r]+  " has been issued! " +    " Kindly submit it on 21st of this month ");
    }

    public void returnbook(){
        System.out.println("0. Story book\n" +  "1. Fantasy book\n" +  "2. physiology book\n" +
                "3. Biology Book\n" +  "4. Science book\n" + "5.Computer science book\n" );
        System.out.println("Select the index of the book you want to return");
        int s = sc.nextInt();
        String[] bookreturn = {"Story book", "Fantasy book", "physiology book"
                , " Biology Book", "Science book" , "Computer science book"};
        System.out.println("Enter today's date ");
        int date = sc.nextInt();
        if(date>21) {
            System.out.println("your due date for returning this " + bookreturn[s] + " was on 21st which is already " +
                        " exceeded , so your Object_Oriented_programming.library card is cancelled");
        }
        else{
            System.out.println("Your " + bookreturn[s] + " Has been returned successfully\n Thank you!");
        }

    }

    public void availablebooks(){
        System.out.println("0. Story book\n" +  "1. Fantasy book\n" +  "2. physiology book\n" +
                "3. Biology Book\n" +  "4. Science book\n" + "5. Computer Science book\n");
        System.out.println("Currently these books are available in the Object_Oriented_programming.library\n" + "soon new books will be added!");
    }
}



public class EXE4_Library {
    public static void main(String[] args) {
        // You have to implement a Object_Oriented_programming.library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books

        library cr = new library();
//        cr.addbooks();
//        cr.issuebook();
//        cr.returnbook();
          cr.availablebooks();


    }
}
