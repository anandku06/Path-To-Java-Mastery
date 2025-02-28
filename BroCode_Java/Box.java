// given a type parameter here <T>
public class Box<T> {
    T item;   

    public void setItem(T itemName){
        this.item = itemName;
    }

    public T getItem(){
        return this.item;
    }
}
