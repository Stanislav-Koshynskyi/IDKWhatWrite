void main() {
    Scanner sc = new Scanner(System.in);
    int firstN = sc.nextInt();
    int[] anna = new int[firstN];
    for (int i = 0; i < anna.length; i++) {
        anna[i] = sc.nextInt();
    }
    int secondN = sc.nextInt();
    int[] katya = new int[secondN];
    for (int i = 0; i < secondN; i++) {
        katya[i] = sc.nextInt();
    }

    int resultLength = katya.length + anna.length;
    int[] result = new int[resultLength];
    for (int i = 0; i < anna.length; i++) {
        result[i] = anna[i];
    }
    for (int i = 0; i < katya.length; i++) {
        result[i + anna.length] = katya[i];
    }

    int[] sorted = Arrays.stream(result).sorted().toArray();

    for (int i : sorted) {
        IO.print(i);
    }
}
