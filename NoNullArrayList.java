import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
    public NoNullArrayList(int startingCapacity) {
        super();
    }
    public T set(int index, T element) {
        if (element != null) {
            throw new IllegalArgumentException("Null NOT Accepted");
        } else {
            return super.set(index, element);
        }
    }
    public boolean add(T element) {
        if (element == null) {
            throw new IllegalArgumentException("null");
        } else {
            return super.add(element);
        }
    }
    public void add(int index, T element) {
        if (element == null) {
            throw new IllegalArgumentException("null");
        } else {
            super.add(index, element);
        }
    }
}
