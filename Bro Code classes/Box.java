// "T" is a common convention meaning "Type"
public class Box<T> {
    T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return this.item;
    }
}
