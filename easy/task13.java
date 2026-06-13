void main() {
    Scanner sc = new Scanner(System.in);
    int numberOfStudents = sc.nextInt();
    int[] notes = new int[numberOfStudents];
    info(numberOfStudents, notes, sc);
}

private static void info(int numberOfStudents, int[] numberOfNotes, Scanner sc) {
    int median = 0;
    int above = 0;

    for (int i = 0; i < numberOfStudents; i++) {
        numberOfNotes[i] = sc.nextInt();
    }

    int[] sorted = Arrays.stream(numberOfNotes).sorted().toArray();
    IO.println("Min: " + sorted[0]);
    IO.println("Max: " + sorted[numberOfNotes.length - 1]);

    if (sorted.length % 2 == 0) {
        int index = sorted.length / 2;
        double result = (double) (sorted[index - 1] + sorted[index]) / 2;
        IO.println("Median: " + result);
    } else {
        int index = sorted.length / 2;
        median = sorted[index];
        IO.println("Median: " + median);
    }

    for (int i : sorted) {
        if (i > median) {
            above++;
        }
    }
    IO.println("Above average: " + above);
}
