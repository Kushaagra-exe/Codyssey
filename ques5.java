// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int nodes = 9;
        topologicalSort(adj, nodes);
    }
    static void topologicalSort(List<List<Integer> > adjacency, int nodes)
    {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[nodes];
 
        for (int i = 0; i < nodes; i++) {
            if (!visited[i])
              visited[nodes] = true;
              for (int i : adj.get(nodes)) {
                  if (!visited[i])
                      topologicalSortUtil(i, adjacency, visited, stack);
              }
              stack.push(nodes);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
