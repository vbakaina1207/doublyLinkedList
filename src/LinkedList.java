public class LinkedList<E> {
    private Node<E> head;
    private  Node<E> tail;
    private int size;

    LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public Node<E> foundTail (int index){
        Node<E> cur;
        if (index < size/2) {
            System.out.println("get from head");
            cur = head;
            for (int i = 0; i < index - 1; i++) {
                cur = cur.next;
            }
        } else {
            System.out.println("get from tail");
            cur = tail;
            for ( int i = size -1; i > index; i--){
                cur = cur.prev;
            }
        }
        return cur;
    }
    public boolean add(E e) {
        Node<E> addNode = new Node<>(e);
        if (head == null) {
            head = addNode;
            tail = addNode;
        } else {
            tail.next = addNode;
            addNode.prev = tail;
            tail = addNode;
        }
        size++;
        return true;
    }

    public void add(int index, E element ) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " liegt außerhalb des zulässigen Bereichs.");
        }
        Node<E> addNode = new Node<>(element);
        if(index == 0) {
            addNode.next = head;
            if(head!=null)
                head.prev = addNode;
            head = addNode;
            if (tail == null)
                tail = addNode;
        } else if (index == size) {
            addNode.prev = tail;
            if (tail != null)
                tail.next = addNode;
            tail = addNode;
            if (head == null)
                head = addNode;
        } else {
            Node<E> cur = foundTail(index);
            addNode.next = cur.next;
            addNode.prev = cur;
            cur.next.prev = addNode;
            cur.next = addNode;
        }
        size++;
    }

    public int size () {
        return  size;
    }

    public E get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " liegt außerhalb des zulässigen Bereichs.");
        }
        Node<E> cur = foundTail(index);
        return cur.data;
    }

    public E remove(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " liegt außerhalb des zulässigen Bereichs.");
        }
        Node<E> removeNode;
        if(index == 0) {
            removeNode = head;
            head = removeNode.next;
            if (head!=null)
                head.prev = null;
            else
                tail = null;
        } else if (index == size - 1) {
            removeNode = tail;
            tail = tail.prev;
            tail.next = null;
        } else {
            Node<E> cur = foundTail(index);
            removeNode = cur.next;
            cur.next = cur.next.next;
            cur.next.prev = cur;
        }
        size--;
        return  removeNode.data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> cur = head;
        sb.append("[");
        while (cur!=null) {
            sb.append(cur.data);
            if (cur.next!=null)
                sb.append(" - > ");
            cur = cur.next;
        }
        sb.append("]");
        return  sb.toString();
    }


    public String toStringReverse() {
        StringBuilder sb = new StringBuilder();
        Node<E> cur = tail;
        sb.append("[");
        while (cur!=null) {
            sb.append(cur.data);
            if (cur.next!=null)
                sb.append(" - > ");
            cur = cur.prev;
        }
        sb.append("]");
        return  sb.toString();
    }
}