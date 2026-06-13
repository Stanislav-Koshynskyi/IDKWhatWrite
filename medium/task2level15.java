void main() {
    Scanner input = new Scanner(System.in);

    int numberOfNodes = input.nextInt();
    int[] nodes = new int[numberOfNodes];
    for (int i = 0; i < numberOfNodes; i++) {
        nodes[i] = input.nextInt();
    }

    List<Integer> listVisited = new ArrayList<>();

    int n = 0;

    while (!listVisited.contains(nodes[n])) {
        if (nodes[n] == -1) {
            IO.println("NO CYCLE");
            return;
        }

        listVisited.add(nodes[n]);
        n = nodes[n];
    }

    IO.println("CYCLE AT " + nodes[n]);

}
