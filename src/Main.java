import java.util.ArrayList;
import java.util.Random;

/**
 * @ClassName Main
 * @Description
 * @Author zhangzx
 * @Date 2019/4/16 17:32
 * Version 1.0
 **/
public class Main {

    public static void main(String[] args) {

//        BST<Integer> bst = new BST<>();
//        int[] nums = {5, 3, 6, 8, 4, 2};
//        for(int num : nums) {
//            bst.add(num);
//        }
//        ////////5//////////
//        //    /  \      //
//        //   3    6     //
//        //  / \    \    //
//        // 2   4    8   //
//        //////////////////
//        bst.preOrder();
//        System.out.println();
//
//        bst.preOrderNR();
//        System.out.println();
//
//        bst.levelOrder();
////        bst.inOrder();
////        System.out.println();
////        bst.postOrder();
////        System.out.println();
////        System.out.println(bst);

        BST<Integer> bst = new BST<>();
        Random random = new Random();

        int n = 1000;
        for (int i = 0; i < n; i ++) {
            bst.add(random.nextInt(10000));
        }

//        ArrayList<Integer> nums = new ArrayList();
//        while (!bst.isEmpty()) {
//            nums.add(bst.removeMin());
//        }
//        System.out.println(nums);
//
//        for (int i = 1; i < nums.size(); i ++) {
//            if (nums.get(i - 1) > nums.get(i)) {
//                throw new IllegalArgumentException("Error");
//            }
//            System.out.println("removeMin test completed");
//        }

        ArrayList<Integer> nums1 = new ArrayList();
        while (!bst.isEmpty()) {
            nums1.add(bst.removeMax());
        }
        System.out.println(nums1);

        for (int i = 1; i < nums1.size(); i ++) {
            if (nums1.get(i - 1) < nums1.get(i)) {
                throw new IllegalArgumentException("Error");
            }
            System.out.println("removeMax test completed");
        }
    }
}
