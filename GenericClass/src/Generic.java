public class Generic <T>{
    private T item;

    //set the item for the class
    public void setItem(T item){
        this.item = item;
    }

    // get the item
   public T getItem(){
        return item;
    }
}
