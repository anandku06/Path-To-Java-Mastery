// now using multiple generics

public class Products<T, U> {
    T item;
    U price;

    Products(T item, U cost){
        this.item = item;
        this.price = cost;
    }

    public T getItem(){
        return this.item;
    }

    public U getPrice(){
        return this.price;
    }
}
