import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        int elemanSayisi = input.nextInt();

        int ilkEleman = 0;
        int ikinciEleman = 1;

        System.out.print("Fibonacci serisi: " + ilkEleman + " " + ikinciEleman);

        for (int i = 2; i < elemanSayisi; i++) {
            // Bir sonraki elemanı hesaplamak için, önceki iki elemanı toplarız.
            int sonrakiEleman = ilkEleman + ikinciEleman;

            // Sonraki elemanı ekrana yazdırırız.
            System.out.print(" " + sonrakiEleman);

            // Ardından, önceki elemanları güncelleriz.
            ilkEleman = ikinciEleman;
            ikinciEleman = sonrakiEleman;
        }

        input.close();
    }
}