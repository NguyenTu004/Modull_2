package bai_1;

public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode(E e) {
        element = e;
    }
    public interface Tree<E> {
        /**
         * Insert element e into the binary search tree.
         * Return true if the element is inserted successfully.
         */
        public boolean insert(E e);
        /**
         * Inorder traversal from the root
         */
        public void inorder();
        /**
         * Get the number of nodes in the tree
         */
        public int getSize();
    }
    public abstract class AbstractTree<E> implements Tree<E> {
        @Override /** Inorder traversal from the root*/
        public void inorder() {
        }
    }

}
