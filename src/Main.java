import java.util.Scanner;


// Tek for döngüsü içinde de yazabiilrdim ama çıktıyı düzgün veremediğim için her biri için farklı dngüler kurdum
public class Main {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        //Kullanıcıdan kontrol etmesini istediği sayı alınır
        System.out.print("Sayıyı Giriniz : ");
        number = input.nextInt();

        // 4 ün üslerini yazan for döngüsü
        System.out.print("Dördün üsleri: ");
        for(int i = 1 ; i <= number ; i *= 4){
            System.out.print(i+ ",");
        }

        // üsler birbirine karışmasın diye...
        System.out.println("\n---------------------------");
        // 5 im üslerini yazan for döngüsü
        System.out.print("Beşin üsleri: ");
        for(int i = 1 ; i <= number ; i *= 5){
            System.out.print(i + ",");
        }
    }
}