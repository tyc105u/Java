package String;

public class CountWords {
    public static void main(String[] args) {
        String input = "The king in the north remembers the north";
        String[] words = input.split(" ");
        int wrc = 1;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {

                if (words[i].equals(words[j])) {
                    wrc = wrc + 1;
                    words[j] = "0";
                }
            }
            if (words[i] != "0")
                System.out.println(words[i] + ": " + wrc);
            wrc = 1;

        }

    }

}