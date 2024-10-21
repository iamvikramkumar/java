class Library{
     String[] books;
     int no_of_books;
    Library() {
        
        this.books=new String[100];
        this.no_of_books=0;
        
    }
    void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+ " has been added!");
    }
    void showAvailableBooks(){
        System.out.println("Available books are:");
        for (String book : this.books) {
            if(book==null){
                continue ;
            }
            System.out.println("*" + books);
        }
    }
    void issueBook(String book){
            for(int i=0;i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println("The book has been issued");
                this.books=null;
                return;
            }
        }
        System.out.println("This book doesnot exists! " );
    }
void returnBook(String book){
    addBook(book);

}
    }

public class Exercise4 {

    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books
        Library centraLibrary=new Library();
        centraLibrary.addBook("Think Big Book");
        centraLibrary.addBook("JAVA");
        centraLibrary.addBook("C++");
        centraLibrary.showAvailableBooks();
        centraLibrary.issueBook("JAVA");
        centraLibrary.returnBook("C++");
 
    }
}
