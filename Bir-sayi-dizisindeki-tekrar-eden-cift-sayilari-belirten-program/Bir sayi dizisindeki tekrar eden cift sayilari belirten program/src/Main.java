import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Dizinin boyutu :");
        int n = inp.nextInt();

        int[] dizi = new int[n];
        System.out.println("Dizinin elamanlarını giriniz :");

        int[] duplicate = new int[n];
        int startIndex = 0;

        for(int i = 0; i < n ; i++) {
            dizi[i] = inp.nextInt();
            for (int j = 0 ; j < n ; j++){
                if ((i != j) && (dizi[i] == dizi[j] ) ) {
                    duplicate[startIndex++] = dizi[i];
                }
            }
        }
        System.out.println("================TEKRAR EDEN ÇİFT SAYILAR===============");
        for (int value : duplicate) {
            if (value!= 0 && value %2 == 0) {
                System.out.print(value + " ");
            }
        }



    }
}