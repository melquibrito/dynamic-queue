package dynamicqueue;

public class MainClass {

    public static void main(String[] args) {
        DynamicQueue<String> queue = new DynamicQueue();
        queue.add("a");
        queue.add("b");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.add("c");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        
    }
    
}
