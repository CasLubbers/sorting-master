package Cas.Trees;

public class BinarySearchTree {
    Node root;

    BinarySearchTree() { root = null; }

    public Node search(Node root, int data) {

        if (root==null || root.data==data)
            return root;

        if (root.data > data)
            return search(root.left, data);

        return search(root.right, data);
    }

    void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data){

        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        return root;
    }

    void deleteKey(int data) {
        root = deleteRec(root, data);
    }

    Node deleteRec(Node root, int data) {

        if (root == null)  return root;

        if (data < root.data)
            root.left = deleteRec(root.left, data);
        else if (data > root.data)
            root.right = deleteRec(root.right, data);
        else
        {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.data = minValue(root.right);

            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }
    int minValue(Node root) {
        int minv = root.data;
        while (root.left != null)
        {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    int maxValue(Node root){
        int maxv = root.data;
        while (root.right != null){
            maxv = root.right.data;
            root = root.right;
        }
        return maxv;
    }

}
