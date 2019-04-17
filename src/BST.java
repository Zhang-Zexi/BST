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
        if(e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        }else{
            node.right = add(node.right, e);
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

    public void inOrder() {
        inOrder(root);
    }

    private void preOrder(Node node) {

        if(node == null) {
            return;
        }
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    private void inOrder(Node node) {

        if(node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        generateBSTString(root, 0, res);
        return res.toString();
    }

    private void generateBSTString(Node node, int depth, StringBuilder res) {

        if(node == null) {
            res.append(generateDepthString(depth) +  "null\n");
            return;
        }

        res.append(generateDepthString(depth) + node.e + "\n");
        generateBSTString(node.left, depth + 1, res);
        generateBSTString(node.right, depth + 1, res);

    }

    private String generateDepthString(int depth) {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < depth; i ++) {
            res.append("--");
        }
        return res.toString();
    }
}
