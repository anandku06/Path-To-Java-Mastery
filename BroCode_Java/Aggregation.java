public class Aggregation {
    public static void main(String[] args) {
        
        // Aggregation -> represents a "has-a" relationship between objects
        // one objects contains another object as part of its structure, but the contained objects can exist independently

        Book b1 = new Book("Harry Potter", 560);
        Book b2 = new Book("Atomic Habits", 240);
        Book b3 = new Book("How to not give a Fuck!!", 300);

        Book[] books = {b1, b2, b3};

        for (Book book : books) {
            System.out.println(book.displayInfo());
        }

        Library lib = new Library("KnowledgeIsACurse Library", 2001, books);
        // here the Library class took an args which is also a object and exists independently

        lib.displayInfo();
    }
}
