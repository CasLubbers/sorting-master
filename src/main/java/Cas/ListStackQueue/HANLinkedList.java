package Cas.ListStackQueue;

public class HANLinkedList<T> {

    private Node<T> headerNode = new Node<T>(null);

    HANLinkedList(T value) {
        headerNode = new Node<T>(value);
    }

    public void addFirst(T value){
        headerNode.setNext(new Node<T>(value, headerNode.getNext()));
    }

    public void removeFirst() {
        if (headerNode.next() != null) {
            headerNode = headerNode.next();
        }
        else {
            headerNode = null;
        }
    }
    public void deleteFirst(){
        if(headerNode.next() != null){
            headerNode = headerNode.next();
        } headerNode = null;
    }

    public void insert(int index, T value){
        Node<T> temp = headerNode;
        for (int i = 0; i < index ; i++) {
            temp = temp.next();
        }
        temp.setNext(new Node<T>(value, temp.next()));
    }

    public void delete(int index){
        Node<T> temp = headerNode;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next();
        }
        temp.setNext(temp.next().next());
    }

    Node<T> get(int index){
        Node<T> temp = headerNode;
        for (int i = 0; i < index; i++) {
            temp = temp.next();
        }
        return temp;
    }

    public int getSize(){
        Node<T> temp = headerNode;
        int i = 0;
        while ((temp = temp.next()) != null) {
            i++;
        }
        return i;
    }

    public void add(T value){
        Node<T> temp = headerNode;
        while (temp.next() != null) {
            temp = temp.next();
        }
        temp.setNext(new Node<T>(value));
    }
}

