package Cas.Trees;

public class TreeNode<T> {
    public TreeNode<T> firstChild;
    public TreeNode<T> nextSibling;
    public T value;

    public TreeNode(T value){
        this.value = value;
    }

    public void addChild(TreeNode<T> firstChild){
        this.firstChild = firstChild;
    }

    public void addNextSibling(TreeNode<T> nextSibling){
        this.nextSibling = nextSibling;
    }


}
