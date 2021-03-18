import java.util.Random;

class Main3 {
    public static void main(String[] args) {
        int[]tab = new int[10];
        Random random = new Random();
        for (int i = 0; i<tab.length; i++){
            tab[i] = - random.nextInt(101);
            System.out.print(tab[i] + " ");
        }
    }
}
