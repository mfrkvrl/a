import  java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        int choice;
        double summary = 0.0;
        Scanner scanner = new Scanner(System.in);
        while(true) {
        System.out.println("Yapmak istediğiniz seçimi giriniz : ");
        System.out.println("\n1 : Toplama\n2 : Çıkarma \n3 : Çarpma \n4 : Bölme \n5 : Çıkış");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    double number;
                    boolean deger=true;
                    while (deger) {
                        System.out.println("Toplamak istediğiniz sayıları giriniz, işlemi bitirmek için '0' değerini giriniz : ");
                        number = scanner.nextDouble();
                        if(number==0){
                            System.out.println("Toplama işleminin sonucu : "+summary);
                            deger=false;
                        }
                        summary += number;
                        System.out.println("Toplam Değer: "+summary);
                    }
                    break;
                case 2:
                    double number2;
                    boolean deger2=true;
                    boolean turn=true;
                    while (deger2) {
                        System.out.println("Çıkarmak istediğiniz sayıları giriniz, işlemi bitirmek için '0' değerini giriniz : ");
                        number2 = scanner.nextDouble();
                        if(number2==0){
                                System.out.println("Çıkarmaişleminin sonucu : " + summary);
                                deger = false;

                        }
                        if(turn==true) {
                            summary = number2;
                            turn=false;
                        }
                        else {
                            summary -= number2;
                            System.out.println("Toplam Değer: "+summary);
                        }

                    }
                    break;
                case 3:
                    double number3;
                    boolean deger3=true;
                    boolean turn2=true;
                    while (deger3) {
                        System.out.println("Çarpmak istediğiniz sayıları giriniz, işlemi bitirmek için '0' değerini giriniz : ");
                        number3 = scanner.nextDouble();
                        if(number3==0){
                            System.out.println("Çarpma işleminin sonucu : " + summary);
                            deger = false;
                            break;

                        }
                        if(turn2==true) {
                            summary = number3;
                            turn2=false;
                        }
                        else {
                            summary *= number3;
                            System.out.println("Toplam Değer: "+summary);
                        }
                    }
                    break;
                case 4:
                    double number4;
                    boolean deger4=true;
                    boolean turn3=true;
                    while (deger4) {
                        System.out.println("Bölmek istediğiniz sayıları giriniz, işlemi bitirmek için '0' değerini giriniz : ");
                        number4 = scanner.nextDouble();
                        if(number4==0){
                            System.out.println("Bölme işleminin sonucu : " + summary);
                            deger = false;
                            break;

                        }
                        if(turn3==true) {
                            summary = number4;
                            turn3=false;
                        }
                        else {
                            summary /= number4;
                            System.out.println("Toplam Değer: "+summary);
                        }
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Geçerli bir değer girin");
            }
        }
    }
}
