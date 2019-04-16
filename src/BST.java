import javax.xml.soap.Node;

/**
 * @ClassName BST
 * @Description Binary Search Tree
 * @Author zhangzx
 * @Date 2019/4/16 10:32
 * Version 1.0
 **/
public class BST<E extends Comparable> {

    private class Node {
        public E e;
        private Node left;
        private Node right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E e) {
//        if(root == null) {
//            root = new Node(e);
//            size ++;
//        }
//        else {
//            add(root, e);
//        }
        root = add(root, e);
    }

    private Node add(Node node, E e) {
//        if(e.equals(node.e)){
//            return;
//        }
//        if(e.compareTo(root.e) < 0 && root.left == null) {
//            root.left = new Node(e);
//            size ++;
//            return;
//        }else if(e.compareTo(root.e) > 0 && root.right == null) {
//            root.right = new Node(e);
//            size ++;
//            return;
//        }
        if(node == null) {
            size ++;
            return new Node(e);
        }
        if(e.compareTo(root.e) < 0) {
            root.left = add(root.left, e);
        }else{
            root.right = add(root.right, e);
        }
        return node;
    }

    public boolean contain(E e) {
        return contain(root, e);
    }

    private boolean contain(Node node, E e) {
        if(node == null) {
            return false;
        }
        if(e.compareTo(node.e) == 0) {
            return true;
        }else if(e.compareTo(node.e) < 0){
            return contain(node.left, e);
        }else{
            return contain(node.right, e);
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {

        if(node == null) {
            return;
        }
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }
}
