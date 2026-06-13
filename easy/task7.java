void main() {
    Scanner sc = new Scanner(System.in);
    findStudent(sc);
}

private static void findStudent(Scanner sc) {
    int maxStudent = 1;
    int maxVisit = 0;
    int ghost = 0;
    
    int students = sc.nextInt();
    int classes = sc.nextInt();

    int[][] table = new int[students][classes];

    for (int i = 0; i < students; i++) {
        for (int j = 0; j < classes; j++) {
            table[i][j] = sc.nextInt();
        }
    }
    
    for(int i = 0; i < students; i++) {
        int visits = 0;
        for(int j = 0; j < classes; j++) {
            int n = table[i][j];
            if (n == 1) visits++;
        }
        if (visits > maxVisit) maxVisit = visits;
        maxStudent = i + 1;
    }

    for (int i = 0; i < classes; i++ ) {
        int visits = 0;
        for(int j = 0; j < students; j++) {
            int n = table[j][i];
            if (n == 1) visits++;
        }
        if (visits == 0) ghost++;
    }

    System.out.println(maxStudent);
    System.out.println(ghost);
}
