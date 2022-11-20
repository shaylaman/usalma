import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,k,toplam = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Sayımızı girelim: ");
        n = in.nextInt();
        System.out.print("Üs sayımzıı girelim: ");
        k = in.nextInt();
        for(int i = 1 ; i<=k ; i++){
            toplam *= n;
        }
        System.out.print("Değer: " + toplam);

    }
}