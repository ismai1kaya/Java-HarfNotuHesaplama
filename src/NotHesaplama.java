import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //vize ile final notunu kullanıcıdan alıyoruz
        //sınavların yüzdelik etkileirini alıyoruz
       System.out.println("Vize notunuzu giriniz:");
            int vize = scanner.nextInt();
                System.out.println("Vize yüzde Kaç etki ediyor:");
                    int vizeYuzde = scanner.nextInt();

       System.out.println("Final notunuzu giriniz:");
            int  Final = scanner.nextInt();
                System.out.println("Final yüzde kaç etki ediyor:");
                    int finalYuzde = scanner.nextInt();



       double ortalama = (vize * vizeYuzde)/100 + (Final * finalYuzde)/100;


        if (ortalama > 85) {

            System.out.println("Harf Notunuz AA");
        }
        else if (ortalama < 85 && ortalama > 80) {

            System.out.println("Harf Notunuz BA");
        }
        else if (ortalama < 80 && ortalama > 75) {

            System.out.println("Harf Notunuz BB");
        }
        else if (ortalama < 75 && ortalama > 65) {

            System.out.println("Harf Notunuz CB");
        }
        else if (ortalama < 65 && ortalama >60) {

            System.out.println("Harf Notunuz CC");
        }
        else if (ortalama < 60 && ortalama >55) {

            System.out.println("Harf Notunuz CD");
        }
        else if (ortalama < 55 && ortalama > 50) {

            System.out.println("Harf Notunuz DD");
        }
        else{
            System.out.println("Harf Notunuz FF Başarısız Oldunuz!");
        }
    }
}
