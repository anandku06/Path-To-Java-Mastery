public class Library {

    String name;
    int year;
    Book[] books;

    Library(String name, int yr, Book[] books){
        this.name = name;
        this.year = yr;
        this.books = books;
    }

    void displayInfo(){
        System.out.println("The " + this.year + " " + this.name);
        System.out.print("Books Available: ");
        for (Book book : books) {
            System.out.println(book.displayInfo());
        }
    }
}
