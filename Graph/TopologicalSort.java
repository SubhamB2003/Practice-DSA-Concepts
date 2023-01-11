import java.util.*;

class Solution {
    // Function to return list containing vertices in Topological order.
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        // add your code here
        boolean visited[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                Dfs(adj, i, stack, visited);
            }
        }

        int arr[] = new int[V];
        int i = 0;
        while (!stack.isEmpty()) {
            arr[i++] = stack.pop();
        }

        return arr;
    }

    static void Dfs(ArrayList<ArrayList<Integer>> adj, int v, Stack<Integer> stack, boolean vis[]) {

        vis[v] = true;

        for (int neighbor : adj.get(v)) {
            if (!vis[neighbor]) {
                Dfs(adj, neighbor, stack, vis);
            }
        }

        stack.push(v);
    }
}