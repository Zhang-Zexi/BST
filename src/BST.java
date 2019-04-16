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
}
