package Cas.ListStackQueue;

public class Node<T> {
    private T value;
    private Node<T> next;

    Node(T value){
        this.value = value;
    }

    Node(T value, Node<T> next){
        this.value = value;
        this.next = next;
    }

    public Node<T> next(){
        return next;}

    public void setNext(Node<T> next){
        this.next = next;}

    public T getValue(){
        return value;}

    public Node<T> getNext() {
        return next;
    }
}
