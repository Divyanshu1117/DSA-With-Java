import java.util.LinkedList;

public class GraphAdjacencyList {
    int vertex;
    LinkedList<Integer>[] list;

    @SuppressWarnings("unchecked")
    public GraphAdjacencyList(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int start, int destination) {
        list[start].addFirst(destination);
        list[destination].addFirst(start);
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Node " + i + " Is Connected To:- ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        GraphAdjacencyList adl = new GraphAdjacencyList(4);
        adl.addEdge(0, 1);
        adl.addEdge(1, 2);
        adl.addEdge(2, 3);
        adl.printGraph();
    }
}