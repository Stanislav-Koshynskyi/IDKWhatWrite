void main() {
    int n;
    int m;

    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            if (i % 2 != 0 && j % 2 != 0) {
                IO.print("#");
            } else if (i % 2 == 0 && j % 2 == 0) {
                IO.print("#");
            } else {
                IO.print(".");
            }
        }
        IO.println("\n");
    }
}
