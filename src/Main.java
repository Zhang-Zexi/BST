/**
 * @ClassName Main
 * @Description
 * @Author zhangzx
 * @Date 2019/4/16 17:32
 * Version 1.0
 **/
public class Main {

    public static void main(String[] args) {

        BST<Integer> bst = new BST<>();
        int[] nums = {5, 3, 6, 8, 4, 2};
        for(int num : nums) {
            bst.add(num);
        }
        ////////5//////////
        //    /  \      //
        //   3    6     //
        //  / \    \    //
        // 2   4    8   //
        //////////////////
        bst.preOrder();
        System.out.println();

        bst.preOrderNR();
        System.out.println();
//        bst.inOrder();
//        System.out.println();
//        bst.postOrder();
//        System.out.println();
//        System.out.println(bst);
    }
}
