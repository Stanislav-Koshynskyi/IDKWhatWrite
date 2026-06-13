void main() {
    Scanner sc = new Scanner(System.in);
    IO.println(find(sc));
}

private static String find(Scanner sc) {
    int n = Integer.parseInt(sc.nextLine());

    String[] info = new String[n];
    HashMap<String, String> map = new HashMap<>();

    for (int i = 0; i < n; i++) {
        info[i] = sc.nextLine();
    }

    for (int i = 0; i < n; i++) {
        String[] result = info[i].split(" ");
        map.put(result[0], result[1]);
    }

    AtomicReference<String> maxName = new AtomicReference<>();
    AtomicInteger maxSeria = new AtomicInteger();

    map.forEach((k, v) -> {
        String numbers = v;
        int numberOfVidviduvan = 0;
        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) == '1') {
                numberOfVidviduvan += 1;
            }
            if (numbers.charAt(i) == '0') {
                numberOfVidviduvan = 0;
            }
        }
        if (maxSeria.get() < numberOfVidviduvan) {
            maxSeria.set(numberOfVidviduvan);
            maxName.set(k);
        }
    });

    return maxName + " " + maxSeria;
}
