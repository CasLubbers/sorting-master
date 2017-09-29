package Cas.Trees;

public class BinaryTree<T> {
    public T value;
    BinaryNode<T> left;
    BinaryNode<T> right;

    public BinaryTree(T value,BinaryNode<T> left,BinaryNode<T> right){
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
