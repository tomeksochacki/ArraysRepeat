import java.util.Random;

class Main2 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random random = new Random();

        int[] tab2 = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(101);
            System.out.print(tab[i] + " ");
        }

        System.out.println("++++++++++++++");
        for (int i = tab2.length - 1; i >= 0; i--) {
            tab2[i] = tab[i];
            System.out.print(tab2[i] + " ");
        }

        System.out.println();
        for (int k = 0; k < tab.length; k++){
            tab2[k] = tab[tab.length - 1 - k];
            System.out.print(tab2[k] + " ");
        }
    }
}
