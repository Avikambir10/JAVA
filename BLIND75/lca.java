package BLIND75;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class lca {
    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int d) {
            this.data = d;
            left = right = null;
        }
    }

    public static TreeNode funclca(TreeNode root, int p, int q) {
        if (root == null) {
            return null;
        }
        if (root.data == p || root.data == q) {
            return root;
        }

        TreeNode left = funclca(root.left, p, q);
        TreeNode right = funclca(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return (left != null) ? left : right;
    }

    public static TreeNode buildTree(ArrayList<Integer> arr) {
        int n = arr.size();
        if (n == 0) {
            return null;
        }

        TreeNode root = new TreeNode(arr.get(0));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;

        while (!q.isEmpty() && i < n) {
            TreeNode node = q.poll();
            if (i < n && arr.get(i) != -1) {
                node.left = new TreeNode(arr.get(i));
                q.add(node.left);
            }
            i++;
            if (i < n && arr.get(i) != -1) {
                node.right = new TreeNode(arr.get(i));
                q.add(node.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        TreeNode root = buildTree(arr);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        TreeNode res = funclca(root, a, b);
        if (res != null) {
            System.out.println(res.data);
        } else {
            System.out.println("No common ancestor found");
        }
    }
}
