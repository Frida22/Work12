package HomeWork14.Training;


public class ForTraining1 {
    public static void main(String[] args) {

        int[] anna = {1, 5, 9, 75, 3, 8, 3, 6, 56, 1};
        int len = anna.length;
        int lokator = 0;
        while (lokator != len) {
            for (int i = 0; i < len - 1; i++) {
                if (anna[i] > anna[i + 1]) {
                    int c = anna[i + 1];
                    anna[i + 1] = anna[i];
                    anna[i] = c;
                }
            }
            lokator ++;
        }
        for (int i = 0; i < len; i++) {
            System.out.println(anna[i]);
        }
    }
}