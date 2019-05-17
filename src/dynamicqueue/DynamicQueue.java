package dynamicqueue;

public class DynamicQueue <T> {
  
    private class Element {
        T object;
        Element previous, next;

        public Element(T object, Element previous, Element next) {
            this.object = object;
            this.previous = previous;
            this.next = next;
        }
        public Element() {}
        
    }
    
    private Element first = null, last = null;
    
    public int size() {
        int i = 0;
        if(!isEmpty()) {
            Element node = last;
            while(node != null) {
                node = node.previous;
                i++;
            }
        }
        return i;
    }
    
    private boolean isEmpty() {
        return last == null;
    }

    public void add(T object) {
        Element added = new Element(object, null, null);
        if(isEmpty()) {
            first = added;
            last = added;
        } else {
            added.previous = last;
            last.next = added;
            last = added;
        }
    }
    
    public boolean remove() {
        if(!isEmpty()) {
            if(this.size() == 1) {
                first = null;
                last = null;
                return true;
            }
            first = first.next;
            first.previous = null;
        }
        return false;
    }

    @Override
    public String toString() {
        if(first == null) {
            return "The queue is currently empty.";
        }
        return first.object.toString();
    }
}
