public class Book {
    
    String title;
    int pages;

    Book(String t, int p){
        this.title = t;
        this.pages = p;
    }

    String displayInfo(){
        return this.title + " (" + this.pages + " pages)";
    }
}
