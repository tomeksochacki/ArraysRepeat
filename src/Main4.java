import java.util.Arrays;
import java.util.Random;

class Main4 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random random = new Random(101);

        for (int i = 0; i < tab.length; i++) {

            int g = 0;
            do {
                tab[i] = random.nextInt(101);
                if (tab[i] % 7 != 0) {
                    continue;
                }
                g++;
            } while (g < tab.length);
        }
        System.out.println(Arrays.toString(tab));

        for (int k = 0; k < tab.length; k++) {
            int variable;
            while (true) {
                variable = random.nextInt(101);
                if (variable % 7 == 0) {
                break;
                }
            }
            tab[k] =  variable;
            System.out.print(tab[k] + " ");
        }


    }
}
