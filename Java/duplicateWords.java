class DuplicateWordSearcher {
    public static void main(String[] args) {
        String text = "Hello Hello everyone.";
        System.out.println("The String is : "+text);
        String[] words = text.split("\\s+");
        for (int i = 0; i < words.length; i++) {
        int count = 1;
        for (int j = i + 1; j < words.length; j++) {
            if (words[i].equals(words[j])) {
                count++;
                words[j] = "";
                }
            }
            if (count > 1 && !words[i].isEmpty()) {
                System.out.println(words[i] + " is repeated " + count + " times");
            }
        }
    }
}
