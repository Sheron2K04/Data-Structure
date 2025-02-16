public class BinarySearchTree {

    // Node class for Binary Search Tree
    private class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    // Insert element in the BST without recursion
    public void insert(int data) {
        Node newNode = new Node(data);

        // If tree is empty, set new node as the root
        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent = null;

        // Traverse the tree iteratively to find the correct insertion point
        while (current != null) {
            parent = current;
            if (data < current.data) {
                current = current.left; // Go left
            } else if (data > current.data) {
                current = current.right; // Go right
            } else {
                // Duplicate values are not allowed in the BST
                return;
            }
        }

        // Insert the new node as a child of the parent
        if (data < parent.data) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    // Search for a node by its value without recursion
    public boolean search(int key) {
        Node current = root;

        // Traverse the tree iteratively
        while (current != null) {
            if (key < current.data) {
                current = current.left; // Go left
            } else if (key > current.data) {
                current = current.right; // Go right
            } else {
                // Node found
                return true;
            }
        }

        // Node not found
        return false;
    }

    // Delete a node by its value without recursion
    public void delete(int key) {
        root = deleteIterative(root, key);
    }

    // Helper method to delete a node iteratively
    private Node deleteIterative(Node root, int key) {
        Node parent = null;
        Node current = root;

        // Find the node to be deleted and its parent
        while (current != null && current.data != key) {
            parent = current;
            if (key < current.data) {
                current = current.left; // Go left
            } else {
                current = current.right; // Go right
            }
        }

        // If node not found
        if (current == null) {
            System.out.println("Node with value " + key + " not found.");
            return root;
        }

        // Case 1: Node to be deleted has no children (leaf node)
        if (current.left == null && current.right == null) {
            if (current != root) {
                if (parent.left == current) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            } else {
                root = null; // If the node is root
            }
        }

        // Case 2: Node to be deleted has one child
        else if (current.left == null) {
            if (current != root) {
                if (parent.left == current) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            } else {
                root = current.right; // If the node is root
            }
        } else if (current.right == null) {
            if (current != root) {
                if (parent.left == current) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            } else {
                root = current.left; // If the node is root
            }
        }

        // Case 3: Node to be deleted has two children
        else {
            Node successorParent = current;
            Node successor = current.right;

            // Find the inorder successor (smallest in the right subtree)
            while (successor.left != null) {
                successorParent = successor;
                successor = successor.left;
            }

            // Copy the inorder successor's content to current node
            current.data = successor.data;

            // Delete the inorder successor
            if (successorParent.left == successor) {
                successorParent.left = successor.right;
            } else {
                successorParent.right = successor.right;
            }
        }

        return root;
    }

    // Inorder traversal (left, root, right) without recursion using a stack
    public void inorder() {
        if (root == null) {
            return;
        }

        // Create a stack for tree traversal
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost node of the current node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Current must be null at this point, pop the stack and visit the node
            current = stack.pop();
            System.out.print(current.data + " ");

            // Visit the right subtree
            current = current.right;
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Insert elements
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Inorder Traversal (should print sorted elements)
        System.out.println("Inorder traversal:");
        tree.inorder();  // Expected: 20 30 40 50 60 70 80
        System.out.println();

        // Search for a value
        System.out.println("Is 40 present? " + tree.search(40));  // Expected: true
        System.out.println("Is 90 present? " + tree.search(90));  // Expected: false

        // Delete a node
        tree.delete(20);
        System.out.println("Inorder traversal after deleting 20:");
        tree.inorder();  // Expected: 30 40 50 60 70 80
        System.out.println();

        tree.delete(30);
        System.out.println("Inorder traversal after deleting 30:");
        tree.inorder();  // Expected: 40 50 60 70 80
        System.out.println();
    }
}
