
class Library{
    String [] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        no_of_books = 0;
    }
    void addbooks(String books){
        this.books[no_of_books] = books;
        no_of_books++;
        System.out.println(books + " :-has been added!");

    }
    void showAllbooks(){
        System.out.println("Allvaliable books are:");
        for (String books : this.books) {
            if(books == null){
                continue;
            }
            System.out.println("* " + books);
        }
    }
    void issuedBooks(String books){
        for(int i=0; i<this.books.length; i++){
            if(this.books[i].equals(books)){
                this.books[i]= null;
                System.out.println("this books has been issued");
                return;
            }
        }
        System.out.println("this book does not exists");
    }
    void returnBook(String books){
        addbooks(books);
    }

}
public class library_61 {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addbooks("mathematics");
        centralLibrary.addbooks("chemistry");
        centralLibrary.addbooks("physics");
        centralLibrary.addbooks("basic electrical energy");
        centralLibrary.showAllbooks();
        centralLibrary.issuedBooks("physics");
        centralLibrary.showAllbooks();
        centralLibrary.returnBook("physics");
        centralLibrary.showAllbooks();
    }
}
