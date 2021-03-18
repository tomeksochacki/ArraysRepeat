import java.util.Random;

class Main {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random random = new Random();
        for (int i = 0; i<tab.length; i++){
            tab[i] = random.nextInt(101);
            System.out.print(tab[i] + " ");
        }

        double average = 0.0;
        double sum = 0.0;
        for (int j = 0; j<tab.length; j++) {
            sum = tab[j] + sum;
        }
        System.out.println("Sum: " + sum);

        average = ((double) sum)/((double)tab.length);
        System.out.println("Average: " + average);
    }
}
