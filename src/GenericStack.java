import java.util.ArrayList;

public class GenericStack<T> {

    private ArrayList<T> stack;

    public GenericStack() {
        stack = new ArrayList<T>();
    }

    public T peek() {

        if (isEmpty()) throw new AssertionError("Peek Failed: Stack is empty");

        return stack.get(size() - 1);
    }

    public T pop() {
        if (isEmpty()) throw new AssertionError("Pop Failed: Stack is empty");

        return stack.remove(size() - 1);
    }

    public void push(T value) {
        stack.add(value);
    }

    public int size() { return stack.size(); }

    public boolean isEmpty() { return (size() == 0); }

    /**
     * Main entry
     *
     * @param args {@code String[]} Command line arguments
     */
    public static void main(String[] args) {
        GenericStack<Double> stack = new GenericStack<>();

        System.out.println("Stack Initialized");
        System.out.println("Size: " + stack.size());
        System.out.println("stack.isEmpty() = " + stack.isEmpty());
//        System.out.println("stack.peak() = " + stack.peek());
//        System.out.println("stack.pop() = " + stack.pop());


        System.out.println("-------------------------");
        System.out.println("stack.push(2.0)");
        stack.push(2.0);
        System.out.println("stack.push(5.0)");
        stack.push(5.0);

        System.out.println("Size: " + stack.size());
        System.out.println("stack.isEmpty() = " + stack.isEmpty());
        System.out.println("stack.peak() = " + stack.peek());
        System.out.println("stack.pop() = " + stack.pop());
    }
}