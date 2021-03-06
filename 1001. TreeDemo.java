import java.util.*;


/**
 * MENU:
 * 0. Get the max value node (LintCode 632)
 *     1) maxNodeRec
 *     2) maxNode
 *
 * 1. Get all the nodes number
 *     1) getNodeNumRec
 *     2) getNodeNum
 *
 * 2. Get the depth
 *     1) getDepthRec
 *     2) getDepth
 *     3) getDepthTraverse (with global variable)
 *
 * 2.1 Get minimum depth
 *     1) minDepth
 *
 * 3. Binary tree traversal
 *     1) preorderTraversalRec
 *     2) preorderTraversal
 *     3) inorderTraversalRec
 *     4) inorderTraversal
 *     5) postorderTraversalRec
 *     6) postorderTraversal
 *
 * 3.1 BST Inorder Successor / Predecessor
 *     1) inorderSuccessor
 *     2) inorderPredecessor
 *
 * 4. Level order traversal
 *     1) levelTraversal
 *     2) levelTraversalRec
 *     3) levelOrderBFS
 *         -- LeetCode 102, 107
 *         -- LintCode 69, 70
 *
 * 4.1 Average of Levels in Binary Tree
 *     1) averageOfLevels
 *         -- LeetCode 637
 *
 * 4.2 Largest node val of each level
 *     1) largestValuesBFS
 *     2) largestValuesDFS
 *
 * 4.3 Add one row to a BT
 *     1) addOneRowDFS
 *     2) addOneRowBFS
 *
 * 4.4 Right view of BT
 *     1) rightSideViewBFS
 *     2) rightSideViewDFS
 *
 * 4.5 Populating Next Right Pointers in Each Node
 *     1) connectBFS
 *     2) connectDFS
 *     3) connectIIBFS
 *     4) connectIIDummy
 *
 * 4.6 Vertical Level Traversal
 *     1) verticalOrderTreeMap
 *     2) verticalOrderHashMap
 *
 * 4.7 Level order ZigZag Traversal
 *     1) zigzagLevelOrder
 *             -- LeetCode 103
 *             -- LintCode 71
 *             -- TreeDemo 4.7.1
 *
 * 5. Convert BST to Doubly LinkedList
 *     1) convertBST2DLLRec (refer to LintCode 378)
 *
 * 6. Get the number of Nodes from Kth level
 *     1) getNodeNumKthLevel
 *     2) getNodeNumKthLevelRec
 *
 * 7. Get the number of leaf nodes
 *     1) getNodeNumLeafRec
 *     2) getNodeNumLeafInorder
 *     3) getNodeNumLeafPreorder
 *     4) getNodeNumLeafPostorder
 *
 * 8. Are those BT the same
 *     1) isSameRec
 *     2) isSameInorder
 *     3) isSamePreorder
 *
 * 9. Is balanced binary tree
 *     1) isAVLRec
 *     2) isAVLResultType
 *
 * 10. BT mirror
 *     1) mirrorRec
 *     2) mirror
 *     3) mirrorCopyRec
 *     4) mirrorCopy
 *
 * 10.1 Two trees are mirrors
 *     1) isMirrorRec
 *     2) isMirror
 *
 * 10.2 The Tree is symmetric
 *     1) isSymmetricCS (copy mirror, compare with the root)
 *     2) isSymmetricMR (root and root isMirror Recursion)
 *     3) isSymmetricM  (root and root isMirror)
 *
 * 11. Least common ancestor
 *     1) LCA*
 *     2) LCARec
 *     3) LCABstRec
 *
 * 12. Max distance between nodes
 *     1) getMaxDistanceRec
 *
 * 13. Rebuild BT
 *     1) rebuildBinaryTreeRec
 *
 * 14. Is the BT Complete BT
 *     1) isCompleteBinaryTree*
 *     2) isCompleteBinaryTreeNoDummy*
 *     3) isCompleteBinaryTreeRec*
 *
 * 14.1 Count nodes in a complete binary tree
 *     1) countNodesCompleteBTRec
 *     2) countNodesCompleteBT
 *
 * 15. Longest Path (root to leaf)
 *     1) findLongest
 *
 * 15.1 Root to leaf paths (String)
 *     1) binaryTreePathsWithHelp
 *     2) binaryTreePaths
 *
 * 15.2 Length of the longest consecutive sequence path (parent to child)
 *     1) longestConsecutivePreDFS
 *     2) longestConsecutivePostDFS
 *         -- LeetCode 298
 *
 * 15.3 Length of the longest consecutive sequence path (any to any)
 *     1) longestConsecutiveII
 *
 * 15.4 Sum Root to Leaf Numbers
 *     1) sumNumbersNaive
 *     2) sumNumbersCarry
 *
 * 16. Merge two BT
 *     1) mergeTreesRec (LeetCode 617)
 *
 * 17. Construct a string from BST
 *     1) tree2strRec
 *     2) tree2str
 *
 * 17.1 Construct a BT from String
 *     1) str2treeRec
 *     2) str2tree
 *         -- LeetCode 536
 *
 * 18. Minimum absolute difference between any nodes (LeetCode 530)
 *     1) getMinimumDifference
 *     2) getMinimumDifferenceArrayList
 *     3) getMinimumDifferenceTreeSet
 *
 * 19. The tilt of a tree (LeetCode 563)
 *     1) findTilt
 *
 * 20. Convert BST to Greater Tree (LeetCode 538, LintCode 661)
 *     1) convertBST
 *     2) convertBSTRec
 *
 * 21. Sum of all LEFT leaves (LeetCode 404)
 *     1) sumOfLeftLeavesRecVoid
 *     2) sumOfLeftLeavesRec
 *     3) sumOfLeftLeavesBFS
 *
 * 21.1 Collect and remove leaves
 *     1) findLeavesHeight
 *     2) findLeavesIsLeave
 *
 * 21.2 Find the value of the LeftMost node
 *     1) findBottomLeftValueBFS
 *     2) findBottomLeftValueRec
 *
 * 21.3 Boundary of the BT
 *     1) boundaryOfBinaryTree
 *
 * 22. Convert Sorted Array to BST (LeetCode 108, LintCode 177)
 *     1) sortedArrayToBST
 *
 * 22.1 Serialize and deserialize BST
 *     1) serializeWithNull / deserializeWithNull
 *     2) serializeBFS / deserializeBFS
 *
 * 22.2 Convert Sorted LinkedList to height balanced BST
 *     1) sortedListToBST
 *          -- LintCode 106
 *          -- LeetCode 109
 *
 * 23. Tree 1 is subtree of Tree2 (LeetCode 572, LintCode 245)
 *     1) isSubtree
 *
 * 23.1 Most frequent subtree sum
 *     1) findFrequentTreeSum
 *
 * 23.2 The number of Univalue subtrees
 *     1) countUnivalSubtreesGlobal
 *     2) countUnivalSubtreesRec
 *
 * 23.3 Number of nodes in BST Subtree
 *     1) largestBSTSubtreeRec
 *     2) largestBSTSubtreeResultType
 *         -- LeetCode 333
 *
 * 23.4 Find duplicate subtrees
 *     1) findDuplicateSubtrees
 *
 * 24. Path Sum
 *     1) hasPathSum (root to leaf LeetCode 112)
 *     2) binaryTreePathSumList (root to leaf)
 *         -- LeetCode 113
 *         -- LintCode 376
 *     3) pathSumIII (how many paths from up to down not limited from root to
 *                    leaf)
 *         -- LeetCode 437
 *
 * 24.1 Binary Tree Maximum Path Sum
 *     1) maxPathSumResultType
 *     2) maxPathSumGlobalRec
 *
 * 25. Closest BST value
 *     1) closestValueRec
 *     2) closestValue
 *
 * 25.1 Kth Smallest Element in a BST
 *     1) kthSmallestBS (Binary Search)
 *     2) kthSmallestCarry
 *         -- LeetCode 230
 *
 * 25.2 k Closet BST value
 *     1) closestKValues2StacksRec
 *     2) closestKValues2Stacks
 *     3) closestKValuesListHeap
 *
 * 26. Mode in a loosely BST
 *     1) findModeHashMap
 *     2) findMode2Trav
 *
 * 26.1 Verify preorder traversal sequence of BST
 *     1) verifyPreorderStack
 *     2) verifyPreorder
 *         -- LeetCode 255
 *
 * 26.2 Delete a node in BST
 *     1) deleteNode
 *
 * 26.3 Unique BST by n
 *     1) numTrees
 *         -- LeetCode 96
 *         -- LintCode 163
 *     2) generateTrees
 *         -- LeetCode 95
 *         -- LintCode 164
 *
 * 26.4 Validate BST
 *     1) isValidBSTSqueeze
 *     2) isValidBSTTraverse
 *     3) isValidBSTResultType
 *
 * 26.5 Recover two wrong nodes in BST
 *     1) recoverTree
 *
 * 27. Tree Simulation
 *     1) killProcess
 *
 * 28. Graph Valid Tree
 *     1) validTree
 */

public class TreeDemo {
    /* TreeNode */
    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
            left = null;
            right = null;
        }
    }

    private static class TreeLinkNode {
        int val;
        TreeLinkNode left;
        TreeLinkNode right;
        TreeLinkNode next;
        public TreeLinkNode(int val) {
            this.val = val;
            left = null;
            right = null;
            next = null;
        }
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
////////////////////////////////////////////////////////////////////////////////
        /*
            Tree 1: Basic Binary Tree
                      1
                    /   \
                   2     3
                 /  \     \
                4    5     6
              / \    /    / \
             9   10 11   7   8

             where r1 is the root
         */
////////////////////////////////////////////////////////////////////////////////

        /* Make Tree 1: */
        TreeNode r1 = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode r3 = new TreeNode(3);
        TreeNode r4 = new TreeNode(4);
        TreeNode r5 = new TreeNode(5);
        TreeNode r6 = new TreeNode(6);
        TreeNode r7 = new TreeNode(7);
        TreeNode r8 = new TreeNode(8);
        TreeNode r9 = new TreeNode(9);
        TreeNode r10 = new TreeNode(10);
        TreeNode r11 = new TreeNode(11);

        r1.left = r2;
        r1.right = r3;
        r2.left = r4;
        r2.right = r5;
        r3.right = r6;
        r6.left = r7;
        r6.right = r8;
        r4.left = r9;
        r4.right = r10;
        r5.left = r11;
////////////////////////////////////////////////////////////////////////////////
        /*
            Tree 2: Binary Search Tree
                      100
                    /    \
                   40     180
                 /  \     /
                30   60  110

             where r100 is the root
         */
////////////////////////////////////////////////////////////////////////////////

        /* Making Tree 2: */
        TreeNode r100 = new TreeNode(100);
        TreeNode r40 = new TreeNode(40);
        TreeNode r180 = new TreeNode(180);
        TreeNode r30 = new TreeNode(30);
        TreeNode r60 = new TreeNode(60);
        TreeNode r110 = new TreeNode(110);

        r100.left = r40;
        r100.right = r180;
        r40.left =  r30;
        r40.right = r60;
        r180.left = r110;

////////////////////////////////////////////////////////////////////////////////

        /*
            Tree 3: Symmetric tree
                       12
                    /     \
                   13      13
                 /  \     /  \
                14   15  15  14

             where r12 is the root
         */
////////////////////////////////////////////////////////////////////////////////

        /* Making Tree 3: */
        TreeNode r12 = new TreeNode(12);
        TreeNode r13 = new TreeNode(13);
        TreeNode r13_1 = new TreeNode(13);
        TreeNode r14 = new TreeNode(14);
        TreeNode r14_1 = new TreeNode(14);
        TreeNode r15 = new TreeNode(15);
        TreeNode r15_1 = new TreeNode(15);

        r12.left  = r13;
        r12.right = r13_1;
        r13.left = r14;
        r13.right = r15;
        r13_1.left = r15_1;
        r13_1.right = r14_1;

////////////////////////////////////////////////////////////////////////////////
        /*
            Tree 4: Loosely BST

                       16
                    /     \
                   16      17
                 /  \     /  \
                16   17  17  17

             where r16 is the root
         */
////////////////////////////////////////////////////////////////////////////////

        /* Making Tree 4: */
        TreeNode r16 = new TreeNode(16);
        TreeNode r16_1 = new TreeNode(16);
        TreeNode r16_2 = new TreeNode(16);
        TreeNode r17 = new TreeNode(17);
        TreeNode r17_1 = new TreeNode(17);
        TreeNode r17_2 = new TreeNode(17);
        TreeNode r17_3 = new TreeNode(17);


        r16.left = r16_1;
        r16.right = r17;
        r16_1.left = r16_2;
        r16_1.right = r17_1;
        r17.left = r17_2;
        r17.right = r17_3;


////////////////////////////////////////////////////////////////////////////////
        /*
            Tree 5: Simple BT

                       1
                     /   \
                   2      3

             where r101 is the root
         */
////////////////////////////////////////////////////////////////////////////////

        /* Making Tree 5: */

        TreeNode r101 = new TreeNode(1);
        TreeNode r102 = new TreeNode(2);
        TreeNode r103 = new TreeNode(3);

        r101.left = r102;
        r101.right = r103;

////////////////////////////////////////////////////////////////////////////////

        /* Make lists for 13. rebuildBinaryTreeRec */
        List<Integer> preOrder = new ArrayList<>();
        preOrder.add(1);
        preOrder.add(2);
        preOrder.add(4);
        preOrder.add(9);
        preOrder.add(10);
        preOrder.add(5);
        preOrder.add(11);
        preOrder.add(3);
        preOrder.add(6);
        preOrder.add(7);
        preOrder.add(8);

        /* Make lists for 13. rebuildBinaryTreeRec */
        List<Integer> inOrder = new ArrayList<>();
        inOrder.add(9);
        inOrder.add(4);
        inOrder.add(10);
        inOrder.add(2);
        inOrder.add(11);
        inOrder.add(5);
        inOrder.add(1);
        inOrder.add(3);
        inOrder.add(7);
        inOrder.add(6);
        inOrder.add(8);

        /* Make lists for 22. sortedArrayToBST */
        int[] sortedArray = new int[11];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = i + 1;
        }
//        /* Test for the inorderArray */
//        System.out.print(Arrays.toString(sortedArray));


        /* Make array for 26.1.1 - 26.1.2 */
        int[] inorderArray = {100, 40, 30, 60, 180, 110};
        int[] randomArray = {17, 23, 123, 492, 1,98};
        /*
            Tree 2: Binary Search Tree
                      100
                    /    \
                   40     180
                 /  \     /
                30   60  110

             where r100 is the root
         */

        /* Make lists for 27.1 */

        //    3
        //  /   \
        // 1     5
        //      /
        //     10

        ArrayList<Integer> pid = new ArrayList<>();
        ArrayList<Integer> ppid = new ArrayList<>();
        int kill5 = 5;
        int kill3 = 3;
        int kill10 = 10;

        pid.add(1);
        pid.add(3);
        pid.add(10);
        pid.add(5);

        ppid.add(3);
        ppid.add(0);
        ppid.add(5);
        ppid.add(3);

        /* Make treeNumber and edges for 28.1 */
        int treeNumber = 5;
        int[][] edges = {{0, 1}, {0, 2}, {0, 3}, {1, 4}};
        int[][] edges1 = {{0, 1}, {1, 2}, {2, 3}, {1, 3}, {1,4}};

        /* Make LinkedNode for 22.2.1 */
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);
        ListNode ln4 = new ListNode(4);
        ListNode ln5 = new ListNode(5);
        ListNode ln6 = new ListNode(6);
        ListNode ln7 = new ListNode(7);

        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = ln5;
        ln5.next = ln6;
        ln6.next = ln7;
        ln7.next = null;




////////////////////////////////////////////////////////////////////////////////

                    /* Test all the methods */

//        /* 0.1 */
//        System.out.println("********************* 0.1 *********************");
//        System.out.print("The max value node of Tree 1 is node: ");
//        System.out.println(maxNodeRec(r1).val);
//        System.out.print("The max value node of Tree 2 is node: ");
//        System.out.println(maxNodeRec(r100).val);
//        /* 0.2 */
//        System.out.println("********************* 0.2 *********************");
//        System.out.print("The max value node of Tree 1 is node: ");
//        System.out.println(maxNode(r1).val);
//        System.out.print("The max value node of Tree 2 is node: ");
//        System.out.println(maxNode(r100).val);
//        /* 1.1 */
//        System.out.println("********************** 1.1 **********************");
//        System.out.print("The total number of nodes of Tree 1 is: ");
//        System.out.println(getNodeNumRec(r1));
//        System.out.print("The total number of nodes of Tree 2 is: ");
//        System.out.println(getNodeNumRec(r100));
//        /* 1.2 */
//        System.out.println("********************** 1.2 **********************");
//        System.out.print("The total number of nodes of Tree 1 is: ");
//        System.out.println(getNodeNum(r1));
//        System.out.print("The total number of nodes of Tree 2 is: ");
//        System.out.println(getNodeNum(r100));
//        /* 2.1 */
//        System.out.println("********************** 2.1 **********************");
//        System.out.print("The Depth of Tree 1 is: ");
//        System.out.println(getDepthRec(r1));
//        System.out.print("The Depth of Tree 2 is: ");
//        System.out.println(getDepthRec(r100));
//        /* 2.2 */
//        System.out.println("********************** 2.2 **********************");
//        System.out.print("The Depth of Tree 1 is: ");
//        System.out.println(getDepth(r1));
//        System.out.print("The Depth of Tree 2 is: ");
//        System.out.println(getDepth(r100));
//        /* 2.3 */
//        System.out.println("********************** 2.3 **********************");
//        System.out.print("The Depth of Tree 1 is: ");
//        System.out.println(getDepthTraverse(r1));
//        System.out.print("The Depth of Tree 2 is: ");
//        System.out.println(getDepthTraverse(r100));
//        /* 2.1.1 */
//        System.out.println("******************** 2.1.1 ********************");
//        System.out.print("The minimum depth of Tree 1 is: ");
//        System.out.println(minDepth(r1));
//        System.out.print("The minimum depth of Tree 2 is: ");
//        System.out.println(minDepth(r100));
//        System.out.print("The minimum depth of Tree 3 is: ");
//        System.out.println(minDepth(r12));
//        System.out.print("The minimum depth of Tree 4 is: ");
//        System.out.println(minDepth(r16));
//        /* 3.1 */
//        System.out.println("********************** 3.1 **********************");
//        System.out.print("The Preorder Traversal of Tree 1 is: ");
//        System.out.println();
//        preorderTraversalRec(r1);
//        System.out.println();
//        System.out.print("The Preorder Traversal of Tree 2 is: ");
//        System.out.println();
//        preorderTraversalRec(r100);
//        System.out.println();
//        /* 3.2 */
//        System.out.println("********************** 3.2 **********************");
//        System.out.print("The Preorder Traversal of Tree 1 is: ");
//        System.out.println();
//        preorderTraversal(r1);
//        System.out.println();
//        System.out.print("The Preorder Traversal of Tree 2 is: ");
//        System.out.println();
//        preorderTraversal(r100);
//        System.out.println();
//        /* 3.3 */
//        System.out.println("********************** 3.3 **********************");
//        System.out.print("The Inorder Traversal of Tree 1 is: ");
//        System.out.println();
//        inorderTraversalRec(r1);
//        System.out.println();
//        System.out.print("The Inorder Traversal of Tree 2 is: ");
//        System.out.println();
//        inorderTraversalRec(r100);
//        System.out.println();
//        /* 3.4 */
//        System.out.println("********************** 3.4 **********************");
//        System.out.print("The Inorder Traversal of Tree 1 is: ");
//        System.out.println();
//        inorderTraversal(r1);
//        System.out.println();
//        System.out.print("The Inorder Traversal of Tree 2 is: ");
//        System.out.println();
//        inorderTraversal(r100);
//        System.out.println();
//        /* 3.5 */
//        System.out.println("********************** 3.5 **********************");
//        System.out.print("The Postorder Traversal of Tree 1 is: ");
//        System.out.println();
//        postorderTraversalRec(r1);
//        System.out.println();
//        System.out.print("The Postorder Traversal of Tree 2 is: ");
//        System.out.println();
//        postorderTraversalRec(r100);
//        System.out.println();
//        /* 3.6 */
//        System.out.println("********************** 3.5 **********************");
//        System.out.print("The Postorder Traversal of Tree 1 is: ");
//        System.out.println();
//        postorderTraversal(r1);
//        System.out.println();
//        System.out.print("The Postorder Traversal of Tree 2 is: ");
//        System.out.println();
//        postorderTraversal(r100);
//        System.out.println();
//        /* 3.1.1 */
//        System.out.println("******************** 3.1.1 ********************");
//        System.out.print("The inorder successor of r100 in Tree 2 is: ");
//        System.out.println(inorderSuccessor(r100, r100).val);
//        /* 3.1.2 */
//        System.out.println("******************** 3.1.2 ********************");
//        System.out.print("The inorder predecessor of r100 in Tree 2 is: ");
//        System.out.println(inorderPredecessor(r100, r100).val);
//        /* 4.1 */
//        System.out.println("********************** 4.1 **********************");
//        System.out.print("The Level Traversal of Tree 1 is: ");
//        System.out.println();
//        levelTraversal(r1);
//        System.out.println();
//        System.out.print("The Level Traversal of Tree 2 is: ");
//        System.out.println();
//        levelTraversal(r100);
//        System.out.println();
//        /* 4.2 */
//        System.out.println("********************** 4.2 **********************");
//        System.out.print("The Level Order Traversal of Tree 1 is: ");
//        System.out.println();
//        levelTraversalRec(r1);
//        System.out.print("The Level Order Traversal of Tree 2 is: ");
//        System.out.println();
//        levelTraversalRec(r100);
//        /* 4.3 */
//        System.out.println("********************** 4.3 **********************");
//        System.out.print("The Level Order Traversal of Tree 1 is: ");
//        System.out.println();
//        System.out.println(levelOrderBFS(r1));
//        System.out.print("The Level Order Traversal of Tree 2 is: ");
//        System.out.println();
//        System.out.println(levelOrderBFS(r100));
//        /* 4.1.1 */
//        System.out.println("Tree 1's level order traversal is: ");
//        System.out.println(levelOrderBFS(r1));
//        System.out.println("The average value of each level for tree 1 is: ");
//        System.out.println(averageOfLevels(r1));
//        /* 4.2.1 */
//        System.out.println("******************** 4.2.1 ********************");
//        System.out.println("The largest node val of each level for T1: ");
//        System.out.println(Arrays.toString(largestValuesBFS(r1).toArray()));
//        System.out.println("The largest node val of each level for T2: ");
//        System.out.println(Arrays.toString(largestValuesBFS(r100).toArray()));
//        /* 4.2.2 */
//        System.out.println("******************** 4.2.2 ********************");
//        System.out.println("The largest node val of each level for T3: ");
//        System.out.println(Arrays.toString(largestValuesBFS(r12).toArray()));
//        System.out.println("The largest node val of each level for T4: ");
//        System.out.println(Arrays.toString(largestValuesBFS(r16).toArray()));
//        /* 4.3.1 */
//        System.out.println("******************** 4.3.1 ********************");
//        System.out.println("The new tree for T1 add '16' to '3rd' level");
//        System.out.println(levelOrderBFS(addOneRowDFS(r1, 16, 3)));
//        System.out.println("The new tree for T2 add '100' to '1st' level");
//        System.out.println(levelOrderBFS(addOneRowDFS(r100, 100, 1)));
//        /* 4.3.2 */
//        System.out.println("******************** 4.3.2 ********************");
//        System.out.println("The new tree for T3 add '1' to '3rd' level");
//        System.out.println(levelOrderBFS(addOneRowDFS(r12, 1, 3)));
//        System.out.println("The new tree for T4 add '3' to '2nd' level");
//        System.out.println(levelOrderBFS(addOneRowDFS(r16, 3, 2)));
//        /* 4.4.1 */
//        System.out.println("******************** 4.4.1 ********************");
//        System.out.println("The right view of the Tree 1 is: ");
//        System.out.println(Arrays.toString(rightSideViewBFS(r1).toArray()));
//        System.out.println("The right view of the Tree 2 is: ");
//        System.out.println(Arrays.toString(rightSideViewBFS(r100).toArray()));
//        System.out.println("The right view of the Tree 3 is: ");
//        System.out.println(Arrays.toString(rightSideViewBFS(r12).toArray()));
//        System.out.println("The right view of the Tree 4 is: ");
//        System.out.println(Arrays.toString(rightSideViewBFS(r16).toArray()));
//        /* 4.4.2 */
//        System.out.println("******************** 4.4.2 ********************");
//        System.out.println("The right view of the Tree 1 is: ");
//        System.out.println(Arrays.toString(rightSideViewDFS(r1).toArray()));
//        System.out.println("The right view of the Tree 2 is: ");
//        System.out.println(Arrays.toString(rightSideViewDFS(r100).toArray()));
//        System.out.println("The right view of the Tree 3 is: ");
//        System.out.println(Arrays.toString(rightSideViewDFS(r12).toArray()));
//        System.out.println("The right view of the Tree 4 is: ");
//        System.out.println(Arrays.toString(rightSideViewDFS(r16).toArray()));
//        /* 4.5.1 - 4.5.4 */
//        No test cases for these two just understand the concept
//        /* 4.6.1 */
//        System.out.println("******************** 4.6.1 ********************");
//        System.out.println("The vertical order traversal of Tree 1 is :");
//        System.out.println(Arrays.deepToString(verticalOrderTreeMap(r1).toArray()));
//        System.out.println("The vertical order traversal of Tree 2 is :");
//        System.out.println(Arrays.deepToString(verticalOrderTreeMap(r100).toArray()));
//        System.out.println("The vertical order traversal of Tree 3 is :");
//        System.out.println(Arrays.deepToString(verticalOrderTreeMap(r12).toArray()));
//        System.out.println("The vertical order traversal of Tree 4 is :");
//        System.out.println(Arrays.deepToString(verticalOrderTreeMap(r16).toArray()));
//        /* 4.6.2 */
//        System.out.println("******************** 4.6.2 ********************");
//        System.out.println("The vertical order traversal of Tree 1 is :");
//        System.out.println(Arrays.deepToString(verticalOrderHashMap(r1).toArray()));
//        System.out.println("The vertical order traversal of Tree 2 is :");
//        System.out.println(Arrays.deepToString(verticalOrderHashMap(r100).toArray()));
//        System.out.println("The vertical order traversal of Tree 3 is :");
//        System.out.println(Arrays.deepToString(verticalOrderHashMap(r12).toArray()));
//        System.out.println("The vertical order traversal of Tree 4 is :");
//        System.out.println(Arrays.deepToString(verticalOrderHashMap(r16).toArray()));
//        /* 4.7.1 */
//        System.out.println("******************** 4.7.1 ********************");
//        System.out.println("The ZigZag traversal for Tree 1 is: ");
//        System.out.println(Arrays.deepToString(zigzagLevelOrder(r1).toArray
//                ()));
//        System.out.println("The ZigZag traversal for Tree 2 is: ");
//        System.out.println(Arrays.deepToString(zigzagLevelOrder(r100).toArray
//                ()));
//        System.out.println("The ZigZag traversal for Tree 3 is: ");
//        System.out.println(Arrays.deepToString(zigzagLevelOrder(r12).toArray
//                ()));
//        System.out.println("The ZigZag traversal for Tree 4 is: ");
//        System.out.println(Arrays.deepToString(zigzagLevelOrder(r16).toArray
//                ()));
//        /* 5.1 */
//        System.out.println("********************** 5.1 **********************");
//        System.out.println("Converting Tree 1 to DDL: ");
//        TreeNode ret = convertBST2DLLRec(r1);
//        while (ret != null) {
//            System.out.print(ret.val + " <-> ");
//            ret = ret.right;
//        }
//        System.out.println();
//        System.out.println("Converting Tree 2 to DDL: ");
//        TreeNode ret100 = convertBST2DLLRec(r100);
//        while (ret100 != null) {
//            System.out.print(ret100.val + " <-> ");
//            ret100 = ret100.right;
//        }
//        System.out.println();
//        /* 6.1 */
//        System.out.println("********************** 6.1 **********************");
//        levelTraversalRec(r1);
//        System.out.println("The 1st level of Tree 1 to DDL: "
//                + getNodeNumKth(r1, 1));
//        System.out.println("The 2nd level of Tree 1 to DDL: "
//                + getNodeNumKth(r1, 2));
//        System.out.println("The 3rd level of Tree 1 to DDL: "
//                + getNodeNumKth(r1, 3));
//        System.out.println("The 4th level of Tree 1 to DDL: "
//                + getNodeNumKth(r1, 4));
//        levelTraversalRec(r100);
//        System.out.println("The 1st level of Tree 2 to DDL: "
//                + getNodeNumKth(r100, 1));
//        System.out.println("The 2nd level of Tree 2 to DDL: "
//                + getNodeNumKth(r100, 2));
//        System.out.println("The 3rd level of Tree 2 to DDL: "
//                + getNodeNumKth(r100, 3));
//        System.out.println("The 4th level of Tree 2 to DDL: "
//                + getNodeNumKth(r100, 4));
//        /* 6.2 */
//        System.out.println("********************** 6.2 **********************");
//        levelTraversalRec(r1);
//        System.out.println("The 1st level of Tree 1 to DDL: "
//                + getNodeNumKthLevelRec(r1, 1));
//        System.out.println("The 2nd level of Tree 1 to DDL: "
//                + getNodeNumKthLevelRec(r1, 2));
//        System.out.println("The 3rd level of Tree 1 to DDL: "
//                + getNodeNumKthLevelRec(r1, 3));
//        System.out.println("The 4th level of Tree 1 to DDL: "
//                + getNodeNumKthLevelRec(r1, 4));
//        levelTraversalRec(r100);
//        System.out.println("The 1st level of Tree 2 to DDL: "
//                + getNodeNumKthLevelRec(r100, 1));
//        System.out.println("The 2nd level of Tree 2 to DDL: "
//                + getNodeNumKthLevelRec(r100, 2));
//        System.out.println("The 3rd level of Tree 2 to DDL: "
//                + getNodeNumKthLevelRec(r100, 3));
//        System.out.println("The 4th level of Tree 2 to DDL: "
//                + getNodeNumKthLevelRec(r100, 4));
//
//        /* 7.1 */
//        System.out.println("********************** 7.1 **********************");
//        System.out.println("The total number of leaves of Tree 1 is : "
//                + getNodeNumLeafRec(r1));
//        System.out.println("The total number of leaves of Tree 2 is : "
//                + getNodeNumLeafRec(r100));
//        /* 7.2 */
//        System.out.println("********************** 7.2 **********************");
//        System.out.println("The total number of leaves of Tree 1 is : "
//                + getNodeNumLeafInorder(r1));
//        System.out.println("The total number of leaves of Tree 2 is : "
//                + getNodeNumLeafInorder(r100));
//        /* 7.3 */
//        System.out.println("********************** 7.3 **********************");
//        System.out.println("The total number of leaves of Tree 1 is : "
//                + getNodeNumLeafPreorder(r1));
//        System.out.println("The total number of leaves of Tree 2 is : "
//                + getNodeNumLeafPreorder(r100));
//        /* 7.4 */
//        System.out.println("********************** 7.4 **********************");
//        System.out.println("The total number of leaves of Tree 1 is : "
//                + getNodeNumLeafPostorder(r1));
//        System.out.println("The total number of leaves of Tree 2 is : "
//                + getNodeNumLeafPostorder(r100));

//        /* 8.1 */
//        System.out.println("********************** 8.1 **********************");
//        System.out.print("Are the two trees the same" + " (r1, r1): ");
//        System.out.println(isSameRec(r1, r1));
//        System.out.print("Are the two trees the same" + " (r2, r4): ");
//        System.out.println(isSameRec(r2, r4));
//        System.out.print("Are the two trees the same" + " (r8, r8): ");
//        System.out.println(isSameRec(r8, r8));
//        System.out.print("Are the two trees the same" + " (r100, r100): ");
//        System.out.println(isSameRec(r100, r100));
//        System.out.print("Are the two trees the same" + " (r60, r40): ");
//        System.out.println(isSameRec(r60, r40));
//        System.out.print("Are the two trees the same" + " (r30, r30): ");
//        System.out.println(isSameRec(r30, r30));
//        /* 8.2 */
//        System.out.println("********************** 8.2 **********************");
//        System.out.print("Are the two trees the same" + " (r1, r1): ");
//        System.out.println(isSameInorder(r1, r1));
//        System.out.print("Are the two trees the same" + " (r2, r4): ");
//        System.out.println(isSameInorder(r2, r4));
//        System.out.print("Are the two trees the same" + " (r8, r8): ");
//        System.out.println(isSameInorder(r8, r8));
//        System.out.print("Are the two trees the same" + " (r100, r100): ");
//        System.out.println(isSameInorder(r100, r100));
//        System.out.print("Are the two trees the same" + " (r60, r40): ");
//        System.out.println(isSameInorder(r60, r40));
//        System.out.print("Are the two trees the same" + " (r30, r30): ");
//        System.out.println(isSameInorder(r30, r30));
//        /* 8.3 */
//        System.out.println("********************** 8.3 **********************");
//        System.out.print("Are the two trees the same" + " (r1, r1): ");
//        System.out.println(isSamePreorder(r1, r1));
//        System.out.print("Are the two trees the same" + " (r2, r4): ");
//        System.out.println(isSamePreorder(r2, r4));
//        System.out.print("Are the two trees the same" + " (r8, r8): ");
//        System.out.println(isSamePreorder(r8, r8));
//        System.out.print("Are the two trees the same" + " (r100, r100): ");
//        System.out.println(isSamePreorder(r100, r100));
//        System.out.print("Are the two trees the same" + " (r60, r40): ");
//        System.out.println(isSamePreorder(r60, r40));
//        System.out.print("Are the two trees the same" + " (r30, r30): ");
//        System.out.println(isSamePreorder(r30, r30));
//        /* 9.1 */
//        System.out.println("********************** 9.1 **********************");
//        System.out.print("The tree is an balanced binary tree: " + "(r1): " );
//        System.out.println(isAVLRec(r1));
//        System.out.print("The tree is an balanced binary tree: " + "(r2): " );
//        System.out.println(isAVLRec(r2));
//        System.out.print("The tree is an balanced binary tree: " + "(r3): " );
//        System.out.println(isAVLRec(r3));
//        System.out.print("The tree is an balanced binary tree: " + "(r4): " );
//        System.out.println(isAVLRec(r4));
//        System.out.print("The tree is an balanced binary tree: " + "(r5): " );
//        System.out.println(isAVLRec(r5));
//        System.out.print("The tree is an balanced binary tree: " + "(r6): " );
//        System.out.println(isAVLRec(r6));
//        System.out.print("The tree is an balanced binary tree: " + "(r100): " );
//        System.out.println(isAVLRec(r100));
//        /* 9.2 */
//        System.out.println("********************** 9.2 **********************");
//        System.out.print("The tree is an balanced binary tree: " + "(r1): " );
//        System.out.println(isAVLResultType(r1));
//        System.out.print("The tree is an balanced binary tree: " + "(r2): " );
//        System.out.println(isAVLResultType(r2));
//        System.out.print("The tree is an balanced binary tree: " + "(r3): " );
//        System.out.println(isAVLResultType(r3));
//        System.out.print("The tree is an balanced binary tree: " + "(r4): " );
//        System.out.println(isAVLResultType(r4));
//        System.out.print("The tree is an balanced binary tree: " + "(r5): " );
//        System.out.println(isAVLResultType(r5));
//        System.out.print("The tree is an balanced binary tree: " + "(r6): " );
//        System.out.println(isAVLResultType(r6));
//        System.out.print("The tree is an balanced binary tree: " + "(r100): " );
//        System.out.println(isAVLResultType(r100));
//        /* 10.1 */
//        System.out.println("********************* 10.1 *********************");
//        System.out.println("The original tree1 is : ");
//        System.out.println(levelOrderBFS(r1));
//        System.out.println("The mirror tree1 is : ");
//        System.out.println(levelOrderBFS(mirrorRec(r1)));
//        System.out.println("The original tree2 is : ");
//        System.out.println(levelOrderBFS(r100));
//        System.out.println("The mirror tree2 is : ");
//        System.out.println(levelOrderBFS(mirrorRec(r100)));
//        /* 10.2 */
//        System.out.println("********************* 10.2 *********************");
//        System.out.println("The original tree1 is : ");
//        System.out.println(levelOrderBFS(r1));
//        System.out.println("The mirror tree1 is : ");
//        System.out.println(levelOrderBFS(mirror(r1)));
//        System.out.println("The original tree2 is : ");
//        System.out.println(levelOrderBFS(r100));
//        System.out.println("The mirror tree2 is : ");
//        System.out.println(levelOrderBFS(mirror(r100)));
//        /* 10.3 */
//        System.out.println("********************* 10.3 *********************");
//        System.out.println("The original tree1 is : ");
//        System.out.println(levelOrderBFS(r1));
//        System.out.println("The mirror tree1 is : ");
//        System.out.println(levelOrderBFS(mirrorCopyRec(r1)));
//        System.out.println("The original tree2 is : ");
//        System.out.println(levelOrderBFS(r100));
//        System.out.println("The mirror tree2 is : ");
//        System.out.println(levelOrderBFS(mirrorCopyRec(r100)));
//        /* 10.4 */
//        System.out.println("********************* 10.4 *********************");
//        System.out.println("The original tree1 is : ");
//        System.out.println(levelOrderBFS(r1));
//        System.out.println("The mirror tree1 is : ");
//        System.out.println(levelOrderBFS(mirrorCopy(r1)));
//        System.out.println("The original tree2 is : ");
//        System.out.println(levelOrderBFS(r100));
//        System.out.println("The mirror tree2 is : ");
//        System.out.println(levelOrderBFS(mirrorCopy(r100)));
//        /* 10.1.1 */
//        System.out.println("******************* 10.1.1 *******************");
//        System.out.println("Comparing the tree 1 and its mirror copy : ");
//        System.out.println(isMirror(r1,mirrorCopy(r1)));
//        System.out.println("Comparing the tree 1 and tree 1 : ");
//        System.out.println(isMirror(r1, r1));
//        System.out.println("Comparing the tree 2 and its mirror copy : ");
//        System.out.println(isMirror(r100,mirrorCopy(r100)));
//        System.out.println("Comparing the tree 2 and tree 2 : ");
//        System.out.println(isMirror(r100, r100));
//        /* 10.1.2 */
//        System.out.println("******************* 10.1.2 *******************");
//        System.out.println("Comparing the tree 1 and its mirror copy : ");
//        System.out.println(isMirrorRec(r1,mirrorCopyRec(r1)));
//        System.out.println("Comparing the tree 1 and tree 1 : ");
//        System.out.println(isMirrorRec(r1, r1));
//        System.out.println("Comparing the tree 2 and its mirror copy : ");
//        System.out.println(isMirrorRec(r100,mirrorCopyRec(r100)));
//        System.out.println("Comparing the tree 2 and tree 2 : ");
//        System.out.println(isMirrorRec(r100, r100));
//        /* 10.2.1 */
//        System.out.println("******************** 10.2.1 ********************");
//        System.out.print("Tree 1 is symmetric: ");
//        System.out.println(isSymmetricCS(r1));
//        System.out.print("Tree 2 is symmetric: ");
//        System.out.println(isSymmetricCS(r100));
//        System.out.print("Tree 3 is symmetric: ");
//        System.out.println(isSymmetricCS(r12));
//        /* 10.2.2 */
//        System.out.println("******************** 10.2.2 ********************");
//        System.out.print("Tree 1 is symmetric: ");
//        System.out.println(isSymmetricMR(r1));
//        System.out.print("Tree 2 is symmetric: ");
//        System.out.println(isSymmetricMR(r100));
//        System.out.print("Tree 3 is symmetric: ");
//        System.out.println(isSymmetricMR(r12));
//        /* 10.2.3 */
//        System.out.println("******************** 10.2.3 ********************");
//        System.out.print("Tree 1 is symmetric: ");
//        System.out.println(isSymmetricM(r1));
//        System.out.print("Tree 2 is symmetric: ");
//        System.out.println(isSymmetricM(r100));
//        System.out.print("Tree 3 is symmetric: ");
//        System.out.println(isSymmetricM(r12));
//        /* 11.1 */
//        System.out.println("********************* 11.1 *********************");
//        System.out.print("The Least Common Ancestor of r5 and r10: r");
//        System.out.println(LCA(r1, r10, r5).val);
//        System.out.print("The Least Common Ancestor of r30 and r60: r");
//        System.out.println(LCA(r100, r30, r60).val);
//        /* 11.2 */
//        System.out.println("********************* 11.2 *********************");
//        System.out.print("The Least Common Ancestor of r2 and r8: r");
//        System.out.println(LCARec(r1, r2, r8).val);
//        System.out.print("The Least Common Ancestor of r110 and r180: r");
//        System.out.println(LCARec(r100, r110, r180).val);
//        /* 11.3 */
//        System.out.println("********************* 11.3 *********************");
//        System.out.print("The Least Common Ancestor of r110 and r180: r");
//        System.out.println(LCABstRec(r100, r110, r180).val);
//        System.out.print("The Least Common Ancestor of r60 and r30: r");
//        System.out.println(LCABstRec(r100, r60, r30).val);
//        /* 12.1 */
//        System.out.println("********************* 12.1 *********************");
//        System.out.print("The max distance of Tree 1 is: ");
//        System.out.println(getMaxDistanceRec(r1));
//        System.out.print("The max distance of Tree 2 is: ");
//        System.out.println(getMaxDistanceRec(r100));
//        /* 13.1 */
//        System.out.println("********************* 13.1 *********************");
//        System.out.println("The newly built tree's preorder traversal is: ");
//        preorderTraversalRec(rebuildBinaryTreeRec(preOrder, inOrder));
//        System.out.println();
//        System.out.println("The Tree1's preorder traversal is: ");
//        preorderTraversalRec(r1);
//        System.out.println();
//        System.out.println();
//        System.out.println("The newly built tree's inorder traversal is: ");
//        inorderTraversalRec(rebuildBinaryTreeRec(preOrder, inOrder));
//        System.out.println();
//        System.out.println("The Tree1's inorder traversal is: ");
//        inorderTraversalRec(r1);
//        /* 14.1 14.2 14.3 */
//        System.out.println("********************* 14 *********************");
//        System.out.print("Tree 2 a complete BT : ");
//        System.out.println(isCompleteBinaryTree(r100));
//        System.out.print("Tree 1 a complete BT : ");
//        System.out.println(isCompleteBinaryTree(r1));
//        System.out.println();
//        System.out.print("Tree 2 a complete BT : ");
//        System.out.println(isCompleteBinaryTreeNoDummy(r100));
//        System.out.print("Tree 1 a complete BT : ");
//        System.out.println(isCompleteBinaryTreeNoDummy(r1));
//        System.out.println();
//        System.out.print("Tree 2 a complete BT : ");
//        System.out.println(isCompleteBinaryTreeRec(r100));
//        System.out.print("Tree 1 a complete BT : ");
//        System.out.println(isCompleteBinaryTreeRec(r1));
//        /* 14.1.1 */
//        System.out.println("******************** 14.1.1 ********************");
//        System.out.print("The total number of nodes in tree 2 is: ");
//        System.out.println(countNodesCompleteBTRec(r100));
//        System.out.print("The total number of nodes in tree 3 is: ");
//        System.out.println(countNodesCompleteBTRec(r12));
//        /* 14.1.2 */
//        System.out.println("******************** 14.1.2 ********************");
//        System.out.print("The total number of nodes in tree 2 is: ");
//        System.out.println(countNodesCompleteBT(r100));
//        System.out.print("The total number of nodes in tree 3 is: ");
//        System.out.println(countNodesCompleteBT(r12));
//        /* 15.1 */
//        System.out.println("********************* 15.1 *********************");
//        System.out.print("The longest path from root to leaf for Tree1 is: ");
//        System.out.println(findLongest(r1));
//        System.out.print("The longest path from root to leaf for Tree2 is: ");
//        System.out.println(findLongest(r100));
//        /* 15.1.1 */
//        System.out.println("******************** 15.1.1 ********************");
//        System.out.println("All the root to leaf paths for Tree 1 are: ");
//        for (String s : binaryTreePathsWithHelp(r1)) {
//            System.out.println(s);
//        }
//        System.out.println("All the root to leaf paths for Tree 2 are: ");
//        for (String s : binaryTreePathsWithHelp(r100)) {
//            System.out.println(s);
//        }
//        /* 15.1.2 */
//        System.out.println("******************** 15.1.2 ********************");
//        System.out.println("All the root to leaf paths for Tree 3 are: ");
//        for (String s : binaryTreePaths(r12)) {
//            System.out.println(s);
//        }
//        System.out.println("All the root to leaf paths for Tree 4 are: ");
//        for (String s : binaryTreePaths(r16)) {
//            System.out.println(s);
//        }
//        /* 15.2.1 */
//        System.out.println("******************** 15.2.1 ********************");
//        System.out.print("The number of longest consecutive path for T1 is: ");
//        System.out.println(longestConsecutivePreDFS(r1));
//        System.out.print("The number of longest consecutive path for T3 is: ");
//        System.out.println(longestConsecutivePreDFS(r12));
//        System.out.print("The number of longest consecutive path for T4 is: ");
//        System.out.println(longestConsecutivePreDFS(r16));
//        /* 15.2.2 */
//        System.out.println("******************** 15.2.2 ********************");
//        System.out.print("The number of longest consecutive path for T3 is: ");
//        System.out.println(longestConsecutivePostDFS(r12));
//        /* 15.3.1 */
//        System.out.println("******************** 15.3.1 ********************");
//        System.out.println("Length of the longest consecutive sequence path of tree 1 (any to any) is: ");
//        System.out.println(longestConsecutiveII(r1));
//        System.out.println("Length of the longest consecutive sequence path of tree 2 (any to any) is: ");
//        System.out.println(longestConsecutiveII(r100));
//        System.out.println("Length of the longest consecutive sequence path of tree 3 (any to any) is: ");
//        System.out.println(longestConsecutiveII(r12));
//        System.out.println("Length of the longest consecutive sequence path of tree 4 (any to any) is: ");
//        System.out.println(longestConsecutiveII(r16));
//        /* 16.1 */
//        System.out.println("********************* 16.1 *********************");
//        System.out.println("The original Tree 1: ");
//        System.out.println(levelOrderBFS(r1));
//        System.out.println("Merging Tree 1 and Tree 1: ");
//        System.out.println(levelOrderBFS(mergeTrees(r1, r1)));
//        /* 17.1 */
//        System.out.println("********************* 17.1 *********************");
//        System.out.println("The original Tree 1: ");
//        preorderTraversal(r1);
//        System.out.println();
//        System.out.println("The string which is constructed by Tree 1: ");
//        System.out.println(tree2strRec(r1));
//        System.out.println();
//        System.out.println("The original Tree 2: ");
//        preorderTraversal(r100);
//        System.out.println();
//        System.out.println("The string which is constructed by Tree 2: ");
//        System.out.println(tree2strRec(r100));
//        /* 17.2 */
//        System.out.println("********************* 17.2 *********************");
//        System.out.println("The original Tree 1: ");
//        preorderTraversal(r1);
//        System.out.println();
//        System.out.println("The string which is constructed by Tree 1: ");
//        System.out.println(tree2str(r1));
//        System.out.println();
//        System.out.println("The original Tree 2: ");
//        preorderTraversal(r100);
//        System.out.println();
//        System.out.println("The string which is constructed by Tree 2: ");
//        System.out.println(tree2str(r100));
//        /* 17.1.1 */
//        System.out.println("******************** 17.1.1 ********************");
//        System.out.println("The Tree we can form from the String '4(2(3)(1))(6(5))' is: ");
//        System.out.println(levelOrderBFS(str2tree("4(2(3)(1))(6(5))")));
//        /* 18.1 Tree2 We can't test Tree1 since it's not a BST */
//        System.out.println("********************* 18.1 *********************");
//        System.out.print("The min abs distance between any nodes in Tree2: ");
//        System.out.println(getMinimumDifference(r100));
//        /* 18.2 */
//        System.out.println("********************* 18.2 *********************");
//        System.out.print("The min abs distance between any nodes in Tree1: ");
//        System.out.println(getMinimumDifferenceArrayList(r1));
//        System.out.print("The min abs distance between any nodes in Tree2: ");
//        System.out.println(getMinimumDifferenceArrayList(r100));
//        /* 18.3 Tree1 */
//        System.out.println("********************* 18.3 *********************");
//        System.out.print("The min abs distance between any nodes in Tree1: ");
//        System.out.println(getMinimumDifferenceTreeSet(r1));
//        /* 18.3 Tree2 */
//        System.out.print("The min abs distance between any nodes in Tree2: ");
//        System.out.println(getMinimumDifferenceTreeSet(r100));
//        /* 19.1 Tree 1 */
//        System.out.println("********************* 19.1 *********************");
//        System.out.print("The tilt of Tree 1 is: ");
//        System.out.println(findTilt(r1));
//        System.out.println("Expected Number is: " + (1 + 11 + 1 + 7 + 21 + 17));
//        /* 19.1 Tree 2 */
//        System.out.print("The tilt of Tree 2 is: ");
//        System.out.println(findTilt(r100));
//        System.out.println("Expected Number is: " + (30 + 110 + 290 - 130));
//        /* 20.1, 20.2 */
//        System.out.println("********************* 20.1 *********************");
//        System.out.println("The original Tree 2 is: ");
//        inorderTraversal(r100);
//        System.out.println();
//        System.out.println("The Greater Tree of Tree 2 is: ");
//        inorderTraversal(convertBST(r100));
//        System.out.println("********************* 20.2 *********************");
//        System.out.println("The Greater tree of Tree 2 is: ");
//        inorderTraversal(r100);
//        System.out.println();
//        System.out.println("The Greater Greater Tree of Tree 2 is: ");
//        inorderTraversal(convertBSTRec(r100));
//        /* 21.1 */
//        System.out.println("********************* 21.1 *********************");
//        /* 21.1 Tree 1 */
//        System.out.print("All the sum of Tree1's LEFT leaves is: ");
//        System.out.println(sumOfLeftLeavesRecVoid(r1));
//        /* 21.1 Tree 2 */
//        System.out.print("All the sum of Tree2's LEFT leaves is: ");
//        System.out.println(sumOfLeftLeavesRecVoid(r100));
//        /* 21.2 */
//        System.out.println("********************* 21.2 *********************");
//        System.out.print("All the sum of Tree1's LEFT leaves is: ");
//        System.out.println(sumOfLeftLeavesRec(r1));
//        System.out.print("All the sum of Tree2's LEFT leaves is: ");
//        System.out.println(sumOfLeftLeavesRec(r100));
//        /* 21.3 */
//        System.out.println("********************* 21.3 *********************");
//        System.out.print("All the sum of Tree1's LEFT leaves is: ");
//        System.out.println(sumOfLeftLeavesBFS(r1));
//        System.out.print("All the sum of Tree2's LEFT leaves is: ");
//        System.out.println(sumOfLeftLeavesBFS(r100));
//        /* 21.1.1 ~ 21.1.2 */
//        System.out.println("******************** 21.1.1 ********************");
//        System.out.println("The Collected leaves for Tree 1 is: ");
//        for (List list : findLeavesHeight(r1)) {
//            System.out.print(Arrays.toString(list.toArray()) + " ");
//        }
//        System.out.println();
//        System.out.println("The Collected leaves for Tree 2 is: ");
//        for (List list : findLeavesHeight(r100)) {
//            System.out.print(Arrays.toString(list.toArray()) + " ");
//        }
//        System.out.println();
//        System.out.println("The Collected leaves for Tree 3 is: ");
//        for (List list : findLeavesIsLeave(r12)) {
//            System.out.print(Arrays.toString(list.toArray()) + " ");
//        }
//        System.out.println();
//        System.out.println("The Collected leaves for Tree 4 is: ");
//        for (List list : findLeavesIsLeave(r16)) {
//            System.out.print(Arrays.toString(list.toArray()) + " ");
//        }
//        /* 21.2.1*/
//        System.out.println("******************** 21.2.1 ********************");
//        System.out.print("The leftmost node's value for Tree 1 is: ");
//        System.out.println(findBottomLeftValueBFS(r1));
//        System.out.print("The leftmost node's value for Tree 2 is: ");
//        System.out.println(findBottomLeftValueBFS(r100));
//        /* 21.2.2*/
//        System.out.println("******************* 21.2.2 *******************");
//        /* Tree 3 */
//        System.out.print("The leftmost node's value for Tree 3 is: ");
//        System.out.println(findBottomLeftValueRec(r12));
//        /* Tree 4 */
//        System.out.print("The leftmost node's value for Tree 4 is: ");
//        System.out.println(findBottomLeftValueRec(r16));
//        /* 21.3.1 */
//        System.out.println("******************* 21.3.1 *******************");
//        System.out.println("The boundary of the Tree 1 is : ");
//        System.out.println(Arrays.toString(boundaryOfBinaryTree(r1).toArray()));
//        /* 22.1 */
//        System.out.println("********************* 22.1 *********************");
//        System.out.println("The converted BST by 'sortedArray' is : ");
//        System.out.println(levelOrderBFS(sortedArrayToBST(sortedArray)));
//        System.out.println("Test the inorder traversal for the new BST:  ");
//        inorderTraversal(sortedArrayToBST(sortedArray));
//        /* 22.1.1 */
//        System.out.println("******************** 22.1.1 ********************");
//        System.out.println("Tree 2 after serialization: ");
//        System.out.println(serializeWithNull(r100));
//        System.out.println("Tree 2 after deserialization: ");
//        System.out.println(levelOrderBFS(deserializeWithNull(serializeWithNull(r100))));
//        /* 22.1.2 */
//        System.out.println("******************** 22.1.2 ********************");
//        System.out.println("Tree 2 after serialization: ");
//        System.out.println(serializeBFS(r100));
//        System.out.println("Tree 2 after deserialization: ");
//        System.out.println(levelOrderBFS(deserializeBFS(serializeBFS(r100))));
//        /* 22.2.1 */
//        System.out.println("******************** 22.2.1 ********************");
//        System.out.println("Convert the sorted list 1 - 7 to a balanced BST: ");
//        System.out.println(levelOrderBFS(sortedListToBST(ln1)));
//        /* 23.1 */
//        System.out.println("********************* 23.1 *********************");
//        System.out.print("r1 is the subtree of r1 : ");
//        System.out.println(isSubtree(r1, r1));
//        System.out.print("r5 is the subtree of r1 : ");
//        System.out.println(isSubtree(r1, r5));
//        System.out.print("r1 is the subtree of r5 : ");
//        System.out.println(isSubtree(r5, r1));
//        System.out.print("r1 is the subtree of r100 : ");
//        System.out.println(isSubtree(r1, r100));
//        System.out.print("r110 is the subtree of r100 : ");
//        System.out.println(isSubtree(r100, r110));
//        /* 23.1.1 */
//        System.out.println("******************** 23.1.1 ********************");
//        /* Tree 3 */
//        System.out.println("The most frequent subtree sum for Tree 3 is: ");
//        System.out.println(Arrays.toString(findFrequentTreeSum(r12)));
//        /* Tree 4 */
//        System.out.println("The most frequent subtree sum for Tree 4 is: ");
//        System.out.println(Arrays.toString(findFrequentTreeSum(r16)));
//        /* 23.2.1 */
//        System.out.println("******************** 23.2.1 ********************");
//        System.out.print("The number of Univalue subtree for T4 is: ");
//        System.out.println(countUnivalSubtreesGlobal(r16));
//        /* 23.2.2 */
//        System.out.println("******************** 23.2.2 ********************");
//        System.out.print("The number of Univalue subtree for T4 is: ");
//        System.out.println(countUnivalSubtreesRec(r16));
//        /* 23.3.1 */
//        System.out.println("******************** 23.3.1 ********************");
//        System.out.print("The largest number of nodes in Tree 2's subtree is: ");
//        System.out.println(largestBSTSubtreeRec(r100));
//        /* 23.3.2 */
//        System.out.println("******************** 23.3.2 ********************");
//        System.out.print("The largest number of nodes in Tree 2's subtree is: ");
//        System.out.println(largestBSTSubtreeResultType(r100));
//        /* 23.4.1 */
//        System.out.println("******************** 23.4.1 ********************");
//        System.out.print("The duplicate subtree of nodes in Tree 1: ");
//        for (TreeNode node : findDuplicateSubtrees(r1)) {
//            System.out.print(node.val + " ");
//        }
//        System.out.println();
//
//        System.out.print("The duplicate subtree of nodes in Tree 2: ");
//        for (TreeNode node : findDuplicateSubtrees(r100)) {
//            System.out.print(node.val + " ");
//        }
//        System.out.println();
//        System.out.print("The duplicate subtree of nodes in Tree 3: ");
//        for (TreeNode node : findDuplicateSubtrees(r12)) {
//            System.out.print(node.val + " ");
//        }
//        System.out.println();
//        System.out.print("The duplicate subtree of nodes in Tree 4: ");
//        for (TreeNode node : findDuplicateSubtrees(r16)) {
//            System.out.print(node.val + " ");
//        }
//        System.out.println();
//        /* 24.1 */
//        System.out.println("********************* 24.1 *********************");
//        System.out.print("Tree 1 has a path sum of 17 : ");
//        System.out.println(hasPathSum(r1, 17));
//        System.out.print("Tree 1 has a path sum of 55 : ");
//        System.out.println(hasPathSum(r1, 55));
//        System.out.print("Tree 2 has a path sum of 200 : ");
//        System.out.println(hasPathSum(r100, 200));
//        System.out.print("Tree 2 has a path sum of  300 : ");
//        System.out.println(hasPathSum(r100, 300));
//        /* 24.2 */
//        System.out.println("********************* 24.2 *********************");
//        System.out.println("The Path Sum of Tree 1 equals 17 is : ");
//        List<List<Integer>> result = binaryTreePathSumList(r1, 17);
//        for (List list : result) {
//            for (Object element : list) {
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("The Path Sum of Tree 2 equals 200 is : ");
//        List<List<Integer>> result2 = binaryTreePathSumList(r100, 200);
//        for (List list : result2) {
//            for (Object element : list) {
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }
//        /* 24.3 */
//        System.out.println("********************* 24.3 *********************");
//        System.out.print("The total number of paths for sum 16 for T1 is: ");
//        System.out.println(pathSumIII(r1, 16));
//        /* 24.1.1 */
//        System.out.println("******************** 24.1.1 ********************");
//        System.out.print("The Maximum Path Sum of Tree 1 is : ");
//        System.out.println(maxPathSumResultType(r1));
//        System.out.print("The Maximum Path Sum of Tree 2 is : ");
//        System.out.println(maxPathSumResultType(r100));
//        /* 24.1.2 Tree 1 */
//        System.out.println("******************** 24.1.2 ********************");
//        System.out.print("The Maximum Path Sum of Tree 1 is : ");
//        System.out.println(maxPathSumGlobalRec(r1));
//        /* 24.1.2 Tree 2 */
//        System.out.print("The Maximum Path Sum of Tree 2 is : ");
//        System.out.println(maxPathSumGlobalRec(r100));
//
//        System.out.print("The total number of paths for sum 100 for T1 is: ");
//        System.out.println(pathSumIII(r100, 100));
//        /* 25.1 */
//        System.out.println("********************* 25.1 *********************");
//        System.out.print("The closest value in Tree1 comparing to 6.7 is: ");
//        System.out.println(closestValue(r1, 6.7));
//        System.out.print("The closest value in Tree1 comparing to 55.0 is: ");
//        System.out.println(closestValue(r100, 55.0));
//        /* 25.1.1 */
//        System.out.println("******************** 25.1.1 ********************");
//        System.out.print("5th Smallest Element in Tree 2 is: ");
//        System.out.println(kthSmallestBS(r100, 5));
//        System.out.print("3rd Smallest Element in Tree 2 is: ");
//        System.out.println(kthSmallestBS(r100, 3));
//        /* 25.2.1 */
//        System.out.println("******************** 25.2.1 ********************");
//        System.out.println("The 1 smallest value to the target 80 is: ");
//        System.out.println(Arrays.toString(closestKValues2StacksRec(r100, 80, 1).toArray()));
//        System.out.println("The 2 smallest value to the target 80 is: ");
//        System.out.println(Arrays.toString(closestKValues2StacksRec(r100, 80, 2).toArray()));
//        System.out.println("The 3 smallest value to the target 80 is: ");
//        System.out.println(Arrays.toString(closestKValues2StacksRec(r100, 80, 3).toArray()));
//        /* 25.2.2 */
//        System.out.println("******************** 25.2.2 ********************");
//        System.out.println("The 1 smallest value to the target 80 is: ");
//        System.out.println(Arrays.toString(closestKValues2Stacks(r100, 80, 1).toArray()));
//        System.out.println("The 2 smallest value to the target 80 is: ");
//        System.out.println(Arrays.toString(closestKValues2Stacks(r100, 80, 2).toArray()));
//        System.out.println("The 3 smallest value to the target 80 is: ");
//        System.out.println(Arrays.toString(closestKValues2Stacks(r100, 80, 3).toArray()));
//        /* 25.2.3 */
//        System.out.println("******************** 25.2.3 ********************");
//        System.out.println("The 1 smallest value to the target 80 is: ");
//        System.out.println(Arrays.toString(closestKValuesListHeap(r100, 80, 1).toArray()));
//        System.out.println("The 2 smallest value to the target 80 is: ");
//        System.out.println(Arrays.toString(closestKValuesListHeap(r100, 80, 2).toArray()));
//        System.out.println("The 3 smallest value to the target 80 is: ");
//        System.out.println(Arrays.toString(closestKValuesListHeap(r100, 80, 3).toArray()));
//        /* 26.1 */
//        System.out.println("********************* 26.1 *********************");
//        System.out.println("The mode for Tree 4 is: ");
//        int[] arr = findModeHashMap(r16);
//        for (int mode : arr) {
//            System.out.print(mode + " ");
//        }
//        System.out.println("");
//        System.out.println("The mode for Tree 2 is: ");
//        int[] arr_1 = findModeHashMap(r100);
//        for (int mode : arr_1) {
//            System.out.print(mode + " ");
//        }
//        /* 26.2 */
//        System.out.println("********************* 26.2 *********************");
//        /* Tree 4 */
//        System.out.println("The mode for Tree 4 is: ");
//        int[] arr = findMode2Trav(r16);
//        for (int mode : arr) {
//            System.out.print(mode + " ");
//        }
//        /* Tree 2 */
//        System.out.println("The mode for Tree 2 is: ");
//        int[] arr_1 = findMode2Trav(r100);
//        for (int mode : arr_1) {
//            System.out.print(mode + " ");
//        }
//        /* 26.1.1 */
//        System.out.println("******************** 26.1.1 ********************");
//        System.out.print("Preorder traversal sequence inorderArray :");
//        System.out.println(verifyPreorderStack(inorderArray));
//        System.out.print("Preorder traversal sequence randomArray :");
//        System.out.println(verifyPreorderStack(randomArray));
//        /* 26.1.2 */
//        System.out.println("******************** 26.1.2 ********************");
//        System.out.print("Preorder traversal sequence inorderArray :");
//        System.out.println(verifyPreorder(inorderArray));
//        System.out.print("Preorder traversal sequence randomArray :");
//        System.out.println(verifyPreorder(randomArray));
//        /* 26.2.1 */
//        System.out.println("******************** 26.2.1 ********************");
//        System.out.println("Delete node val of 100 from Tree 2: ");
//        System.out.println(levelOrderBFS(deleteNode(r100, 100)));
//        System.out.println("Delete node val of 30 from Tree 2: ");
//        System.out.println(levelOrderBFS(deleteNode(r100, 30)));
//        System.out.println("Delete node val of 180 from Tree 2: ");
//        System.out.println(levelOrderBFS(deleteNode(r100, 180)));
//        System.out.println("Delete node val of 40 from Tree 2: ");
//        System.out.println(levelOrderBFS(deleteNode(r100, 40)));
//       /* 26.3.1 */
//        System.out.println("******************** 26.3.1 ********************");
//        System.out.print("The total number of BST for n = 3 is : ");
//        System.out.println(numTrees(3));
//        System.out.print("The total number of BST for n = 5 is : ");
//        System.out.println(numTrees(5));
//        System.out.print("The total number of BST for n = 7 is : ");
//        System.out.println(numTrees(7));
//       /* 26.3.2 Rewrite the test method later */
//        System.out.println("******************** 26.3.2 ********************");
//        System.out.println("All the unique BSTs generated from n = 3 is : ");
//        for (TreeNode root : generateTrees(3)) {
//            printBST(root);
//            System.out.println();
//        }
//        System.out.println("All the unique BSTs generated from n = 5 is : ");
//        for (TreeNode root : generateTrees(5)) {
//            printBST(root);
//            System.out.println();
//        }
//        /* 26.4.1 */
//        System.out.println("******************** 26.4.1 ********************");
//        System.out.print("Is tree 1 a BST ? ");
//        System.out.println(isValidBSTSqueeze(r1));
//        System.out.print("Is tree 2 a BST ? ");
//        System.out.println(isValidBSTSqueeze(r100));
//        /* 26.4.2 */
//        System.out.println("******************** 26.4.2 ********************");
//        System.out.print("Is tree 1 a BST ? ");
//        System.out.println(isValidBSTTraverse(r1));
//        System.out.print("Is tree 2 a BST ? ");
//        System.out.println(isValidBSTTraverse(r100));
//        /* 26.4.3 */
//        System.out.println("******************** 26.4.3 ********************");
//        System.out.print("Is tree 1 a BST ? ");
//        System.out.println(isValidBSTResultType(r1));
//        System.out.print("Is tree 2 a BST ? ");
//        System.out.println(isValidBSTResultType(r100));
//        /* 26.5.1 */
//        System.out.println("******************** 26.4.1 ********************");
//        System.out.println("BSTree 5 inorder traversal before recover: ");
//        inorderTraversalRec(r101);
//        System.out.println();
//        System.out.println("BSTree 5 inorder traversal after recover: ");
//        recoverTree(r101);
//        inorderTraversalRec(r101);
//        /* 27.1 */
//        System.out.println("******************** 27.1 ********************");
//        System.out.println("The processes we need to kill for pid 5 are: ");
//        System.out.println(Arrays.toString(killProcess(pid, ppid, kill5).toArray()));
//        System.out.println("******************** 27.1 ********************");
//        System.out.println("The processes we need to kill for pid 3 are: ");
//        System.out.println(Arrays.toString(killProcess(pid, ppid, kill3).toArray()));
//        System.out.println("******************** 27.1 ********************");
//        System.out.println("The processes we need to kill for pid 10 are: ");
//        System.out.println(Arrays.toString(killProcess(pid, ppid, kill10).toArray()));
//        /* 28.1 */
//        System.out.println("******************** 28.1 ********************");
//        System.out.print("Is the given n and edges a valid tree ? ");
//        System.out.println(validTree(treeNumber, edges));
//        System.out.print("Is the given n and edges a valid tree ? ");
//        System.out.println(validTree(treeNumber, edges1));

    }





// ---------------------------- test helper -------------------------------- //

    /*
        Tree 2: Binary Search Tree
                  100
                /    \
               40     180
             /  \     /
            30   60  110

         where r100 is the root

         For 26.3.2
     */

    public static void printBST(TreeNode root) {
        if (root == null) {
            System.out.print("{}");
            return;
        }
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode cur = q.poll();

            /* Print it out */
            System.out.print(cur.val + "->");
            if (cur.left != null) {
                q.offer(cur.left);
            }
            if (cur.right != null) {
                q.offer(cur.right);
            }
        }
    }

// ------------------------------------------------------------------------- //




////////////////////////////////////////////////////////////////////////////////

////////////////////////////////
// 0. Get the max value node  //
////////////////////////////////

    ///////////////////
    // 1) maxNodeRec //
    ///////////////////

    /* Two variables to store the temp results */
    private static int maxValue = Integer.MIN_VALUE;
    private static TreeNode maxNode = null;
    public static TreeNode maxNodeRec(TreeNode root) {
        maxNodeRecHelper(root);
        return maxNode;
    }

    private static void maxNodeRecHelper(TreeNode root) {
        /* Base */
        if (root == null) {
            return;
        }
        /* Update the result */
        if (root.val > maxValue) {
            maxNode = root;
            maxValue = root.val;
        }
        maxNodeRecHelper(root.left);
        maxNodeRecHelper(root.right);
    }

    ////////////////
    // 2) maxNode //
    ////////////////

    /* Use preorder traversal */
    public static TreeNode maxNode(TreeNode root) {
        if (root == null) {
            return null;
        }

        int maxValue = Integer.MIN_VALUE;
        TreeNode result = null;

        ArrayDeque<TreeNode> s = new ArrayDeque<>();
        s.push(root);

        while (!s.isEmpty()) {
            TreeNode node = s.pop();
            if (node.val > maxValue) {
                result = node;
                maxValue = node.val;
            }
            if (node.right != null) {
                s.push(node.right);
            }
            if (node.left != null) {
                s.push(node.left);
            }
        }

        return result;
    }

//////////////////////////////////
// 1. Get all the nodes number  //
//////////////////////////////////

    /////////////////////////////////
    // 1) getNodeNumRec(recursive) //
    /////////////////////////////////

    /* Null returns, then add all the number from left and right and plus 1 */
    public static int getNodeNumRec(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return getNodeNumRec(root.left) + getNodeNumRec(root.right) + 1;
    }

    //////////////////////////////
    // 2) getNodeNum(iteration) //
    //////////////////////////////

    /*
        The runtime would be O(n).
        Use a ArrayDeque instead of the ArrayList.
        Similar to LevelOrderTraversal
     */
    public static int getNodeNum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.offer(root);

        int count = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }

            count++;
        }

        return count;
    }

//////////////////////
// 2. Get the depth //
//////////////////////


    /*
        Definition of Height and Depth

        The depth of a node is the number of edges from the node to the tree’s root
        node. A root node will have a depth of 0.

        The height of a node is the number of edges on the longest path from the
        node to a leaf. A leaf node will have a height of 0.
    */

    ///////////////////////////////
    // 1) getDepthRec(recursive) //
    ///////////////////////////////

    public static int getDepthRec(TreeNode root) {
        /* Base */
        if (root == null) {
            return -1; /* Refer to the definition */
        }

        /* Divide */
        int left = getDepthRec(root.left);
        int right = getDepthRec(root.right);

        return Math.max(left, right) + 1;
    }

    /////////////////////////////
    // 2) getDepth(Iteration)  //
    /////////////////////////////

    /*
        Use level order traversal to record the 'depths' along the way.
        Use a for loop instead of a dummy node to separate the levels.
     */
    public static int getDepth(TreeNode root) {
        /* Base */
        if (root == null) {
            return 0;
        }

        /* Refer to the definition */
        int depth = -1;

        ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.offer(root);

        /* Use queue since it requires the number of 'levels' */
        /* preorder */
        while (!queue.isEmpty()) {
            depth++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return depth;
    }

    //////////////////////////////////////////
    // 3) getDepthTraverse(global variable) //
    //////////////////////////////////////////

    /* global var */
    private static int depth;
    public static int getDepthTraverse(TreeNode root) {
        depth = 0;
        /* Current root is root, current depth is 0 */
        helper(root, 0);

        return depth;
    }
    private static void helper(TreeNode root, int curDepth) {
        if (root == null) {
            return;
        }

        if (curDepth > depth) {
            depth = curDepth;
        }

        helper(root.left, curDepth + 1);
        helper(root.right, curDepth + 1);
    }

///////////////////////////
// 2.1 Get minimum depth //
///////////////////////////

    /////////////////
    // 1) minDepth //
    /////////////////

    /*
        Pay attention to the definition of minimum depth; The 1 we are adding
        is the root node itself.
     */
    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //      1
        //       \
        //        3
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        //      1
        //     /
        //    2
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }
        //      1
        //     / \
        //    2   3
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

//////////////////////////////
// 3. Binary tree traversal //
//////////////////////////////

    /////////////////////////////
    // 1) preorderTraversalRec //
    /////////////////////////////

    /*
        Use str output, void method, null return;
        Root->Left->Right
    */
    public static void preorderTraversalRec(TreeNode root) {
        /* Base */
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        preorderTraversalRec(root.left);
        preorderTraversalRec(root.right);
    }

    //////////////////////////
    // 2) preorderTraversal //
    //////////////////////////

    /* Store the root in the stack */
    public static void preorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        ArrayDeque<TreeNode> s = new ArrayDeque<TreeNode>();
        s.push(root);

        while (!s.isEmpty()) {
            TreeNode node = s.pop();
            System.out.print(node.val + " ");
            /*
                Remember to go right first and then go left,
                so we can pop left first to satisfy the root left right order.
            */
            if (node.right != null) {
                s.push(node.right);
            }
            if (node.left != null) {
                s.push(node.left);
            }
        }
    }

    /////////////////////////////
    // 3) inorderTraversalRec  //
    /////////////////////////////

    /*
        Use str output, void method, null return;
        Left->Root->Right
    */
    public static void inorderTraversalRec(TreeNode root) {
        if (root == null) {
            return;
        }

        inorderTraversalRec(root.left);
        System.out.print(root.val + " ");
        inorderTraversalRec(root.right);
    }

    /////////////////////////
    // 4) inorderTraversal //
    /////////////////////////

    /*
        We add all the left children of the roots to the stack, then we pop from
        the stack and we deal with the right children at last.
    */
    public static void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        ArrayDeque<TreeNode> s = new ArrayDeque<TreeNode>();
        /* Only one node variable throughout the process */
        TreeNode curt = root;
        /* curt != null || !stack.empty() double while */
        while(curt != null || !s.isEmpty()) {
            /* goes to the bottom left and add nodes along the way */
            while (curt != null) {
                s.push(curt);
                curt = curt.left;
            }
            /* Now the curt has no children so just pop the node out */
            curt = s.pop();
            System.out.print(curt.val + " ");
            /* Go for the right side */
            curt = curt.right;
        }

        /*
            If we use ArrayList as the result:
            Peek pop add go to right.
        */
    }

    //////////////////////////////
    // 5) postorderTraversalRec //
    //////////////////////////////

    /*
        Use str output, void method, null return;
        Left->Right->Root
    */
    public static void postorderTraversalRec(TreeNode root) {
        if (root == null) {
            return;
        }

        postorderTraversalRec(root.left);
        postorderTraversalRec(root.right);
        System.out.print(root.val + " ");
    }

    ///////////////////////////
    // 6) postorderTraversal //
    ///////////////////////////

    /*
        The postorder is the same as the inverse of the preorder from the
        right-hand side. So we use two stacks
    */
    public static void postorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        ArrayDeque<TreeNode> s = new ArrayDeque<TreeNode>();
        ArrayDeque<TreeNode> out = new ArrayDeque<TreeNode>();
        s.push(root);

        while(!s.isEmpty()) {
            TreeNode cur = s.pop();
            out.push(cur);

            if (cur.left != null) {
                s.push(cur.left);
            }
            if (cur.right != null) {
                s.push(cur.right);
            }
        }

        while(!out.isEmpty()) {
            System.out.print(out.pop().val + " ");
        }
    }

/////////////////////////////////////////////
// 3.1 BST Inorder Successor / Predecessor //
/////////////////////////////////////////////

    /////////////////////////
    // 1) inorderSuccessor //
    /////////////////////////

    public static TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null)
            return null;

        if (root.val <= p.val) {
            return inorderSuccessor(root.right, p);
        } else {
            TreeNode left = inorderSuccessor(root.left, p);
            return (left != null) ? left : root;
        }
    }

    ///////////////////////////
    // 2) inorderPredecessor //
    ///////////////////////////

    public static TreeNode inorderPredecessor(TreeNode root, TreeNode p) {
        if (root == null)
            return null;

        if (root.val >= p.val) {
            return inorderPredecessor(root.left, p);
        } else {
            TreeNode right = inorderPredecessor(root.right, p);
            return (right != null) ? right : root;
        }
    }

//////////////////////////////
// 4. Level order traversal //
//////////////////////////////

    ///////////////////////
    // 1) levelTraversal //
    ///////////////////////

    /*
        The essence of the Lever order traversal:

        1. BFS, use queue
        2. Initialize the queue, offer the root to the queue.
        3. While the queue is not empty
        4. Ask if the children are not empty, offer them to the queue
    */
    public static void levelTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode cur = q.poll();

            /* Print it out */
            System.out.print(cur.val + " ");

            if (cur.left != null) {
                q.offer(cur.left);
            }
            if (cur.right != null) {
                q.offer(cur.right);
            }
        }
    }

    //////////////////////////
    // 2) levelTraversalRec //
    //////////////////////////

    /* Two level ArrayList Traversal */
    public static void levelTraversalRec(TreeNode root) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        levelTraversalVisit(root, 0, ret);
        System.out.println(ret);
    }
    private static void levelTraversalVisit(TreeNode root,
                                            int level,
                                            ArrayList<ArrayList<Integer>> ret) {

        if (root == null) {
            return;
        }
            /*
                If the node is in the new level, add one more layer.
                Example: when size = 3, level: 0, 1, 2
            */
        if (level >= ret.size()) {
            ret.add(new ArrayList<>());
        }

        /* Go to the current level and add that node's val */
        ret.get(level).add(root.val);

        /* Recursive part */
        levelTraversalVisit(root.left, level + 1, ret);
        levelTraversalVisit(root.right, level + 1, ret);
    }

    //////////////////////////////////
    // 3) Level order traversal BFS //
    //////////////////////////////////

    public static ArrayList<ArrayList<Integer>> levelOrderBFS(TreeNode root) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> level = new ArrayList<>();
            /* Using a for loop to separate the level thing */
            for (int i = 0; i < size; i++) {
                TreeNode head = queue.poll();
                level.add(head.val);
                if (head.left != null) {
                    queue.offer(head.left);
                }
                if (head.right != null) {
                    queue.offer(head.right);
                }
            }
            result.add(level);

        }

        return result;
    }

//////////////////////////////////////////
// 4.1 Average of Levels in Binary Tree //
//////////////////////////////////////////

    ////////////////////////
    // 1) averageOfLevels //
    ////////////////////////

    /* We can use DFS to traverse each level and use sum and size to get the avg.*/
    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            long sum = 0;
            /* For a certain level */
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                sum += node.val;
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }

            /* Deal with the edge cases */
            double avg = (double) sum / size;
            if (avg > Integer.MAX_VALUE) {
                result.add((double) Integer.MAX_VALUE);
            } else {
                result.add(avg);
            }
        }
        return result;
    }

////////////////////////////////////////
// 4.2 Largest node val of each level //
////////////////////////////////////////

    /////////////////////////
    // 1) largestValuesBFS //
    /////////////////////////

    /* Straightforward BFS */
    public static List<Integer> largestValuesBFS(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
                if (node.val > max) {
                    max = node.val;
                }
            }
            result.add(max);
        }

        return result;
    }

    /////////////////////////
    // 2) largestValuesDFS //
    /////////////////////////

    /* DFS */
    public static List<Integer> largestValuesDFS(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        helper(root, res, 0);
        return res;
    }
    private static void helper(TreeNode root, List<Integer> res, int d){
        if(root == null){
            return;
        }
        /* Expand the list */
        if(d == res.size()){
            res.add(root.val);
        }
        else{
        /* Or Update the value */
            res.set(d, Math.max(res.get(d), root.val));
        }
        helper(root.left, res, d + 1);
        helper(root.right, res, d + 1);
    }

/////////////////////////////
// 4.3 Add one row to a BT //
/////////////////////////////

    /////////////////////
    // 1) addOneRowDFS //
    /////////////////////

    /*
        Complexity Analysis

        Time complexity : O(n). A total of n nodes of the given tree will be considered.

        Space complexity : O(n). The depth of the recursion tree can go up
        to n in the worst case(skewed tree).
     */

    public static TreeNode addOneRowDFS(TreeNode root, int v, int d) {

        /* What's-the-pointedly weird; Edge case */
        if (d == 1) {
            TreeNode node = new TreeNode(v);
            node.left = root;
            return node;
        }
        addOneRowInsert(d,v,root,1);
        return root;
    }
    private static void addOneRowInsert(int maxD,
                                        int insertVal,
                                        TreeNode root,
                                        int curD) {
        /* Base case */
        if (root == null) {
            return;
        }

        /* Solve problem: Store the original to temp and reconnect them */
        if (curD == maxD - 1) {
            TreeNode temp = root.left;
            root.left = new TreeNode(insertVal);
            root.left.left = temp;
            temp = root.right;
            root.right = new TreeNode(insertVal);
            root.right.right = temp;
        } else {
            addOneRowInsert(maxD, insertVal, root.left, curD + 1);
            addOneRowInsert(maxD, insertVal, root.right, curD + 1);
        }

    }

    /////////////////////
    // 2) addOneRowBFS //
    /////////////////////

    /*
        Complexity Analysis

        Time complexity : O(n)O. A total of n nodes of the given tree will be considered in the worst case.

        Space complexity : O(x). The size of the queue or temp queue can grow up to x only. Here, x refers to the number of maximum number of nodes at any level in the given tree.
     */
    public static TreeNode addOneRowBFS(TreeNode root, int v, int d) {
        if (d == 1) {
            TreeNode node = new TreeNode(v);
            node.left = root;
            return node;
        }

        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        int depth = 0;

        while (!q.isEmpty()) {
            depth++;
            /* Get size beforehand */
            int size = q.size();

            /* We found the right level */
            if (depth == d - 1) {
                /* Reconnect nodes for every node on d - 1 level */
                for (int i = 0; i < size; i++) {
                    TreeNode node = q.poll();

                    TreeNode temp = node.left;
                    node.left = new TreeNode(v);
                    node.left.left = temp;
                    temp = node.right;
                    node.right = new TreeNode(v);
                    node.right.right = temp;
                }
            } else { /* Normal DFS go deeper */
                for (int i = 0; i < size; i++) {
                    TreeNode node = q.poll();
                    if (node.left != null) {
                        q.offer(node.left);
                    }
                    if (node.right != null) {
                        q.offer(node.right);
                    }
                }
            }
        }
        return root;
    }

//////////////////////////
// 4.4 Right view of BT //
//////////////////////////

    /////////////////////////
    // 1) rightSideViewBFS //
    /////////////////////////

    /* Use BFS right from left add the first element */
    public static List<Integer> rightSideViewBFS(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        /* BFS */
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        int level = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                /* Use node */
                TreeNode node = q.poll();
                if (level == result.size()) {
                    result.add(node.val);
                }

                if (node.right != null) {
                    q.offer(node.right);
                }
                if (node.left != null) {
                    q.offer(node.left);
                }
            }
            level++;
        }

        return result;
    }

    /////////////////////////
    // 2) rightSideViewDFS //
    /////////////////////////

    /* DFS top to bottom compare the size of the result and the level */
    public static List<Integer> rightSideViewDFS(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        rightSideViewHepler(root, result, 0);
        return result;
    }

    private static void rightSideViewHepler(TreeNode root,
                                            List<Integer> result,
                                            int level) {
        if (root == null) {
            return;
        }

        if (level == result.size()) {
            result.add(root.val);
        }

        rightSideViewHepler(root.right, result, level + 1);
        rightSideViewHepler(root.left,  result, level + 1);
    }

/////////////////////////////////////////////////////
// 4.5 Populating Next Right Pointers in Each Node //
/////////////////////////////////////////////////////

    ///////////////////
    // 1) connectBFS //
    ///////////////////

    /* BFS will do the work; It is too slow though */
    public static void connectBFS(TreeLinkNode root) {
        connectBFSHelper(root);
    }
    private static void connectBFSHelper(TreeLinkNode root) {
        if (root == null) {
            return;
        }

        /* BFS */
        ArrayDeque<TreeLinkNode> q = new ArrayDeque<>();
        /* Root */
        q.offer(root);
        root.next = null;
        TreeLinkNode leftLast = null;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeLinkNode node = q.poll();

                /* Solve problem by connecting */
                if (i == 0) {
                    leftLast = node;
                } else if (i == size - 1) {
                    leftLast.next = node;
                    node.next = null;
                } else {
                    leftLast.next = node;
                    leftLast = node;
                }

                /* Add children */
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
        }
    }

    ///////////////////
    // 2) connectDFS //
    ///////////////////

    /* This solution is so brilliant since it's not using extra space !! */
    public static void connectDFS(TreeLinkNode root) {
        if(root == null) {
            return;
        }

        if(root.left != null){
            root.left.next = root.right;
            if(root.next != null)
                root.right.next = root.next.left;
        }

        connectDFS(root.left);
        connectDFS(root.right);
    }

    /////////////////////
    // 3) connectIIBFS //
    /////////////////////

    /* BFS will do the work; It is too slow though */
    public static void connectIIBFS(TreeLinkNode root) {
        connectII(root);
    }
    private static void connectII(TreeLinkNode root) {
        if (root == null) {
            return;
        }

        /* BFS */
        ArrayDeque<TreeLinkNode> q = new ArrayDeque<>();
        /* Root */
        q.offer(root);
        root.next = null;
        TreeLinkNode leftLast = null;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeLinkNode node = q.poll();

                /* Solve problem by connecting */
                if (i == 0) {
                    leftLast = node;
                } else if (i == size - 1) {
                    leftLast.next = node;
                    node.next = null;
                } else {
                    leftLast.next = node;
                    leftLast = node;
                }

                /* Add children */
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
        }
    }

    ///////////////////////
    // 4) connectIIDummy //
    ///////////////////////

    /*
        This algorithm will take O(n) time and O(1) space;
        Always, Always, Always try to use dummy node in LinkedList !!!
        Use a dummy node and a travel pointer
    */
    public static void connectIIDummy(TreeLinkNode root) {

        while (root != null) {
            /* For fresh and return */
            TreeLinkNode tempChild = new TreeLinkNode(0);
            /* For traversal -- pointer */
            TreeLinkNode currentChild = tempChild;
            //      1
            //    /  \
            //   2    3
            //  / \    \
            // 4   5    7
            while (root != null) {
                if (root.left != null) {
                    currentChild.next = root.left;
                    currentChild = currentChild.next;
                }
                if (root.right != null) {
                    currentChild.next = root.right;
                    currentChild = currentChild.next;
                }
                root = root.next;
            }
            /* Dummy Node */
            root = tempChild.next;
        }

    }

//////////////////////////////////
// 4.6 Vertical Level Traversal //
//////////////////////////////////

    /////////////////////////////
    // 1) verticalOrderTreeMap //
    /////////////////////////////

    public static List<List<Integer>> verticalOrderTreeMap(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Map<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
        ArrayDeque<Integer> qCol = new ArrayDeque<>();
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        qCol.offer(0);

        /* Go through */
        // Given binary tree [3,9,20,null,null,15,7],
        //    3
        //   /\
        //  /  \
        //  9  20
        //     /\
        //    /  \
        //   15   7
        // return its vertical order traversal as:
        // [
        //   [9],
        //   [3,15],
        //   [20],
        //   [7]
        // ]

        /* BFS ! And we can't use DFS since it's required to top to bottom */
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            int col = qCol.poll();

            /* Judge if there are any keys before adding the keys */
            if (!map.containsKey(col)) {
                /* Bit tricky tho for the treeMap */
                map.put(col, new ArrayList<Integer>(Arrays.asList(curr.val)));
            } else {
                map.get(col).add(curr.val);
            }

            if (curr.left != null) {
                queue.offer(curr.left);
                qCol.offer(col - 1);
            }
            if (curr.right != null) {
                queue.offer(curr.right);
                qCol.offer(col + 1);
            }
        }

        for (int n : map.keySet()) {
            result.add(map.get(n));
        }

        return result;
    }

    /////////////////////////////
    // 2) verticalOrderHashMap //
    /////////////////////////////

    public static List<List<Integer>> verticalOrderHashMap(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        int colMin = 0;
        int colMax = 0;
        Map<Integer, List<Integer>> col = new HashMap<>();

        ArrayDeque<Integer> q1 = new ArrayDeque<>(); /* For col */
        ArrayDeque<TreeNode> q2 = new ArrayDeque<>(); /* For node */

        q1.add(0);
        q2.add(root);

        while (!q1.isEmpty()) {
            int c = q1.poll();
            TreeNode node = q2.poll();

            /* Map's empty key */
            if (!col.containsKey(c)) {
                col.put(c, new ArrayList<Integer>());
            }
            col.get(c).add(node.val);

            /* The essence: stretch the index and iterate from the smallest */
            colMin = Math.min(colMin, c);
            colMax = Math.max(colMax, c);

            if (node.left != null) {
                q1.add(c - 1);
                q2.add(node.left);
            }
            if (node.right != null) {
                q1.add(c + 1);
                q2.add(node.right);
            }
        }

        /* Iterate the map key and add its values */
        for (int i = colMin; i <= colMax; i++) {
            ans.add(col.get(i));
        }

        return ans;
    }

//////////////////////////////////////
// 4.7 Level order ZigZag Traversal //
//////////////////////////////////////

    /////////////////////////
    // 1) zigzagLevelOrder //
    /////////////////////////

    /* A little trick about the ArrayList by adding element both ways */
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        boolean normalOrder = true;

        while (!q.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                /* Add from the tail */
                if (normalOrder) {
                    level.add(node.val);
                /* Add from the head */
                } else {
                    level.add(0, node.val);
                }

                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            result.add(level);
            normalOrder = !normalOrder;
        }
        return result;
    }

/////////////////////////////////////////
// 5. Convert BST to Doubly LinkedList //
/////////////////////////////////////////

    /*
                10
              /    \
             6     15
            / \   /  \
           3   8 11   18

            8 <- 10 -> 15
            8 -> 10 <- 15
        Requirements: Convert the BST to DLL where you can't create new nodes,
        and only can adjust the pointers.

        First, we connect the root left pointer to the last node of the left
        children and then pointing the root with the right pointer of last node
        of the left children.

        Second, we point the root's right pointer to the first node of the
        right children, then we use the left pointer of the first node of the
        right children to point to the root
    */

    //////////////////////////
    // 1) convertBST2DLLRec //
    //////////////////////////

    public static TreeNode convertBST2DLLRec(TreeNode root) {
        return convertBST2DLLRecHelp(root)[0];
    }
    /* ret[0] left pointer; ret[1] right pointer */
    public static TreeNode[] convertBST2DLLRecHelp(TreeNode root) {
        TreeNode[] ret = new TreeNode[2];
        ret[0] = null;
        ret[1] = null;

        if (root == null) {
            return ret;
        }

        if (root.left != null) {
            /* Go to the far left */
            TreeNode left[] = convertBST2DLLRecHelp(root.left);
            /* connect the last node of the left children to the root */
            left[1].right = root;
            root.left = left[1];

            ret[0] = left[0];
        } else {
            /* left node return back to root */
            ret[0] = root;
        }

        if (root.right != null) {
            /* Deal with the right */
            TreeNode right[] = convertBST2DLLRecHelp(root.right);
            /* connect the first node of the right children to the root */
            right[0].left = root;
            root.right = right[0];

            ret[1] = right[1];
        } else {
            /* right node return back to root */
            ret[1] = root;
        }

        return ret;
    }

///////////////////////////////////////////////
// 6. Get the number of Nodes from Kth level //
///////////////////////////////////////////////

    //////////////////////////////
    // 1) getNodeNumKthLevelRec //
    //////////////////////////////

    /* Count the level and if it is the right level, return the size of the Q */
    public static int getNodeNumKth(TreeNode root, int k) {
        if (root == null || k <= 0) {
            return 0;
        }

        int level = 0;
        int count = 0;
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        while (!q.isEmpty()) {
            level++;
            /* Size of the array */
            int size = q.size();
            if (level == k) {
                return size;
            }
            /* For loop every element in the queue */
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
        }
        return count;
    }


    //////////////////////////////
    // 2) getNodeNumKthLevelRec //
    //////////////////////////////

    /* Two base case: zero node and one node */
    public static int getNodeNumKthLevelRec(TreeNode root, int k) {
        /* Zero node */
        if (root == null || k <= 0) {
            return 0;
        }

        /* One node */
        if (k == 1) {
            return 1;
        }

        /* Get the sum of the nodes on the kth level from left and right */
        return getNodeNumKthLevelRec(root.left, k - 1)
                + getNodeNumKthLevelRec(root.right, k - 1);
    }

/////////////////////////////////////
// 7. Get the number of leaf nodes //
/////////////////////////////////////

    //////////////////////////
    // 1) getNodeNumLeafRec //
    //////////////////////////

    /* Just add all the leaf from the left and the right, and null return 0 */
    public static int getNodeNumLeafRec(TreeNode root) {
        if (root == null) {
            return 0;
        }

        /* Only this situation can be called the leaf node */
        if (root.left == null && root.right == null) {
            return 1;
        }

        return getNodeNumLeafRec(root.left) + getNodeNumLeafRec(root.right);
    }

    //////////////////////////////
    // 2) getNodeNumLeafInorder //
    //////////////////////////////

    /* We can use any one of those traversal method, for example in-order */
    public static int getNodeNumLeafInorder(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int cnt = 0;

        ArrayDeque<TreeNode> s = new ArrayDeque<TreeNode>();
        TreeNode cur = root;

        while (cur != null || !s.isEmpty()) {
            /* Go to far left and add the cur node along the way */

            // Left children
            while (cur != null) {
                s.push(cur);
                cur = cur.left;
            }

            // The 'root'
            cur = s.peek();
            s.pop();

            // solve problem
            if (cur.left == null && cur.right == null) {
                cnt++;
            }

            // Go right
            cur = cur.right;
        }

        return cnt;
    }

    ///////////////////////////////
    // 3) getNodeNumLeafPreorder //
    ///////////////////////////////

    /* We can use any one of those traversal method, for example pre-order */
    public static int getNodeNumLeafPreorder(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int count = 0;
        ArrayDeque<TreeNode> s = new ArrayDeque<>();
        s.push(root);

        while (!s.isEmpty()) {
            TreeNode node = s.pop();

            if (node.left == null && node.right == null) {
                count++;
            }

            if (node.right != null) {
                s.push(node.right);
            }
            if (node.left != null) {
                s.push(node.left);
            }
        }

        return count;

    }

    ////////////////////////////////
    // 4) getNodeNumLeafPostorder //
    ////////////////////////////////

    /* We can use any one of those traversal method, for example post-order */
    public static int getNodeNumLeafPostorder(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int count = 0;
        ArrayDeque<TreeNode> s = new ArrayDeque<>();
        ArrayDeque<TreeNode> out = new ArrayDeque<>();
        s.push(root);

        while (!s.isEmpty()) {
            TreeNode node = s.pop();
            if (node.left == null && node.right == null) {
                count++;
            }
            if (node.left != null) {
                s.push(node.left);
            }
            if (node.right != null) {
                s.push(node.right);
            }
        }

        return count;
    }

//////////////////////////////
// 8. Are those BT the same //
//////////////////////////////

    //////////////////
    // 1) isSameRec //
    //////////////////

    /*
        (1) if two tree are all empty return true.
        (2) if one of those is empty and the other is not, return false
        (3) if two trees are both not empty if their val and their children are
        all the same return true, else return false;
    */
    public static boolean isSameRec(TreeNode r1, TreeNode r2) {
        /* (1) */
        if (r1 == null && r2 == null) {
            return true;
        }

        /* (2) */
        if (r1 == null || r2 == null) {
            return false;
        }

        /* (3) */
        return r1.val == r2.val &&
                isSameRec(r1.left, r2.left) && isSameRec(r1.right, r2.right);
    }

    //////////////////////
    // 2) isSameInorder //
    //////////////////////

    /* We can use in-order traversal to compare with the two nodes */
    public static boolean isSameInorder(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null) {
            return true;
        }

        if (r1 == null || r2 == null) {
            return false;
        }

        ArrayDeque<TreeNode> s1 = new ArrayDeque<TreeNode>();
        ArrayDeque<TreeNode> s2 = new ArrayDeque<TreeNode>();

        TreeNode cur1 = r1;
        TreeNode cur2 = r2;

        while ((cur1 != null && cur2 != null) ||
                (!s1.isEmpty() && !s2.isEmpty())) {

            /* Left side */
            while (cur1 != null && cur2 != null) {
                s1.push(cur1);
                s2.push(cur2);
                cur1 = cur1.left;
                cur2 = cur2.left;
            }

            /* Solve problem */
            if (cur1 != null || cur2 != null) {
                return false;
            }

            /* Current node */
            cur1 = s1.peek();
            s1.pop();
            cur2 = s2.peek();
            s2.pop();

            /* Solve problem */
            if (cur1.val != cur2.val) {
                return false;
            }

            /* Right side */
            cur1 = cur1.right;
            cur2 = cur2.right;
        }

        return true;
    }

    ///////////////////////
    // 3) isSamePreorder //
    ///////////////////////

    /* This is the Preorder traversal */
    public static boolean isSamePreorder(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null) {
            return true;
        }

        if (r1 == null || r2 == null) {
            return false;
        }

        ArrayDeque<TreeNode> s1 = new ArrayDeque<>();
        ArrayDeque<TreeNode> s2 = new ArrayDeque<>();
        s1.push(r1);
        s2.push(r2);

        while (!s1.isEmpty() && !s2.isEmpty()) {
            TreeNode node1 = s1.pop();
            TreeNode node2 = s2.pop();

            if (node1.val != node2.val) {
                return false;
            }

            if (node1.right != null) {
                s1.push(node1.right);
            }
            if (node2.right != null) {
                s2.push(node2.right);
            }
            if (s1.size() != s2.size()) {
                return false ;
            }

            if (node1.left != null) {
                s1.push(node1.left);
            }

            if (node2.left != null) {
                s2.push(node2.left);
            }

            if (s1.size() != s2.size()) {
                return false ;
            }
        }

        return s1.size() == s2.size();
    }

////////////////////////////////
// 9. Is balanced binary tree //
////////////////////////////////

    /////////////////
    // 1) isAVLRec //
    /////////////////

    /*
        (1) The height difference between left and right children should be < 1.
        (2) The left children and right children have to be all AVL.
     */
    public static boolean isAVLRec(TreeNode root) {
        if (root == null) {
            return true;
        }

        /* (2) */
        if (!isAVLRec(root.left) || !isAVLRec(root.right)) {
            return false;
        }

        /* (1) and refer to the method in 2. 1) */

        int dif = Math.abs(getDepthRec(root.left) - getDepthRec(root.right));
        if (dif > 1) {
            return false;
        }

        return true;
    }

////////////////////////
// 2) isAVLResultType //
////////////////////////

    /* When we need to return more than just one element, use ResultType */
    private static class ResultType9 {
        boolean isBalanced;
        int maxDepth;
        public ResultType9(boolean isBalanced, int maxDepth) {
            this.isBalanced = isBalanced;
            this.maxDepth = maxDepth;
        }
    }
    public static boolean isAVLResultType(TreeNode root) {
        return helper(root).isBalanced;
    }
    private static ResultType9 helper(TreeNode root) {
        if (root == null) {
            return new ResultType9(true, 0);
        }

        ResultType9 left = helper(root.left);
        ResultType9 right = helper(root.right);

        /* subtree not balance */
        /* see if the left and the right are balanced */
        if (!left.isBalanced || !right.isBalanced) {
            return new ResultType9(false, -1);
        }

        /* root not balance */
        /* we can use 0 for the maxDepth */
        if (Math.abs(left.maxDepth - right.maxDepth) > 1) {
            return new ResultType9(false, -1);
        }

        return new ResultType9(true,
                Math.max(left.maxDepth, right.maxDepth) + 1);
    }

///////////////////
// 10. BT mirror //
///////////////////

    //////////////////
    // 1) mirrorRec //
    //////////////////

    // *      1               1
    // *     /                 \
    // *    2     ----->        2
    // *     \                 /
    // *      3               3

    /* Break the original tree swap the left and right children recursively */
    public static TreeNode mirrorRec(TreeNode root) {
        if (root == null) {
            return null;
        }
        /* Classic 3-way swap */
        TreeNode tmp = root.right;
        root.right = mirrorRec(root.left);
        root.left = mirrorRec(tmp);

        return root;
    }

    ///////////////
    // 2) mirror //
    ///////////////

    /* Use the easiest preorder traversal */
    public static TreeNode mirror(TreeNode root) {
        if (root == null) {
            return null;
        }

        ArrayDeque<TreeNode> s = new ArrayDeque<TreeNode>();
        s.push(root);

        while (!s.isEmpty()) {
            TreeNode cur = s.pop();

            /* Swap between 3 nodes */
            TreeNode tmp = cur.left;
            cur.left = cur.right;
            cur.right = tmp;

            /* Go deeper if possible */
            if (cur.right != null) {
                s.push(cur.right);
            }

            if (cur.left != null) {
                s.push(cur.left);
            }
        }

        return root;
    }

    //////////////////////
    // 3) mirrorCopyRec //
    //////////////////////

    /* Copy the root, copy the children and connect them at the same time. */
    public static TreeNode mirrorCopyRec(TreeNode root) {
        if (root == null) {
            return null;
        }

        /* Deep copy */
        TreeNode rootCopy = new TreeNode(root.val);
        rootCopy.left = mirrorCopyRec(root.right);
        rootCopy.right = mirrorCopyRec(root.left);

        return rootCopy;
    }

    ///////////////////
    // 4) mirrorCopy //
    ///////////////////

    /* Preorder Traversal; Pop the node and create and connect the nodes. */
    public static TreeNode mirrorCopy(TreeNode root) {
        if (root == null) {
            return null;
        }

        ArrayDeque<TreeNode> s = new ArrayDeque<TreeNode>();
        ArrayDeque<TreeNode> sCopy = new ArrayDeque<TreeNode>();
        s.push(root);

        TreeNode rootCopy = new TreeNode(root.val);
        sCopy.push(rootCopy);

        while (!s.isEmpty()) {
            TreeNode cur = s.pop();
            TreeNode curCopy = sCopy.pop();

            /* Copy original tree's right to new tree's left */
            if (cur.right != null) {
                /* Easier to find the father for the children while copying. */
                TreeNode leftCopy = new TreeNode(cur.right.val);
                /* Thinking about the mirror */
                curCopy.left = leftCopy;
                s.push(cur.right);
                sCopy.push(curCopy.left);
            }

            if (cur.left != null) {
                /* Easier to find the father for the children while copying. */
                TreeNode rightCopy = new TreeNode(cur.left.val);
                /* Thinking about the mirror */
                curCopy.right = rightCopy;
                s.push(cur.left);
                sCopy.push(curCopy.right);
            }
        }

        return rootCopy;
    }

////////////////////////////////
// 10.1 Two trees are mirrors //
////////////////////////////////

    ////////////////////
    // 1) isMirrorRec //
    ////////////////////

    /*
        (1) if two tree are all empty return true.
        (2) if one of those is empty and the other is not, return false
        (3) if two trees are both not empty if their val and their children are
        all the same to the opposite branch return true, else return false;
    */

    /* Similar to isSameRec except altering the left and right children */
    public static boolean isMirrorRec(TreeNode r1, TreeNode r2){
        /* (1) */
        if (r1 == null && r2 == null) {
            return true;
        }
        /* (2) */
        if (r1 == null || r2 == null) {
            return false;
        }
        /* (3) */
        return r1.val == r2.val
                && isMirrorRec(r1.left, r2.right)
                && isMirrorRec(r1.right, r2.left);
    }

    /////////////////
    // 2) isMirror //
    /////////////////

    /*
        (1) if two tree are all empty return true.
        (2) if one of those is empty and the other is not, return false
        (3) compare tree_1's left children with tree_2's right children and vise
        versa, they can be:
            i.      both null (return true at the end)
            ii.     both be not null (go deeper)
            iii.    one of the children is null and the other is not
     */
    public static boolean isMirror(TreeNode r1, TreeNode r2){
        /* (1) */
        if (r1 == null && r2 == null) {
            return true;
        }

        /* (2) */
        if (r1 == null || r2 == null) {
            return false;
        }

        /* Use two stacks */
        ArrayDeque<TreeNode> s1 = new ArrayDeque<TreeNode>();
        ArrayDeque<TreeNode> s2 = new ArrayDeque<TreeNode>();

        s1.push(r1);
        s2.push(r2);

        while (!s1.isEmpty() && !s2.isEmpty()) {
            TreeNode cur1 = s1.pop();
            TreeNode cur2 = s2.pop();

            /* Root */
            if (cur1.val != cur2.val) {
                return false;
            }

            /* Compare tree_1's left children with tree_2's right children */
            TreeNode left1 = cur1.left;
            TreeNode right1 = cur1.right;
            TreeNode left2 = cur2.left;
            TreeNode right2 = cur2.right;

            if (left1 != null && right2 != null) {
                s1.push(left1);
                s2.push(right2);
            } else if (!(left1 == null && right2 == null)) {
                return false;
            }

            /* Compare tree_2's left children with tree_1's right children */
            if (right1 != null && left2 != null) {
                s1.push(right1);
                s2.push(left2);
            } else if (!(right1 == null && left2 == null)) {
                return false;
            }
        }

        return true;
    }

////////////////////////////////
// 10.2 The Tree is symmetric //
////////////////////////////////

    //////////////////////
    // 1) isSymmetricCS //
    //////////////////////

    public static boolean isSymmetricCS(TreeNode root) {
        /* Get the mirror tree 10.4 */
        TreeNode rootMirror = mirrorCopy(root);
        /* See if the mirror is the same as the original tree 8.1 */
        return isSameRec(root, rootMirror);
    }

    //////////////////////
    // 2) isSymmetricMR //
    //////////////////////

    public static boolean isSymmetricMR(TreeNode root) {
        /* See if the root are mirrors 10.1.1*/
        return isMirrorRec(root, root);
    }

    /////////////////////
    // 3) isSymmetricM //
    /////////////////////

    public static boolean isSymmetricM(TreeNode root) {
        /* See if the root are mirrors 10.1.2*/
        return isMirror(root, root);
    }

///////////////////////////////
// 11. Least common ancestor //
///////////////////////////////

    ////////////
    // 1) LCA //
    ////////////

    /* Record the path along the way and compare them */
    public static TreeNode LCA(TreeNode root, TreeNode r1, TreeNode r2) {
        /* Edge case */
        if (root == null || r1 == null || r2 == null) {
            return null;
        }

        /* Initialize two dynamic arrays */
        ArrayList<TreeNode> list1 = new ArrayList<TreeNode>();
        ArrayList<TreeNode> list2 = new ArrayList<TreeNode>();

        /* See if we can find the path */
        boolean find1 = LCAPath(root, r1, list1);
        boolean find2 = LCAPath(root, r2, list2);

        /* If didn't find any of the node, just return a null. */
        if (!find1 || !find2) {
            return null;
        }

        /* Note that it would boot the performance if we use Iterator. */
        Iterator<TreeNode> iter1 = list1.iterator();
        Iterator<TreeNode> iter2 = list2.iterator();

        /* Iterate and compare the node */
        TreeNode last = null;
        while (iter1.hasNext() && iter2.hasNext()) {
            TreeNode tmp1 = iter1.next();
            TreeNode tmp2 = iter2.next();

            if (tmp1 != tmp2) {
                return last;
            }

            last = tmp1;
        }

        /*
            If we cannot find any node which is different, which means Node 1
            and Node 2 are the same node. So just return the last one.
         */

        return last;
    }
    public static boolean LCAPath(TreeNode root,
                                  TreeNode node,
                                  ArrayList<TreeNode> path) {
        /* if can't find the node in the tree, we should return a empty path. */
        if (root == null || node == null) {
            return false;
        }

        /* Add the root node */
        path.add(root);

        if (root != node
                && !LCAPath(root.left, node, path)
                && !LCAPath(root.right, node, path)
                ) {
            /*
                Didn't find the node. We should remove the node added before.
                AKA backtracking
            */
            path.remove(root);
            return false;
        }

        /* Found the node */
        return true;
    }

    ///////////////
    // 2) LCARec //
    ///////////////

    /*
        (1) null situation
        (2) root situation
        (3) left null and right null situation
     */
    public static TreeNode LCARec(TreeNode root, TreeNode node1, TreeNode node2)
    {
        /* (1) */
        if (root == null || node1 == null || node2 == null) {
            return null;
        }

        /* (2) */
        if (root == node1 || root == node2) {
            return root;
        }

        /* (3) */
        TreeNode left = LCARec(root.left, node1, node2);
        TreeNode right = LCARec(root.right, node1, node2);

        /* If didn't find LCA the left tree, then just return it from right. */
        if (left == null) {
            return right;
        /* If didn't find LCA the right tree, then just return it from left. */
        } else if (right == null) {
            return left;
        }

        /* If we found LCA from both sides, just return the root */
        return root;
    }

    //////////////////
    // 3) LCABstRec //
    //////////////////

    /*
        We could also use 2) LCARec to solve this since BST's also BT. And this
        algorithm could be log(n) if it is an AVL. The runtime of LCARec is O(n).
     */
    public static TreeNode LCABstRec(TreeNode root, TreeNode node1, TreeNode node2) {
        /* Null work */
        if (root == null || node1 == null || node2 == null) {
            return null;
        }

        /* Root work */
        if (root == node1 || root == node2) {
            return root;
        }

        /* Got the min and max and compare */
        int min = Math.min(node1.val, node2.val);
        int max = Math.max(node1.val, node2.val);

        /* If root val is larger than max, Go left */
        if (root.val > max) {
            return LCABstRec(root.left, node1, node2);
        } else if (root.val < min) {
        /* If root val is smaller than min, Go right */
            return LCABstRec(root.right, node1, node2);
        }

        /* if root is in the middle, just return the root */
        return root;
    }

////////////////////////////////////
// 12. Max distance between nodes //
////////////////////////////////////

//////////////////////////
// 1) getMaxDistanceRec //
//////////////////////////

    /*
        What is the distance between two nodes: the edges between two nodes.
        Example:
                  1
                 / \
                2   3
               / \   \
              5  6    4
        So the distance between 2 and 4 is 3 and the max distance for the tree
        is the distance(the distance between far left node and far right node)
        between 5 and 4 which is 4.

        We will use ResultType to keep track of:
        1 -- the Depth of the node.
        2 -- the maxDistance of the current branch.

        Algorithm:
        1 -- calculate the Depth of left and right side, respectively;
             calculate the Distance of left and right side, respectively;
        2 -- Max distance is the max between the three:
            a. If it goes through the root, depth + 2
            b. Left side distance
            c. Right side distance
        3 -- Base case of the recursion:
            root == null, depth = -1, maxDistance = -1;
     */
    private static class ResultType12 {
        int depth;
        int maxDistance;
        public ResultType12(int depth, int maxDistance) {
            this.depth = depth;
            this.maxDistance = maxDistance;
        }
    }
    public static int getMaxDistanceRec(TreeNode root) {
        return getMaxDistanceRecHelp(root).maxDistance;
    }
    private static ResultType12 getMaxDistanceRecHelp(TreeNode root) {
        /* Base */
        ResultType12 ret = new ResultType12(-1, -1);
        if (root == null) {
            return ret;
        }

        ResultType12 left = getMaxDistanceRecHelp(root.left);
        ResultType12 right = getMaxDistanceRecHelp(root.right);


        /* The depth from the subtree to the root. */
        ret.depth = Math.max(left.depth, right.depth) + 1;

        /* If the path go through the root, it should add 2 */
        int crossLen = left.depth + right.depth + 2;

        /* Calculate the largest between the 3 things */
        ret.maxDistance = Math.max(left.maxDistance, right.maxDistance);
        ret.maxDistance = Math.max(ret.maxDistance, crossLen);

        return ret;
    }

////////////////////
// 13. Rebuild BT //
////////////////////

    /////////////////////////////
    // 1) rebuildBinaryTreeRec //
    /////////////////////////////

    /*
       We assume that there is no duplicate in the trees.
       For example:
               1
              / \
             2   3
            / \   \
           4   5   6
                   /\
                  7  8

       PreOrder should be: 1        2 4 5   3 6 7 8
                           root     Left    right
       InOrder should be:  4 2 5    1       3 7 6 8
                           Left     root    right
     */
    public static TreeNode rebuildBinaryTreeRec(List<Integer> preOrder,
                                                List<Integer> inOrder)
    {
        /* Null yeah */
        if (preOrder == null || inOrder == null) {
            return null;
        }

        /* Size matters */
        if (preOrder.size() == 0 || inOrder.size() == 0) {
            return null;
        }

        /* Create the root from the preorder list (first of the list) */
        TreeNode root = new TreeNode(preOrder.get(0));

        List<Integer> preOrderLeft;
        List<Integer> preOrderRight;
        List<Integer> inOrderLeft;
        List<Integer> inOrderRight;

        /* Get the root index in the inorder list */
        int rootInIndex = inOrder.indexOf(preOrder.get(0));

        /* LIST.sublist(a,b) behaves like String.substring(a,b) */
        preOrderLeft = preOrder.subList(1, rootInIndex + 1);
        preOrderRight = preOrder.subList(rootInIndex + 1, preOrder.size());

        /* Get the 'left' and 'right' side of the tree */
        inOrderLeft = inOrder.subList(0, rootInIndex);
        inOrderRight = inOrder.subList(rootInIndex + 1, inOrder.size());

        /* Recursively build the tree by connecting to the right children */
        root.left = rebuildBinaryTreeRec(preOrderLeft, inOrderLeft);
        root.right = rebuildBinaryTreeRec(preOrderRight, inOrderRight);

        return root;
    }

///////////////////////////////
// 14. Is the BT Complete BT //
///////////////////////////////

    /////////////////////////////
    // 1) isCompleteBinaryTree //
    /////////////////////////////

    /*
        We will perform level traversal using a Queue.

        Complete binary tree:
        1.  Once we find that the one of the node's left child is null, the next
        coming children should be all null
        2.  There is no next level which means that all the nodes in the queue
        should not have children.
     */
    public static boolean isCompleteBinaryTree(TreeNode root) {
        if (root == null) {
            return false;
        }

        TreeNode dummyNode = new TreeNode(0);
        ArrayDeque<TreeNode> q = new ArrayDeque<TreeNode>();

        q.offer(root);
        /* For separating the level; We can also use a loop to separate nodes */
        q.offer(dummyNode);

        /* If this flag is true, no node should have any children. */
        boolean noChild = false;

        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            if (cur == dummyNode) {
                if (!q.isEmpty()) {
                    q.offer(dummyNode);
                }
                /* We do not need to process the dummy node. */
                continue;
            }

            if (cur.left != null) {
                /*
                    Flag the node child again and there should be no children
                    for those nodes in the queue
                */
                if (noChild) {
                    return false;
                }
                q.offer(cur.left);
            } else {
                /*
                    If the one of the nodes does not have the left or right
                    children, the rest of the nodes after that node should not
                    have any children. And this node can't have the right child
                */
                noChild = true;
            }

            /* Same for the right side */
            if (cur.right != null) {
                if (noChild) {
                    return false;
                }
                q.offer(cur.right);
            } else {
                noChild = true;
            }
        }

        return true;
    }

    ////////////////////////////////////
    // 2) isCompleteBinaryTreeNoDummy //
    ////////////////////////////////////

    /* We can also use a for loop to separate nodes */
    public static boolean isCompleteBinaryTreeNoDummy(TreeNode root) {
        if (root == null) {
            return false;
        }

        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        boolean noChild = false;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (node.left != null) {
                    if (noChild) {
                        return false;
                    }
                    q.offer(node.left);
                } else {
                    noChild = true;
                }

                if (node.right != null) {
                    if (noChild) {
                        return false;
                    }
                    q.offer(node.right);
                } else {
                    noChild = true;
                }
            }
        }

        return true;
    }

    ////////////////////////////////
    // 3) isCompleteBinaryTreeRec //
    ////////////////////////////////

    /*
        There are 3 conditions:
        • Left branch and right branch are all Perfect with the same Height.
        • Left branch is Complete; Right branch is Perfect; Height differs 1.
        • Left branch is Perfect; Right branch is Complete; Same height.

        Base case:
        root = null, both Perfect and Complete, Height = -1;
     */
    private static class ReturnBinaryTree {
        boolean isCompleteBT;
        boolean isPerfectBT;
        int height;

        ReturnBinaryTree(boolean isCompleteBT, boolean isPerfectBT, int height) {
            this.isCompleteBT = isCompleteBT;
            this.isPerfectBT = isPerfectBT;
            this.height = height;
        }
    }
    public static boolean isCompleteBinaryTreeRec(TreeNode root) {
        return isCompleteBinaryTreeRecHelp(root).isCompleteBT;
    }
    public static ReturnBinaryTree isCompleteBinaryTreeRecHelp(TreeNode root) {
        ReturnBinaryTree result = new ReturnBinaryTree(true, true, -1);
        /* Base */
        if (root == null) {
            return result;
        }
        /* Divide */
        ReturnBinaryTree left = isCompleteBinaryTreeRecHelp(root.left);
        ReturnBinaryTree right = isCompleteBinaryTreeRecHelp(root.right);

        /* Height */
        result.height = 1 + Math.max(left.height, right.height);

        /* set the result isPerfectBT */
        result.isPerfectBT = false;

        /* Perfect */
        if (left.isPerfectBT &&
                right.isPerfectBT &&
                left.height == right.height) {

            result.isPerfectBT = true;
        }

        /* Complete -- the 3 conditions */
        result.isCompleteBT = result.isPerfectBT
                || (left.isCompleteBT && right.isPerfectBT && left.height == right.height + 1)
                || (left.isPerfectBT && right.isCompleteBT && left.height == right.height);

        return result;
    }

////////////////////////////////////////////////
// 14.1 Count nodes in a complete binary tree //
////////////////////////////////////////////////

    ////////////////////////////////
    // 1) countNodesCompleteBTRec //
    ////////////////////////////////

    /*
        The height of a tree can be found by just going left. Let a single node tree have height 0. Find the height h of the whole tree. If the whole tree is empty, i.e., has height -1, there are 0 nodes.

        Otherwise check whether the height of the right subtree is just one less than that of the whole tree, meaning left and right subtree have the same height.

        If yes, then the last node on the last tree row is in the right subtree and the left subtree is a full tree of height h-1. So we take the 2^h-1 nodes of the left subtree plus the 1 root node plus recursively the number of nodes in the right subtree.
        If no, then the last node on the last tree row is in the left subtree and the right subtree is a full tree of height h-2. So we take the 2^(h-1)-1 nodes of the right subtree plus the 1 root node plus recursively the number of nodes in the left subtree.
        Since I halve the tree in every recursive step, I have O(log(n)) steps. Finding a height costs O(log(n)). So overall O(log(n)^2).
     */
    private static int height(TreeNode root) {
        return root == null ? -1 : 1 + height(root.left);
    }
    public static int countNodesCompleteBTRec(TreeNode root) {

        int h = height(root);
        if (h < 0)  /* Edge */
            return 0;
        int hr = height(root.right);

        if (hr == h - 1) /* Left and Right subtree have the same height */
            /* Whole leftSide + root + rightSide*/
            return (1 << h) + countNodesCompleteBTRec(root.right);
        else /* Left subtree height is 1 more than right side */
            /* Whole rightSide + root + leftSide */
            return (1 << h - 1) + countNodesCompleteBTRec(root.left);
    }

    /////////////////////////////
    // 2) countNodesCompleteBT //
    /////////////////////////////

    /* The algorithm is the same; Just remember to decrement the h */
    public static int countNodesCompleteBT(TreeNode root) {
        int nodes = 0, h = height(root); /* Reuse the method in 14.1.1 */
        while (root != null) {
            if (height(root.right) == h - 1) {
                nodes += 1 << h;
                root = root.right;
            } else {
                nodes += 1 << h - 1;
                root = root.left;
            }
            h--;
        }

        return nodes;
    }

/////////////////////////////////////
// 15. Longest Path (root to leaf) //
/////////////////////////////////////

    ////////////////////
    // 1) findLongest //
    ////////////////////

    /*
        Count to the far left and count to the far right;
        Count the left child's Longest and right child's Longest;
        Find the max of them
     */
    public static int findLongest(TreeNode root) {
        if (root == null) {
            return -1;
        }

        TreeNode l = root;
        int cntL = 0;
        while (l.left != null) {
            cntL++;
            l = l.left;
        }

        TreeNode r = root;
        int cntR = 0;
        while (r.right != null) {
            cntR++;
            r = r.right;
        }

        int lmax = findLongest(root.left);
        int rmax = findLongest(root.right);

        int max = Math.max(lmax, rmax);
        max = Math.max(max, cntR);
        max = Math.max(max, cntL);

        return max;
    }

//////////////////////////////////////
// 15.1 Root to leaf paths (String) //
//////////////////////////////////////

    ////////////////////////////////
    // 1) binaryTreePathsWithHelp //
    ////////////////////////////////

    /* DFS Recursive by using a helper */
    public static List<String> binaryTreePathsWithHelp(TreeNode root) {
        /* Edge */
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        /* Pass those things we need */
        String branch = "";
        binaryTreePathsHelper(root, result, branch);
        return result;
    }
    private static void binaryTreePathsHelper(TreeNode root, List<String> result,
                                              String branch) {
        if (root == null) {
            return;
        }
        /* Leaf */
        if (root.left == null && root.right == null) {
            branch = branch + root.val;
            result.add(branch);
            /* backtracking */
            branch = "";
        } else {
            branch = branch + root.val + "->";
        }

        /* Go deeper */
        binaryTreePathsHelper(root.left, result, branch);
        binaryTreePathsHelper(root.right, result, branch);
    }

    ////////////////////////
    // 2) binaryTreePaths //
    ////////////////////////

    /* Use for loop to get all the paths from left and right side; No helper */
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new LinkedList<>();

        if(root == null) {
            return paths;
        }

        /* Leaf */
        if(root.left == null && root.right == null){
            paths.add(root.val + "");
            return paths;
        }

        for (String path : binaryTreePaths(root.left)) {
            paths.add(root.val + "->" + path);
        }

        for (String path : binaryTreePaths(root.right)) {
            paths.add(root.val + "->" + path);
        }

        return paths;

    }

//////////////////////////////////////////////////////////
// 15.2 Length of the longest consecutive sequence path //
//////////////////////////////////////////////////////////

    /////////////////////////////////
    // 1) longestConsecutivePreDFS //
    /////////////////////////////////

    /* Important problem */
    /* Use a parent node to keep track of the previous node */
    public static int longestConsecutivePreDFS(TreeNode root) {
        return longestConsecutiveHelper(root, null, 0);
    }

    private static int longestConsecutiveHelper(TreeNode root,
                                                TreeNode parent,
                                                int length) {
        if (root == null) {
            return length;
        }

        if (parent != null && root.val == parent.val + 1) {
            length++;
        } else {
            length = 1;
        }

        int left  = longestConsecutiveHelper(root.left, root, length);
        int right = longestConsecutiveHelper(root.right, root, length);

        return Math.max(length, Math.max(left, right));

    }

    //////////////////////////////////
    // 2) longestConsecutivePostDFS //
    //////////////////////////////////

    /* Global max; Add 1 by default just handle the non-consecutive one */
    private static int maxL = 0;
    public static int longestConsecutivePostDFS(TreeNode root) {
        postOrderDFS(root);
        return maxL;
    }
    private static int postOrderDFS(TreeNode root) {
        if (root == null) {
            return 0;
        }

        /* Add the 1 beforehand assuming they are consecutive */
        int left = postOrderDFS(root.left) + 1;
        int right = postOrderDFS(root.right) + 1;

        /* Where we set the length to 1 again */
        if (root.left != null && root.val + 1 != root.left.val) {
            left = 1;
        }
        if (root.right != null && root.val + 1 != root.right.val) {
            right = 1;
        }

        int tempL = Math.max(left, right);
        maxL = Math.max(maxL, tempL);
        return tempL;
    }

///////////////////////////////////////////////////////////////////////
// 15.3 Length of the longest consecutive sequence path (any to any) //
///////////////////////////////////////////////////////////////////////

    /////////////////////////////
    // 1) longestConsecutiveII //
    /////////////////////////////
    private static class ResultType15_3 {
        public int max_length;
        public int max_down;
        public int max_up;
        ResultType15_3(int l, int d, int u) {
            max_length = l;
            max_down = d;
            max_up = u;
        }
    }
    public static int longestConsecutiveII(TreeNode root) {
        return longestConsecutiveIIHelper(root).max_length;
    }

    private static ResultType15_3 longestConsecutiveIIHelper(TreeNode root) {
        if (root == null) {
            return new ResultType15_3(0, 0, 0);
        }

        /* bottom up */
        ResultType15_3 left = longestConsecutiveIIHelper(root.left);
        ResultType15_3 right = longestConsecutiveIIHelper(root.right);

        int down = 0, up = 0;

        /* Four situations */
        //   2
        //  /
        // 1

        if (root.left != null && root.left.val + 1 == root.val)
            down = Math.max(down, left.max_down + 1);

        //   1
        //  /
        // 2

        if (root.left != null && root.left.val - 1 == root.val)
            up = Math.max(up, left.max_up + 1);

        //   2
        //    \
        //     1

        if (root.right != null && root.right.val + 1 == root.val)
            down = Math.max(down, right.max_down + 1);

        //   1
        //    \
        //     2

        if (root.right != null && root.right.val - 1 == root.val)
            up = Math.max(up, right.max_up + 1);

        /* Solve the problem */
        int len = down + 1 + up;
        len = Math.max(len, Math.max(left.max_length, right.max_length));

        return new ResultType15_3(len, down, up);
    }

//////////////////////
// 16. Merge two BT //
//////////////////////

    //////////////////////
    // 1) mergeTreesRec //
    //////////////////////

    /*
        The merge rule is that if two nodes overlap, then sum node values up as
        the new value of the merged node.
     */

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }

        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }

        TreeNode left = mergeTrees(t1.left, t2.left);
        TreeNode right = mergeTrees(t1.right, t2.right);

        TreeNode newRoot = new TreeNode(t1.val + t2.val);
        newRoot.left  = left;
        newRoot.right = right;
        return newRoot;
    }

/////////////////////////////////////
// 17. Construct a string from BST //
/////////////////////////////////////

    ////////////////////
    // 1) tree2strRec //
    ////////////////////

    public static String tree2strRec(TreeNode t) {
        if(t == null)
            return "";
        // 1
        if(t.left == null && t.right == null)
            return t.val + "";
        //    1
        //   /
        //  2
        if(t.right == null)
            return t.val + "(" + tree2strRec(t.left) + ")";
        //  1          1
        //   \   or   / \
        //    2      2   3
        return t.val + "(" + tree2strRec(t.left) + ")(" + tree2strRec(t.right) + ")";
    }

    /////////////////
    // 2) tree2str //
    /////////////////

    public static String tree2str(TreeNode t) {
        if (t == null)
            return "";

        /* For traversal */
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        stack.push(t);
        /* Mark the visited node */
        Set<TreeNode> visited = new HashSet<>();
        String s = "";
        while (!stack.isEmpty()) {
            t = stack.peek();
            if (visited.contains(t)) {
                stack.pop();
                s += ")";
            } else {
                /* Solve the problem */
                visited.add(t);
                s += "(" + t.val;
                if (t.left == null && t.right != null)
                    s += "()";

                /* Preorder traversal part */
                if (t.right != null)
                    stack.push(t.right);
                if (t.left != null)
                    stack.push(t.left);
            }
        }
        /* Cut the unnecessary part */
        return s.substring(1, s.length() - 1);
    }

/////////////////////////////////////
// 17.1 Construct a BT from String //
/////////////////////////////////////

    ////////////////////
    // 1) str2treeRec //
    ////////////////////

    public static TreeNode str2treeRec(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }

        int firstParent = s.indexOf( "(" );

        int val = 0;
        /* No "(" means there is only root */
        if  (firstParent == - 1) {
            val = Integer.parseInt(s);
        /* Got the cur root's val */
        } else {
            val = Integer.parseInt(s.substring(0, firstParent));
        }

        TreeNode cur = new TreeNode(val);

        if (firstParent == -1) {
            return cur;
        }

        int start = firstParent;
        int leftParentCount = 0;

        for (int i = start; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                leftParentCount++;
            } else if (s.charAt(i) == ')') {
                leftParentCount--;
            }

            if (leftParentCount == 0 && start == firstParent) {
                cur.left = str2treeRec(s.substring(start + 1, i));
                start = i + 1;
            } else if (leftParentCount == 0) {
                cur.right = str2treeRec(s.substring(start + 1, i));
            }

        }
        return cur;
    }

    /////////////////
    // 2) str2tree //
    /////////////////

    /* Important one */
    public static TreeNode str2tree(String s) {
        /* Base */
        if (s.length() == 0) return null;

        /* Create root */
        int i = 0, j = 0;

        /* j is not out of bond; char at j is a digit or '-' */
        while (j < s.length() && (Character.isDigit(s.charAt(j)) || s.charAt(j) == '-')) j++;
        TreeNode root = new TreeNode(Integer.parseInt(s.substring(i, j)));

        // "4(2(3)(1))(6(5))"

        /* Left Child */
        if (j < s.length()) {
            i = j;
            int count = 1;
            while (j + 1 < s.length() && count != 0) {
                j++;
                if (s.charAt(j) == ')') count--;
                if (s.charAt(j) == '(') count++;
            }
            root.left = str2tree(s.substring(i + 1, j));
        }

        j++;
        /* Right child */
        if (j < s.length()) {
            root.right = str2tree(s.substring(j + 1, s.length() - 1));
        }

        return root;
    }

///////////////////////////////////////////////////////
// 18. Minimum absolute difference between any nodes //
///////////////////////////////////////////////////////



    /////////////////////////////
    // 1) getMinimumDifference //
    /////////////////////////////

    /*
        The most common idea is to first inOrder traverse the tree and compare
        the delta between each of the adjacent values. It's guaranteed to have
        the correct answer because it is a BST thus inOrder traversal values are
        sorted.
     */

    /* In-Order traverse, time O(N), space complexity O(1). */
    public static int min1 = Integer.MAX_VALUE;
    public static Integer prev = null;
    public static int getMinimumDifference(TreeNode root) {
    /* Base */
        if (root == null) {
            return min1;
        }

    /* Go far left */
        getMinimumDifference(root.left);

    /* Not leaf */
        if (prev != null) {
            min1 = Math.min(min1, root.val - prev);
        }
    /* Record the lastNode*/
        prev = root.val;

    /* After dealing with left, go right */
        getMinimumDifference(root.right);

        return min1;
    }

    //////////////////////////////////////
    // 2) getMinimumDifferenceArrayList //
    //////////////////////////////////////

    /*
        1. Get the list of the nodes value and sort it.
        2. Get the abs by pairs and update the min.
        3. Run time is n • log(n) since we used a sorting method.
     */
    public static int getMinimumDifferenceArrayList(TreeNode root) {
        ArrayList<Integer> nodeList = getTheList(root);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < nodeList.size(); i++) {
            int temp = Math.abs(nodeList.get(i - 1) - nodeList.get(i));
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }
    /* There arr at least two nodes so skip the checking */
    private static ArrayList<Integer> getTheList(TreeNode root) {
        ArrayList<Integer> nodeList = new ArrayList<>();
    /* Preorder traversal */
        ArrayDeque<TreeNode> s = new ArrayDeque<>();
        s.push(root);
        while (!s.isEmpty()) {
            TreeNode node = s.pop();
            nodeList.add(node.val);
            if (node.right != null) {
                s.push(node.right);
            }
            if (node.left != null) {
                s.push(node.left);
            }
        }
        Collections.sort(nodeList);
        return nodeList;
    }


    ////////////////////////////////////
    // 3) getMinimumDifferenceTreeSet //
    ////////////////////////////////////

    /*
        The idea is to put values in a TreeSet and then every time we can use O(lgN)
        time to lookup for the nearest values.
     */

    /* Preorder traverse, time O(NlgN), space O(N).*/
    private static TreeSet<Integer> set = new TreeSet<>();
    private static int min3 = Integer.MAX_VALUE;
    public static int getMinimumDifferenceTreeSet(TreeNode root) {
        if (root == null) {
            return min3;
        }
    /*
        The floor(E e) method is used to return the greatest element in this
        set less than or equal to the given e, or null if there is no such
        element.
     */

    /*
        The ceiling(E e) method is used to return the least element in this
        set greater than or equal to the given element, or null if there is
        no such element.
     */
        if (!set.isEmpty()) {
        /* The value is the closest among all the number that is <= root */
            if (set.floor(root.val) != null) {
                min3 = Math.min(min3, root.val - set.floor(root.val));
            }
        /* The value is the closest among all the number that is >= root */
            if (set.ceiling(root.val) != null) {
                min3 = Math.min(min3, set.ceiling(root.val) - root.val);
            }
        }

        set.add(root.val);

        getMinimumDifferenceTreeSet(root.left);
        getMinimumDifferenceTreeSet(root.right);

        return min3;
    }

////////////////////////////
// 19. The tilt of a tree //
////////////////////////////

    /////////////////
    // 1) findTilt //
    /////////////////

    private static int tiltSum = 0;
    public static int findTilt(TreeNode root) {
        findTilthelper(root);
        return tiltSum;
    }
    //    1
    //  /   \
    // 2     3
    //  \     \
    //   4     5
    private static int findTilthelper(TreeNode root) {
        if (root == null) return 0;

        int left = findTilthelper(root.left);
        int right = findTilthelper(root.right);

        /* Update the tilt for that certain root */
        tiltSum += Math.abs(left - right);

        return left + right + root.val;
    }

/////////////////////////////////////
// 20. Convert BST to Greater Tree //
/////////////////////////////////////

    ////////////////////
    // 1). convertBST //
    ////////////////////

    /* Funky order traversal */
    private static int sum20_1 = 0;
    public static TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }

        ArrayDeque<TreeNode> s = new ArrayDeque<>();
        TreeNode cur = root;

        while (cur != null || !s.isEmpty()) {
            while (cur != null) {
                s.push(cur);
                cur = cur.right;
            }

            cur = s.peek();
            s.pop();

            /* Solve the problem */

            if (sum20_1 == 0) {
                sum20_1 = cur.val;
            } else {
                cur.val += sum20_1;
                sum20_1 = cur.val;
            }
            cur = cur.left;
        }

        return root;
    }

    ///////////////////////
    // 2). convertBSTRec //
    ///////////////////////

    /* Recursive Helper */
    private static int sum20_2 = 0;
    public static TreeNode convertBSTRec(TreeNode root) {
        convertBSTHelper(root);
        return root;
    }
    private static void convertBSTHelper(TreeNode root) {
        if (root == null) {
            return;
        }
        /* Right */
        if (root.right != null) {
            convertBSTHelper(root.right);
        }
        /* Root */
        root.val = (sum20_2 += root.val);

        /* Left */
        if (root.left != null) {
            convertBSTHelper(root.left);
        }

    }

////////////////////////////////
// 21. Sum of all LEFT leaves //
////////////////////////////////

    ///////////////////////////////
    // 1) sumOfLeftLeavesRecVoid //
    ///////////////////////////////

    /* Using a variable to control if it's leaf */
    private static int leftSum1 = 0;
    private static int level1 = 0;  /* Make sure it's leaf */
    public static int sumOfLeftLeavesRecVoid(TreeNode root) {
        sumOfLeftLeavesRecVoidHelper(root);
        return leftSum1;
    }
    public static void sumOfLeftLeavesRecVoidHelper(TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null && level1 != 0) {
            leftSum1 += root.val;
            return;
        }

        if (root.left != null) {
            level1++;
            sumOfLeftLeavesRecVoidHelper(root.left);
        }

        level1 = 0;
        if (root.right != null) {
            sumOfLeftLeavesRecVoidHelper(root.right);
        }

    }

    ///////////////////////////
    // 2) sumOfLeftLeavesRec //
    ///////////////////////////

    /*
        For given node we check whether its left child is a leaf. If it is the
        case, we add its value to answer, otherwise recursively call method on
        left child. For right child we call method only if it has at least one
        non-null child.
     */
    public static int sumOfLeftLeavesRec(TreeNode root) {
        if(root == null) return 0;

        int leftSum = 0;

        /* Core part */
        if(root.left != null) {
            if(root.left.left == null && root.left.right == null) {
                leftSum += root.left.val;
            } else {
                leftSum += sumOfLeftLeavesRec(root.left);
            }
        }

        leftSum += sumOfLeftLeavesRec(root.right);
        return leftSum;
    }

    ///////////////////////////
    // 3) sumOfLeftLeavesBFS //
    ///////////////////////////

    /* Core part is the same as the second solution */
    public static int sumOfLeftLeavesBFS(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //   3
        //  / \
        // 9  20
        //   /  \
        //  15   7
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        TreeNode cur = root;
        q.offer(cur);
        int sumLeft = 0;

        while (!q.isEmpty()) {
            cur = q.poll();

            /* Solve the problem */
            if (cur.left != null) {
                if (cur.left.left == null && cur.left.right == null) {
                    sumLeft += cur.left.val;
                }
            }

            if (cur.left != null) {
                q.offer(cur.left);
            }
            if (cur.right != null) {
                q.offer(cur.right);
            }
        }

        return sumLeft;
    }

////////////////////////////////////
// 21.1 Collect and remove leaves //
////////////////////////////////////

    /////////////////////////
    // 1) findLeavesHeight //
    /////////////////////////

    /*
        For this question we need to take bottom-up approach. The key is to find the height of each node. Here the definition of height is:

        The height of a node is the number of edges from the node to the deepest leaf. --CMU 15-121 Binary Trees

        I used a helper function to return the height of current node. According to the definition, the height of leaf is 0. h(node) = 1 + max(h(node.left), h(node.right)).

        The height of a node is also the its index in the result list (result). For example, leaves, whose heights are 0, are stored in result[0]. Once we find the height of a node, we can put it directly into the result.
     */
    public static List<List<Integer>> findLeavesHeight(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        height(root, result);
        return result;
    }
    private static int height(TreeNode node, List<List<Integer>> result) {
        if (null == node) {
            return -1;
        }

        /*
            Bottom-up; Go deeper to the tree and solve the problem while coming
            back.

            Use the height of the node and associate it with the size of the
            result.
         */
        int level = 1 + Math.max(height(node.left, result),
                height(node.right, result));

        /* A MUST KNOW TECHNIQUE -- Brilliant as hell */
        if (result.size() < level + 1) {
            result.add(new ArrayList<>());

            result.get(level).add(node.val);

        /*
            'Delete' the node; We can omit this since it won't affect the answer.
         */
            node.left = null;
            node.right = null;
        }

        return level;
    }

    //////////////////////////
    // 2) findLeavesIsLeave //
    //////////////////////////

    /*
        Solving the problem by using the isLeave function;
        Add leaves while deleting the tree!
     */
    public static List<List<Integer>> findLeavesIsLeave(TreeNode root) {

        List<List<Integer>> leavesList = new ArrayList<>();
        List<Integer> leaves = new ArrayList<>();

        while (root != null) {
        /* Handle the root */
            if (isLeave(root, leaves)) {
                root = null;
            }
            leavesList.add(leaves);
            leaves = new ArrayList<Integer>();
        }
        return leavesList;
    }
    private static boolean isLeave(TreeNode node, List<Integer> leaves) {

        /* Leaf */
        if (node.left == null && node.right == null) {
            leaves.add(node.val);
            return true;
        }

        /* Add leaves while deleting the tree */

        /* Go deeper to left */
        if (node.left != null) {
            if (isLeave(node.left, leaves)) {
                node.left = null;
            }
        }

        /* Go deeper to right */
        if (node.right != null) {
            if (isLeave(node.right, leaves)) {
                node.right = null;
            }
        }

        return false;
    }

//////////////////////////////////////////////
// 21.2 Find the value of the LeftMost node //
//////////////////////////////////////////////


    ///////////////////////////////
    // 1) findBottomLeftValueBFS //
    ///////////////////////////////

    /* BFS right to left scan */
    public static int findBottomLeftValueBFS(TreeNode root) {
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        TreeNode lastNode = null;
        while (!q.isEmpty()) {
            lastNode = q.poll();
            if (lastNode.right != null) {
                q.offer(lastNode.right);
            }
            if (lastNode.left != null) {
                q.offer(lastNode.left);
            }
        }

        return lastNode.val;
    }

    ///////////////////////////////
    // 2) findBottomLeftValueRec //
    ///////////////////////////////

    /* Pass the level to the helper and Update the answer in the recursion */
    public static int findBottomLeftValueRec(TreeNode root) {
        findBottomLeftValueRechelper(root,0);
        return val;
    }
    private static int maxLevel = Integer.MIN_VALUE;
    private static int val = 0;
    private static void findBottomLeftValueRechelper(TreeNode root, int level){
        /* Base */
        if(root == null) {
            return;
        }

        /* Update the answer */
        if(level > maxLevel){
            val = root.val;
            maxLevel = level;
        }

        /* When going down, we have to increment the level */
        findBottomLeftValueRechelper(root.left, level + 1);
        findBottomLeftValueRechelper(root.right, level + 1);
    }

/////////////////////////////
// 21.3 Boundary of the BT //
/////////////////////////////

    /////////////////////////////
    // 1) boundaryOfBinaryTree //
    /////////////////////////////

    /*
        Break this into three parts: all of the three uses recursion
        Left boundary part:
        Collecting leaf parts:
        Right boundary part:

        NOTE: 1. HashSet is actually ordered after insertion.
              2. There might be duplicate node's value, so we must use TreeNode
              as in the HashSet.
              3. Mind the if else clause in the boundary part.
     */
    public static List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        /* Creating the HashSet: */
        HashSet<TreeNode> set = new HashSet<>();

        /* Left */
        if (root.left == null) {
            set.add(root);
            result.add(root.val);
        } else {
            travelLeftBoundary(root, set, result);
        }

        getAllLeaves(root, set, result);

        if (root.right == null) {
            if (!set.contains(root)) {
                set.add(root);
                result.add(root.val);
            }
        } else {
            travelRightBoundary(root, set, result);
        }

        return result;
    }
    private static void travelLeftBoundary(TreeNode root, HashSet<TreeNode> set, List<Integer> result) {
        if (root == null) {
            return;
        }

        if (!set.contains(root)) {
            set.add(root);
            result.add(root.val);
        }

        if (root.left != null) {
            travelLeftBoundary(root.left, set, result);
        } else {
            travelLeftBoundary(root.right, set, result);

        }

    }
    private static void getAllLeaves(TreeNode root, HashSet<TreeNode> set, List<Integer> result) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            if (!set.contains(root)) {
                set.add(root);
                result.add(root.val);
            }

        }

        getAllLeaves(root.left,  set, result);
        getAllLeaves(root.right, set, result);
    }
    private static void travelRightBoundary(TreeNode root, HashSet<TreeNode> set, List<Integer> result) {
        if (root == null) {
            return;
        }

        if (root.right != null) {
            travelRightBoundary(root.right, set, result);
        } else {
            travelRightBoundary(root.left, set, result);
        }

        if (!set.contains(root)) {
            set.add(root);
            result.add(root.val);
        }

    }

/////////////////////////////////////
// 22. Convert Sorted Array to BST //
/////////////////////////////////////

    /////////////////////////
    // 1) sortedArrayToBST //
    /////////////////////////

    /* We can use 'binary divide' which I just gave a name to */
    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        TreeNode root = sortedArrayToBSTHelper(nums, 0, nums.length - 1);
        return root;
    }
    private static TreeNode sortedArrayToBSTHelper(int[] nums, int start, int
            end) {
        if (start > end) {
            return null;
        }

        /* start, end are not necessary but would be useful in other problem */
        int left = start;
        int right = end;

        /* Create the node */
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        /* Divide (Remember to use mid - 1 and mid + 1 since no duplicates) */
        node.left = sortedArrayToBSTHelper(nums, start, mid - 1);
        node.right = sortedArrayToBSTHelper(nums, mid + 1, end);

        return node;
    }

////////////////////////////////////////
// 22.1 Serialize and deserialize BST //
////////////////////////////////////////

    ////////////////////////////////////////////////
    // 1) serializeWithNull / deserializeWithNull //
    ////////////////////////////////////////////////

    /*
        The idea is simple: print the tree in pre-order traversal and use "X"
        to denote null node and split node with ",". We can use a StringBuilder
        for building the string on the fly. For deserializing, we use a Queue to store the pre-order traversal and since we have "X" as null node, we know exactly how to where to end building subtrees.
     */
    private static final String spliter = ",";
    private static final String Null = "#";

    public static String serializeWithNull(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }
    public static TreeNode deserializeWithNull(String data) {
        Deque<String> nodes = new LinkedList<>();
        /* Convert Array to List */
        nodes.addAll(Arrays.asList(data.split(spliter)));
        return buildTree(nodes);
    }
    /* Preorderly traverse the tree and add nodes to sb */
    private static void buildString(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append(Null).append(spliter);
        } else {
            sb.append(node.val).append(spliter);
            buildString(node.left,  sb);
            buildString(node.right, sb);
        }
    }
    /* Build the node preorderly */
    private static TreeNode buildTree(Deque<String> nodes) {
        String val = nodes.remove(); /* Remove from the front */

        if (val.equals(Null)) return null;

        TreeNode node = new TreeNode(Integer.valueOf(val)); /* Convert str */
        node.left  = buildTree(nodes);
        node.right = buildTree(nodes);
        return node;
    }


    //////////////////////////////////////
    // 2) serializeBFS / deserializeBFS //
    //////////////////////////////////////

    /* Need to go through the algorithm */
    public static String serializeBFS(TreeNode root) {
        if (root == null) {
            return "{}";
        }

        /*
            Use ArrayList as a queue instead of the deque since we are gonna
            manipulate the index.
        */
        ArrayList<TreeNode> queue = new ArrayList<>();
        queue.add(root);

        /* Add all the nodes to queue as well as nulls BFS */
        for (int i = 0; i < queue.size(); i++) {
            TreeNode node = queue.get(i);
            if (node == null) {
                continue;
            }

            queue.add(node.left);
            queue.add(node.right);
        }

        /* Remove all the last 'nulls' */
        while (queue.get(queue.size() - 1) == null) {
            queue.remove(queue.size() - 1);
        }

        /* Serialization */
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        /* Offer root to the sb */
        sb.append(queue.get(0).val);

        for (int i = 1; i < queue.size(); i++) {
            if (queue.get(i) == null) {
                sb.append(",#");
            } else {
                sb.append(",");
                /* Can append int directly */
                sb.append(queue.get(i).val);
            }
        }

        sb.append("}");
        return sb.toString();
    }

    public static TreeNode deserializeBFS(String data) {
        if (data.equals("{}"))
            return null;

        /* Split data, get the String array;Don't forget to cut the '{' '}' */
        String[] vals = data.substring(1, data.length() - 1).split(",");

        /* Creating queue and root node */
        ArrayList<TreeNode> queue = new ArrayList<>();
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));/* s to int */
        queue.add(root);

        int index = 0; /* For record the level */
        boolean isLeftChild = true;

        /* BFS process: Using index to access the parent one by one */
        for (int i = 1; i < vals.length; i++) {
            /* We got numbers */
            if (!vals[i].equals("#")) {
                TreeNode node = new TreeNode(Integer.parseInt(vals[i]));
                /* Connecting the tree */
                if (isLeftChild)
                    queue.get(index).left = node;
                else {
                    queue.get(index).right = node;
                }

                /* Offer the node to queue */
                queue.add(node);
            }
            if (!isLeftChild)
                index++;
            isLeftChild = !isLeftChild;

        }

        return root;
    }

///////////////////////////////////////////////////////////
// 22.2 Convert Sorted LinkedList to height balanced BST //
///////////////////////////////////////////////////////////

    ////////////////////////
    // 1) sortedListToBST //
    ////////////////////////

    public static TreeNode sortedListToBST(ListNode head) {
        /* Edge */
        if (head == null) {
            return null;
        }
        return toBST(head, null);
    }
    private static TreeNode toBST(ListNode head, ListNode tail) {
        ListNode slow = head;
        ListNode fast = head;

        /* Clever Base */
        if (head == tail) {
            return null;
        }

        // 1->2->3->4->5->6->7->null
        //          s
        //                   f

        /* Get the middle node slow by using TAIL */
        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }

        /* Preorder */
        TreeNode newHead = new TreeNode(slow.val);
        newHead.left = toBST(head, slow);
        newHead.right = toBST(slow.next, tail);

        return newHead;
    }

////////////////////////////////////
// 23. Tree 1 is subtree of Tree2 //
////////////////////////////////////

    //////////////////
    // 1) isSubtree //
    //////////////////

    /* Use Recursion */
    public static boolean isSubtree(TreeNode s, TreeNode t) {
        /* Edge cases */
        if (s == null) {
            return false;
        }
        if (t == null) {
            return true;
        }

        return helper(s, t);
    }
    /* Recursively traverse node s */
    private static boolean helper(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }
        /* TreeDemo 10*/
        return isSameRec(s, t) || helper(s.left, t) || helper(s.right, t);

    }

////////////////////////////////////
// 23.1 Most frequent subtree sum //
////////////////////////////////////

    ////////////////////////////
    // 1) findFrequentTreeSum //
    ////////////////////////////

    static Map<Integer, Integer> sumToCount;
    static int maxCnt;

    public static int[] findFrequentTreeSum(TreeNode root) {
        maxCnt = 0;
        sumToCount = new HashMap<Integer, Integer>();

        postOrder(root);

        /* Find the key of the keyValue that is the maxCnt */
        List<Integer> res = new ArrayList<>();
        for (int key : sumToCount.keySet()) {
            if (sumToCount.get(key) == maxCnt) {
                res.add(key);
            }
        }

        /* Convert vector to array */
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
    /* Access all the nodes by postOrder */
    private static int postOrder(TreeNode root) {
        if (root == null) return 0;

        int left = postOrder(root.left);
        int right = postOrder(root.right);
        int sum = left + right + root.val;

        /*
            Solve the problem;
            This is new: getOrDefault.
         */
        int count = sumToCount.getOrDefault(sum, 0) + 1;
        sumToCount.put(sum, count);

        /* For the convenience of using the map later */
        maxCnt = Math.max(maxCnt, count);

        return sum;
    }

//////////////////////////////////////////
// 23.2 The number of Univalue subtrees //
//////////////////////////////////////////

    //////////////////////////////////
    // 1) countUnivalSubtreesGlobal //
    //////////////////////////////////

    private static int res_23_2_1 = 0;
    public static int countUnivalSubtreesGlobal(TreeNode root) {
        isUnival(root, 0);
        return res_23_2_1;
    }
    private static boolean isUnival(TreeNode root, int val) {
        if (root == null) {
            return true;
        }

        /* Go deeper then deal with the root; Use the bit OR!!! */
        if (!isUnival(root.left, root.val)
                | !isUnival(root.right, root.val)) {
            return false;
        }

        res_23_2_1++;

        return root.val == val;

    }

    ///////////////////////////////
    // 2) countUnivalSubtreesRec //
    ///////////////////////////////

    /*
        Note: All parameters are passed by value. So we can not pass
        integer to the function and hope to return the value we want. As an
        alteration, we can use a single-element array, and the return it.
     */
    public static int countUnivalSubtreesRec(TreeNode root) {
        int[] count = new int[1];
        countUnivalSubtreesHelper(root, count);
        return count[0];
    }
    private static boolean countUnivalSubtreesHelper(TreeNode node, int[] count)
    {
        if (node == null) {
            return true;
        }

        boolean left = countUnivalSubtreesHelper(node.left, count);
        boolean right = countUnivalSubtreesHelper(node.right, count);

        /* Basic logic; Go over the example above */
        if (left && right) {
            if (node.left != null && node.left.val != node.val) {
                return false;
            }
            if (node.right != null && node.right.val != node.val) {
                return false;
            }
            count[0]++;
            return true;
        }

        return false;

    }

/////////////////////////////////////////
// 23.3 Number of nodes in BST Subtree //
/////////////////////////////////////////

    /////////////////////////////
    // 1) largestBSTSubtreeRec //
    /////////////////////////////

    public static int largestBSTSubtreeRec(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        if (isValid(root, null, null)) return countNode(root);
        return Math.max(largestBSTSubtreeRec(root.left), largestBSTSubtreeRec(root.right));
    }

    public static boolean isValid(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        if (min != null && min >= root.val) return false;
        if (max != null && max <= root.val) return false;
        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
    }

    public static int countNode(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return 1 + countNode(root.left) + countNode(root.right);
    }

    ////////////////////////////////////
    // 2) largestBSTSubtreeResultType //
    ////////////////////////////////////

    /* size of current tree, range of current tree [rangeLower, rangeUpper] */
    private static class ResultType23_3_2 {
        int size;
        int lower;
        int upper;

        ResultType23_3_2(int size, int lower, int upper) {
            this.size = size;
            this.lower = lower;
            this.upper = upper;
        }
    }
    private static int max23_3_2 = 0;

    public static int largestBSTSubtreeResultType(TreeNode root) {


        if (root == null) { return 0; }
        traverse(root);
        return max23_3_2;
    }

    private static ResultType23_3_2 traverse(TreeNode root) {
        /* For easy comparison, we need to set lower & upper to max and min */
        if (root == null) return new ResultType23_3_2(0, Integer.MAX_VALUE, Integer.MIN_VALUE);

        ResultType23_3_2 left = traverse(root.left);
        ResultType23_3_2 right = traverse(root.right);
        /* Not BST */
        if (left.size == -1 || right.size == -1 || root.val <= left.upper ||
                root.val >= right.lower) {
            return new ResultType23_3_2(-1, 0, 0);
        }
        int size = left.size + 1 + right.size;
        max23_3_2 = Math.max(size, max23_3_2); /* Update the max */
        /*
            Make sure the lower and upper bound are min and the max between the
            root and the left & right child.
         */
        return new ResultType23_3_2(size, Math.min(left.lower, root.val),
                Math.max(right.upper, root.val));
    }

//////////////////////////////////
// 23.4 Find duplicate subtrees //
//////////////////////////////////

    //////////////////////////////
    // 1) findDuplicateSubtrees //
    //////////////////////////////

    public static List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new LinkedList<>();
        traverse(root, new HashMap<>(), res);
        return res;
    }

    public static String traverse(TreeNode cur,
                                  Map<String, Integer> map,
                                  List<TreeNode> res) {
        if (cur == null) return "#";
        String serial = cur.val + "," + traverse(cur.left, map, res) + "," +
                traverse(cur.right, map, res); /* Preorder AC */

        // String serial = traverse(cur.left, map, res) + "," + traverse(cur.right,map, res) + cur.val;  /* Postorder AC */
        // String serial = traverse(cur.left, map, res) + "," + cur.val + "," + traverse(cur.right, map, res) ; /* Inorder No AC */

        if (map.getOrDefault(serial, 0) == 1) res.add(cur);
        map.put(serial, map.getOrDefault(serial, 0) + 1);
        return serial;
    }

///////////////////
//  24. Path Sum //
///////////////////

    //////////////////////////////////
    // 1) hasPathSum (root to leaf) //
    //////////////////////////////////

    /*
        The basic idea is to subtract the value of current node from sum until it reaches a leaf node and the subtraction equals 0, then we know that we got a hit. Otherwise the subtraction at the end could not be 0.
     */
    public static boolean hasPathSum(TreeNode root, int sum) {
        /* Edge Case */
        if (root == null) {
            return false;
        }

        /* Only true situation */
        int newSum = sum - root.val;
        if (newSum == 0 && root.left == null && root.right == null) {
            return true;
        }

        /* Go deeper */
        boolean left  = hasPathSum(root.left, newSum);
        boolean right = hasPathSum(root.right, newSum);

        /* See if one of the two sides is true */
        return left || right;

    }

    /////////////////////////////////////////////
    // 2) binaryTreePathSumList (root to leaf) //
    /////////////////////////////////////////////

    /*
        Since we need the total sum from root to leaf, it's could not be more
        obvious that it's DFS
    */
    public static List<List<Integer>> binaryTreePathSumList(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<Integer> path = new ArrayList<>();
        path.add(root.val);

        /* We need both single path the final result */
        binaryTreePathSumListHelper(root, root.val, sum, path, result);
        return result;
    }
    private static void binaryTreePathSumListHelper (TreeNode root,
                                                     int sum,
                                                     int target,
                                                     List<Integer> path,
                                                     List<List<Integer>> result) {

        /* Base case; Down to the leaf node and solve the problem */
        if (root.left == null && root.right == null) {
            if (sum == target) {
                result.add(new ArrayList<Integer>(path)); /* Deep copy */
            }
            return;
        }

        /* Go left */
        if (root.left != null) {
            path.add(root.left.val);
            binaryTreePathSumListHelper(root.left, sum + root.left.val, target, path, result);
            path.remove(path.size() - 1); /* Backtracking */
        }

        /* Go right (identical to the left side )*/
        if (root.right != null) {
            path.add(root.right.val);
            binaryTreePathSumListHelper(root.right, sum + root.right.val, target, path, result);
            path.remove(path.size() - 1); /* Backtracking */
        }

    }

    ///////////////////
    // 3) pathSumIII //
    ///////////////////


    /* Only need to consider the root and the left and right */
    public static int pathSumIII(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return pathSumFrom(root, sum) + pathSumIII(root.left, sum) + pathSumIII(root.right, sum);
    }
    /* Base case null return 0 */
    private static int pathSumFrom(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }
        /* If there is a perfect sum, plus 1 for the result */
        return (node.val == sum ? 1 : 0)
                + pathSumFrom(node.left, sum - node.val) + pathSumFrom(node.right, sum - node.val);
    }

///////////////////////////////////////
// 24.1 Binary Tree Maximum Path Sum //
///////////////////////////////////////

    /////////////////////////////
    // 1) maxPathSumResultType //
    /////////////////////////////

    /*
        Good one. Must review.
        Stick to the Overview there are three big situation
        1.  the maxPath comes from left child
        2.  the maxPath comes from right child
        3.  the maxPath must go through the root

        draw it accordingly it's a must
     */

    private static class ResultType24_1_1 {
        int singlePath, maxPath;
        ResultType24_1_1(int singlePath, int maxPath) {
            this.singlePath = singlePath;
            this.maxPath = maxPath;
        }
    }
    private static ResultType24_1_1 maxPathSumResultTypeHelper(TreeNode root) {
        if (root == null) {
            return new ResultType24_1_1(0, Integer.MIN_VALUE);
        }

        /* Divide */
        ResultType24_1_1 left = maxPathSumResultTypeHelper(root.left);
        ResultType24_1_1 right = maxPathSumResultTypeHelper(root.right);

        /* Conquer */
        int singlePath = Math.max(left.singlePath, right.singlePath) + root.val;
        singlePath = Math.max(singlePath, 0);

        int maxPath = Math.max(left.maxPath, right.maxPath);
        maxPath = Math.max(maxPath, left.singlePath + right.singlePath + root.val);

        return new ResultType24_1_1(singlePath, maxPath);
    }

    public static int maxPathSumResultType(TreeNode root) {
        ResultType24_1_1 result = maxPathSumResultTypeHelper(root);
        return result.maxPath;
    }

    /*
        Thought:

        A path from start to end, goes up on the tree for 0 or more steps, then goes down for 0 or more steps. Once it goes down, it can't go up. Each path has a highest node, which is also the lowest common ancestor of all other nodes on the path.

        A recursive method maxPathDown(TreeNode node):
            (1) computes the maximum path sum with highest node is the input node, update maximum if necessary
            (2) returns the maximum sum of the path that can be extended to input node's parent.
     */

    ////////////////////////////
    // 2) maxPathSumGlobalRec //
    ////////////////////////////

    private static int maxValue24_1_2;

    public static int maxPathSumGlobalRec(TreeNode root) {
        maxValue24_1_2 = Integer.MIN_VALUE;
        maxPathDown(root);
        return maxValue24_1_2;
    }

    private static int maxPathDown(TreeNode node) {
        if (node == null) return 0;
        int left = Math.max(0, maxPathDown(node.left)); /* Pruning negative */
        int right = Math.max(0, maxPathDown(node.right));
        maxValue24_1_2 = Math.max(maxValue24_1_2, left + right + node.val);
        return Math.max(left, right) + node.val;
    }

///////////////////////////
// 25. Closest BST value //
///////////////////////////

    ////////////////////////
    // 1) closestValueRec //
    ////////////////////////

    /*
        Interesting recursive method and it reduce the runtime if the tree is
        extremely large and the answer is just near the root
     */
    public static int closestValueRec(TreeNode root, double target) {
        int a = root.val;

        TreeNode kid = null;
        /* Go left */
        if (target < a) {
            kid = root.left;
        /* Go right */
        } else {
            kid = root.right;
        }
        /* Halt point */
        if (kid == null) {
            return a;
        }

        int b = closestValueRec(kid, target);
        return Math.abs(a - target) < Math.abs(b - target) ? a : b;
    }

    /////////////////////
    // 2) closestValue //
    /////////////////////

    /* Time: O(n) too slow */
    /* Use inorder traversal; Use a two variables to store some temp values */
    public static int closestValue(TreeNode root, double target) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        ArrayDeque<TreeNode> s = new ArrayDeque<>();
        TreeNode cur = root;
        double MAX = Double.MAX_VALUE;
        int result = 0;
        while (cur != null || !s.isEmpty()) {
            while (cur != null) {
                s.push(cur);
                cur = cur.left;
            }

            cur = s.peek();
            s.pop();

            /* Solve the problem; Always update two when concerning the MAX */
            if (Math.abs((double) cur.val - target) < MAX) {
                result = cur.val;
                MAX = Math.abs((double) cur.val - target);
            }

            cur = cur.right;
        }
        return result;
    }

////////////////////////////////////////
// 25.1 Kth Smallest Element in a BST //
////////////////////////////////////////

    //////////////////////////////////////
    // 1) kthSmallestBS (Binary Search) //
    //////////////////////////////////////

    /*
        Tree 2: Binary Search Tree
                  100
                /    \
               40     180
             /  \     /
            30   60  110

         where r100 is the root
     */
    /* Interesting solution, narrow down and k to get to the target point */
    public static int kthSmallestBS(TreeNode root, int k) {
        int count = getNodeNumRec(root.left); /* Reuse method 1.1 */
        if (k <= count) {
            return kthSmallestBS(root.left, k);
        } else if (k > count + 1) {
            return kthSmallestBS(root.right, k - 1 - count); /* 1 is counted as
            current node */
        }
        return root.val;
    }

    /////////////////////////
    // 2) kthSmallestCarry //
    /////////////////////////

    /* Got all the Inorder list and return the k - 1 the in the list */
    public static int kthSmallestCarry(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        kthSmallestCarryHelper(root, list);
        return list.get(k - 1);
    }
    private static void kthSmallestCarryHelper(TreeNode root,
                                               List<Integer> list) {
        if (root == null) {
            return;
        }
        kthSmallestCarryHelper(root.left, list);
        list.add(root.val);
        kthSmallestCarryHelper(root.right, list);
    }


/////////////////////////////
// 25.2 K Closet BST value //
/////////////////////////////

    /////////////////////////////////
    // 1) closestKValues2StacksRec //
    /////////////////////////////////

    /*
        The idea is to compare the predecessors and successors of the closest node to the target, we can use two stacks to track the predecessors and successors, then like what we do in merge sort, we compare and pick the closest one to the target and put it to the result list.

        As we know, inorder traversal gives us sorted predecessors, whereas reverse-inorder traversal gives us sorted successors.

        We can use iterative inorder traversal rather than recursion, but to keep the code clean, here is the recursion version.
     */
    public static List<Integer> closestKValues2StacksRec(TreeNode root, double
            target, int k) {
        List<Integer> res = new ArrayList<>();

        ArrayDeque<Integer> pred = new ArrayDeque<>();
        ArrayDeque<Integer> succ = new ArrayDeque<>();

        inorder(root, target, false, pred); /* Predecessor */
        inorder(root, target, true,  succ); /* Successor */

        while (k-- > 0) {
            if (pred.isEmpty())
                res.add(succ.pop());
            else if (succ.isEmpty())
                res.add(pred.pop());
            else if (Math.abs(pred.peek() - target) < Math.abs(succ.peek() -
                    target))
                res.add(pred.pop());
            else
                res.add(succ.pop());
        }

        return res;
    }

    private static void inorder(TreeNode root,
                                double target,
                                boolean isSucc,
                                ArrayDeque<Integer> stack) {
        if (root == null) return;

        /* Go deeper; Successor ? go right first : go left first */
        inorder(isSucc ? root.right : root.left, target, isSucc, stack);

        /* Early terminate. Note that we have to slit the < and > and = */
        if ((isSucc && root.val <= target) || (!isSucc && root.val > target))
            return;
        // if ((isSucc && root.val < target) || (!isSucc && root.val >= target))
        // return;

        /* Inorder traversal: the root should always be in the middle */
        stack.push(root.val);

        /* Go deeper; Successor ? go left then : go right then */
        inorder(isSucc ? root.left : root.right, target, isSucc, stack);

    }

    //////////////////////////////
    // 2) closestKValues2Stacks //
    //////////////////////////////

    /*
        I use a predecessor stack and successor stack. I do a log n traversal to initialize them until I reach the null node. Then I use the getPredecessor and getSuccessor method to pop k closest nodes and update the stacks.

        Time complexity is O(k log n), since k BST traversals are needed and each is bounded by O(log n) time. Note that it is not O(log n + k) which is the time complexity for k closest numbers in a linear array.

        Space complexity is O(k log n), since each traversal brings O(log n) new nodes to the stack.
     */
    public static List<Integer> closestKValues2Stacks(TreeNode root, double
            target, int k) {
        List<Integer> result = new LinkedList<Integer>();

        ArrayDeque<TreeNode> pred = new ArrayDeque<>();
        ArrayDeque<TreeNode> succ = new ArrayDeque<>();

        TreeNode curr = root;
        while (curr != null) { /* Takes log(n) */
            if (curr.val >= target) {
                succ.push(curr);
                curr = curr.left;
            } else {
                pred.push(curr);
                curr = curr.right;
            }
        }

        while (k-- > 0) {
            if (pred.isEmpty() && succ.isEmpty())
                break;
            else if (pred.isEmpty())
                result.add(getSuccessor(succ));
            else if (succ.isEmpty())
                result.add(getPredecessor(pred));
            else if (Math.abs(target - pred.peek().val) <
                    Math.abs(target - succ.peek().val))
                result.add(getPredecessor(pred));
            else
                result.add(getSuccessor(succ));
        }

        return result;
    }

    private static int getPredecessor(ArrayDeque<TreeNode> s) {
        TreeNode popped = s.pop();
        TreeNode p = popped.left; /* Pred would always be on the left */
        while (p != null) {
            s.push(p);
            p = p.right; /* But the nearest is always be its right */
        }
        return popped.val;
    }
    private static int getSuccessor(ArrayDeque<TreeNode> s) {
        TreeNode popped = s.pop();
        TreeNode p = popped.right; /* Succ would always be on the right */

        while (p != null) {
            s.push(p);
            p = p.left; /* But the nearest is always be its left */
        }
        return popped.val;
    }

    ///////////////////////////////
    // 3) closestKValuesListHeap //
    ///////////////////////////////

    /*
        Use the LinkedList as:
            1. result
            2. a Heap!!!

        The structure is like the inorder traversal but we are dealing with the
        problem in the process.

        Actually this algorithm is pretty good and it costs 1 ms to run.
     */
    public static List<Integer> closestKValuesListHeap(TreeNode root, double
            target, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        closestKValuesHelper(list, root, target, k);
        return list;
    }
    /* Return a boolean */
    private static boolean closestKValuesHelper(LinkedList<Integer> list,
                                                TreeNode root,
                                                double target,
                                                int k) {
        if (root == null) return false; /* Means no nearest value */

        if (closestKValuesHelper(list, root.left, target, k)) {
            return true;
        }

        /* Update the list before adding the root.val */
        if (list.size() == k) {
            if (Math.abs(list.getFirst() - target) <
                    Math.abs(root.val - target))
                return true;
            else
                list.removeFirst();
        }

        list.addLast(root.val);

        return closestKValuesHelper(list, root.right, target, k);
    }

///////////////////////////////
// 26. Mode in a loosely BST //
///////////////////////////////

    ////////////////////////
    // 1) findModeHashMap //
    ////////////////////////

    /* Inorder traversal; Using hashMap and its functions */
    public static int[] findModeHashMap(TreeNode root) {
        if (root == null) {
            return new int[0];
        }

        /* Use a hashMap -- Extra space */
        HashMap<Integer, Integer> map = new HashMap<>();

        /* Preorder traversal */
        ArrayDeque<TreeNode> s = new ArrayDeque<>();
        TreeNode cur = root;
        while (!s.isEmpty() || cur != null) {
            while (cur != null) {
                s.push(cur);
                cur = cur.left;
            }

            cur = s.peek();
            s.pop();

            /* Solve problem */
            map.merge(cur.val, 1, Integer::sum);

            cur = cur.right;
        }

        ArrayList<Integer> temp = new ArrayList<>();


        /* Get the max value of the key */
        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        Integer maxValue = maxEntry.getValue();

        /* Get all the keys that has the same maxValue */
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValue) {
                temp.add(entry.getKey());
            }
        }

        /* Get the answer */
        int[] result = new int[temp.size()];
        int index = 0;
        for (Integer key : temp) {
            result[index++] = key;
        }
        return result;
    }

    //////////////////////
    // 2) findMode2Trav //
    //////////////////////

    /*
        I think the way to do it properly is to do two passes. One to find the
        highest number of occurrences of any value, and then a second pass to collect all values occurring that often.
     */
    public static int[] findMode2Trav(TreeNode root) {
        inorder(root);
        modes = new int[modeCount];
        modeCount = 0;
        currCount = 0;
        inorder(root);
        return modes;
    }

    private static int currVal;
    private static int currCount = 0;
    private static int maxCount = 0;
    private static int modeCount = 0;
    private static int[] modes;

    private static void handleValue(int val) {
        if (val != currVal) {
            currVal = val;
            currCount = 0;
        }
        currCount++;
        if (currCount > maxCount) {
            maxCount = currCount;
            modeCount = 1;
        } else if (currCount == maxCount) {
            if (modes != null)
                modes[modeCount] = currVal;
            modeCount++;
        }
    }
    private static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        handleValue(root.val);
        inorder(root.right);
    }

////////////////////////////////////////////////////
// 26.1 Verify preorder traversal sequence of BST //
////////////////////////////////////////////////////

    ////////////////////////////
    // 1) verifyPreorderStack //
    ////////////////////////////

    /* Concept is import ! Simulate a stack */
    public static boolean verifyPreorderStack(int[] preorder) {
        int low = Integer.MIN_VALUE;
        /* As a stack */
        ArrayDeque<Integer> path = new ArrayDeque<>();
        for (int p : preorder) {
            if (p < low) {
                return false;
            }
            while (!path.isEmpty() && p > path.peek()) {
                low = path.pop();
            }
            path.push(p);
        }
        return true;

    }

    ///////////////////////
    // 2) verifyPreorder //
    ///////////////////////

    /* Same as above, but abusing the given array for the stack. */
    public static boolean verifyPreorder(int[] preorder) {
        int low = Integer.MIN_VALUE, i = -1;
        for (int p : preorder) {
            if (p < low) {
                return false;
            }
            while (i >= 0 && p > preorder[i]) {
                low = preorder[i--];
            }
            preorder[++i] = p;
        }
        return true;
    }

///////////////////////////////
// 26.2 Delete a node in BST //
///////////////////////////////

    ///////////////////
    // 1) deleteNode //
    ///////////////////

    /*
        Recursively find the node that has the same value as the key(Binary
        Search), while setting the left/right nodes equal to the returned
        subtree
        Once the node is found, have to handle the below 4 cases:

        1. node doesn't have left or right - return null
        2. node only has left subtree- return the left subtree
        3. node only has right subtree- return the right subtree
        4. node has both left and right - find the minimum value in the right
        subtree, set that value to the currently found node, then recursively delete the minimum value in the right subtree
     */
    public static TreeNode deleteNode(TreeNode root, int key) {
        /* Base */
        if (root == null) {
            return null;
        }

        /* Go left */
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        /* Go right */
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else { /* Find the node */
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            TreeNode minNode = findMin(root.right);
            root.val = minNode.val;
            root.right = deleteNode(root.right, root.val);
        }

        return root;
    }

    private static TreeNode findMin(TreeNode node) {
        /* Go leftmost */
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

//////////////////////////
// 26.3 Unique BST by n //
//////////////////////////

    /////////////////
    // 1) numTrees //
    /////////////////

    /*
        The case for 3 elements example
        Count[3] = Count[0]*Count[2]  (1 as root)
                      + Count[1]*Count[1]  (2 as root)
                      + Count[2]*Count[0]  (3 as root)

        Therefore, we can get the equation:
        Count[i] = ∑ Count[0...k] * [ k+1....i]     0<=k<i-1
    */

    public static int numTrees(int n) {
        if (n <= 0) {
            return 1;
        }

        int[] G = new int[n + 1];
        G[0] = G[1] = 1;

        for(int i = 2; i <= n; ++i) {
            for(int j = 1; j <= i; ++j) {
                G[i] += G[j - 1] * G[i - j];
            }
        }

        return G[n];
    }

    //////////////////////
    // 2) generateTrees //
    //////////////////////

    /*
        We can do this recursively.
        Frankly, it's easier than I thought it could be

        I start by noting that 1..n is the in-order traversal for any BST with nodes 1 to n. So if I pick i-th node as my root, the left subtree will contain elements 1 to (i-1), and the right subtree will contain elements (i+1) to n.

        I use recursive calls to get back all possible trees for left and right subtrees and combine them in all possible ways with the root.
     */
    public static List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }
        return generate(1, n);
    }
    private static List<TreeNode> generate(int start, int end) {
        List<TreeNode> result = new ArrayList<>();

        if (start > end) {
            result.add(null);
            return result;
        }

        if(start == end){
            result.add(new TreeNode(start));
            return result;
        }
        /* Algorithm Walk through */

        for (int i = start; i <= end; i++) {
            List<TreeNode> left = generate(start, i - 1);
            List<TreeNode> right = generate(i + 1, end);

            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode root = new TreeNode(i);
                    root.left  = l;
                    root.right = r;
                    result.add(root);
                }
            }
        }
        return result;
    }

///////////////////////
// 26.4 Validate BST //
///////////////////////

    //////////////////////////
    // 1) isValidBSTSqueeze //
    //////////////////////////

    /*
        I think the O-(n) where n is the range of the problem.
        Could be faster than we thought
     */
    public static boolean isValidBSTSqueeze(TreeNode root) {
        /* range of values in problem */
        return checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private static boolean checkBST(TreeNode node, long min, long max) {
        /* Base case */
        if (node == null) {
            return true;
        } else if (node.val <= min || node.val >= max) { /* Note the Edge */
            return false;
        }
        return checkBST(node.left, min, Math.min(max, node.val)) && checkBST(node.right, Math.max(min, node.val), max); /* Note the Edge */
    }

    ///////////////////////////
    // 2) isValidBSTTraverse //
    ///////////////////////////

    /* Global Variable */
    private static TreeNode lastNode26_4_2 = null;
    public static boolean isValidBSTTraverse(TreeNode root) {
        if (root == null) {
            return true;
        }
        /* Left */
        if (!isValidBSTTraverse(root.left)) {
            return false;
        }

        /* Root */
        if (lastNode26_4_2 != null && lastNode26_4_2.val >= root.val) {
            return false;
        }
        lastNode26_4_2 = root;

        /* Right */
        if (!isValidBSTTraverse(root.right)) {
            return false;
        }

        return true;
    }

    /////////////////////////////
    // 3) isValidBSTResultType //
    /////////////////////////////

    private static class ResultType26_4_3 {
        boolean isBST;
        int max, min;
        ResultType26_4_3(boolean isBST, int max, int min) {
            this.isBST = isBST;
            this.max = max;
            this.min = min;
        }
    }
    public static boolean isValidBSTResultType(TreeNode root) {
        ResultType26_4_3 r = validHelper(root);
        return r.isBST;
    }
    /* Task: return the ResultType of the tree with the root of 'root' */
    private static ResultType26_4_3 validHelper(TreeNode root) {
        /* Base Case */
        if (root == null) {
            return new ResultType26_4_3(true, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        /* Divide */
        ResultType26_4_3 left = validHelper(root.left);
        ResultType26_4_3 right = validHelper(root.right);

        /* Early stops where the tree is not the BST */
        if (!left.isBST || !right.isBST ||
                root.left != null && left.max >= root.val ||
                root.right != null && right.min <= root.val) {
            return new ResultType26_4_3(false, 0, 0);
        }
        /* Go deep */
        return new ResultType26_4_3(true, Math.max(right.max, root.val),
                Math.min(left.min, root.val));
    }

/////////////////////////////////////////
// 26.5 Recover two wrong nodes in BST //
/////////////////////////////////////////

    ////////////////////
    // 1) recoverTree //
    ////////////////////

    /*
        Same idea as the recursive version. Since that version requires the
        global variable. We could just stick to the iterative version. And We
        must know inorder traversal from the heart.
     */
    public static void recoverTree(TreeNode root) {
        TreeNode first = null;
        TreeNode second = null;
        TreeNode prev = null;
        TreeNode cur = root;

        ArrayDeque<TreeNode> stack = new ArrayDeque<>();

        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            stack.pop();

            if (prev != null && cur.val <= prev.val) { /* <= */
                if (first == null)
                    first = prev;
                second = cur;
            }

            prev = cur;
            cur = cur.right;
        }

        /* Swap value */
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

/////////////////////////
// 27. Tree Simulation //
/////////////////////////

    ////////////////////
    // 1) killProcess //
    ////////////////////

    /*
        Simulate the tree by creating the B-tree like tree with multiChildren.

        Time complexity : O(n). We need to traverse over the ppid and pid
        array of size n once. The getAllChildren function also takes n time, since no node can be a child of two nodes.

        Space complexity : O(n)O(n). map of size n is used.
     */
    private static class Node {
        int val;
        List<Node> children = new ArrayList<>();
    }
    public static List<Integer> killProcess(List<Integer> pid,
                                            List<Integer> ppid,
                                            int kill) {
        /* id <-> TreeNode */
        HashMap<Integer, Node> map = new HashMap<>();
        for (int id : pid) {
            Node node = new Node();
            node.val = id;
            map.put(id, node);
        }

        /* Traverse the parent id and add pid to its children list */
        for (int i = 0; i < ppid.size(); i++) {
            if (ppid.get(i) > 0) {
                Node par = map.get(ppid.get(i));
                par.children.add(map.get(pid.get(i)));
            }
        }

        /* Recursively get all the children and add them to the result */
        List<Integer> result = new ArrayList<>();
        result.add(kill);
        getAllChildren(map.get(kill), result);
        return result;
    }

    private static void getAllChildren(Node node, List<Integer> result) {
        for (Node n : node.children) {
            result.add(n.val);
            getAllChildren(n, result);
        }
    }

//////////////////////////
// 28. Graph Valid Tree //
//////////////////////////

    //////////////////
    // 1) validTree //
    //////////////////

    /* Intuitive BFS solution */
    public static boolean validTree(int n, int[][] edges) {
        if (n == 0) {
            return false;
        }

        /* What makes a tree */
        if (edges.length != n - 1) {
            return false;
        }

        /* There are no duplicates so we can use a Set */
        Map<Integer, Set<Integer>> graph = initializeGraph(n, edges);

        /* BFS */
        ArrayDeque<Integer> q = new ArrayDeque<>();

        /* For checking as well as speeding the algorithm */
        Set<Integer> hash = new HashSet<>();

        q.offer(0);
        hash.add(0);

        while (!q.isEmpty()) {
            int node = q.poll();
            for (Integer connectedNode : graph.get(node)) {
                if (hash.contains(connectedNode)) {
                    continue;
                }
                hash.add(connectedNode);
                q.offer(connectedNode);
            }
        }

        return hash.size() == n;

    }
    private static Map<Integer, Set<Integer>> initializeGraph(int n, int[][]
            edges) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new HashSet<>());
        }

        for (int[] a : edges) {
            int first = a[0];
            int second = a[1];
            graph.get(first).add(second);
            graph.get(second).add(first);
        }

        return graph;
    }




}

