import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner scann = new Scanner(System.in);
            int userScor = 0;
            int computerScor = 0;
            System.out.println("-----TAŞ KAĞIT MAKAS OYUNU-----");
            System.out.println("1: Taş , 2: Kağıt , 3: Makas");
            int selection;
            do{
                System.out.print("Seçiminiz: ");
                selection = scann.nextInt();

                while(selection>3 || 0>selection){
                    System.out.print("Hatalı giriş yaptınız tekrar deneyin: ");
                    selection = scann.nextInt();
                }

                int computerSelection = (int) (Math.random() * 3);

                if (selection == 1) {
                    if (computerSelection == 1) {
                        System.out.println("Bilgisayarın seçimi: Taş / Sonuç: Berabere");
                    }

                    else if (computerSelection == 2) {
                        System.out.println("Bilgisayarın seçimi: Kağıt / Sonuç: Kaybettiniz");
                        computerScor++;
                    }

                    else {
                        System.out.println("Bilgisayarın seçimi: Makas / Sonuç: Kazandınız :)");
                        userScor++;
                    }

                    System.out.println("Puanınız: " + userScor + " , Bilgisayarın puanı: " + computerScor);
                }

                if (selection == 2){
                    if (computerSelection == 1) {
                        System.out.println("Bilgisayarın seçimi: Taş / Sonuç: Kazandınız :)");
                        userScor++;
                    }

                    else if (computerSelection == 2) {
                        System.out.println("Bilgisayarın seçimi: Kağıt / Sonuç: Berabere");
                    }

                    else{
                        System.out.println("Bilgisayarın seçimi: Makas / Sonuç: Kaybettiniz");
                        computerScor++;
                    }

                    System.out.println("Puanınız: " + userScor + " , Bilgisayarın puanı: " + computerScor);
                }

                if (selection == 3) {
                    if (computerSelection == 1) {
                        System.out.println("Bilgisayarın seçimi: Taş / Sonuç: Kaybettiniz");
                        computerScor++;
                    }

                    else if (computerSelection == 2) {
                        System.out.println("Bilgisayarın seçimi: Kağıt / Sonuç: Kazandınız :)");
                        userScor++;
                    }

                    else{
                        System.out.println("Bilgisayarın seçimi: Makas / Sonuç: Berabere");
                    }

                    System.out.println("Puanınız: " + userScor + " , Bilgisayarın puanı: " + computerScor);
                }
            }while(selection != 0 && userScor != 3 && computerScor != 3);

            if(userScor > computerScor) {
                System.out.println("Oyun bitti. " + userScor + "-" + computerScor + " kazandınız.");
            }

            else{
                System.out.println("Oyun bitti. " + computerScor + "-" + userScor + " kaybettiniz.");
            }


    }
}
