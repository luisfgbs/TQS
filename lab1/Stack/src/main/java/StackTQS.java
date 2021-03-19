import java.util.LinkedList;
import java.util.NoSuchElementException;

public class StackTQS<T> {

    LinkedList<T> elementCollection = new LinkedList<>();

    public boolean isEmpty(){
        return elementCollection.isEmpty();
    }

    public int size(){
        return elementCollection.size();
    }

    public T pop(){
        return elementCollection.pop();
    }

    public T peek() throws NoSuchElementException {
        if (elementCollection.peekFirst()==null){
            System.out.print(elementCollection.peekFirst());
            throw new NoSuchElementException();
        }else{
            return elementCollection.peekFirst();
        }
    }

    public void push(T element) {
        elementCollection.addFirst(element);
    }
}
