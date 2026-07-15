// A common convention for the second type is U because it comes after T, V for the third and so on.
public class Product<T, U> {
    T item;
    U price;

    Product(T item, U price){
        this.item = item;
        this.price = price;
    }

    public T getItem(){
        return this.item;
    }

    public U getPrice(){
        return this.price;
    }
}
