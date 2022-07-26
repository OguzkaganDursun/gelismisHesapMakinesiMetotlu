import java.util.Scanner;

public class Main {
    /*
        1- Toplama İşlemi
        2- Çıkarma İşlemi
        3- Çarpma İşlemi
        4- Bölme işlemi
        5- Üslü Sayı Hesaplama
        6- Faktoriyel Hesaplama
        7- Mod Alma
        8- Dikdörtgen Alan ve Çevre Hesabı
     */

    //Toplama, cikarma, carpma, bolme, us alma, faktoriyel hesabi, mod alma,
    // dikdortgen alan ve cevre hesabi icin ayri ayri metot olusturuldu.
    static void toplama()
    {
        int sayi1, sayi2, sonuc;
        Scanner scan = new Scanner(System.in);
        System.out.print("------------------------------\n1. Sayiyi Giriniz : ");
        sayi1 = scan.nextInt();

        System.out.print("2. Sayiyi Giriniz : ");
        sayi2 = scan.nextInt();

        sonuc = sayi1 + sayi2;
        System.out.println("\n------------------------------\nGirdiginiz Sayilarin Toplami : " + sonuc);
    }

    static void cikarma()
    {
        int sayi1, sayi2, sonuc;
        Scanner scan = new Scanner(System.in);
        System.out.print("------------------------------\n1. Sayiyi Giriniz : ");
        sayi1 = scan.nextInt();

        System.out.print("2. Sayiyi Giriniz : ");
        sayi2 = scan.nextInt();

        sonuc = sayi1 - sayi2;
        System.out.println("\n------------------------------\nGirdiginiz Sayilarin Farki : " + sonuc);
    }

    static void carpma()
    {
        int sayi1, sayi2, sonuc;
        Scanner scan = new Scanner(System.in);
        System.out.print("------------------------------\n1. Sayiyi Giriniz : ");
        sayi1 = scan.nextInt();

        System.out.print("2. Sayiyi Giriniz : ");
        sayi2 = scan.nextInt();

        sonuc = sayi1 * sayi2;
        System.out.println("\n------------------------------\nGirdiginiz Sayilarin Carpimi : " + sonuc);
    }

    static int bolme()
    {
        int sayi1, sayi2, sonuc;
        Scanner scan = new Scanner(System.in);
        System.out.print("------------------------------\n1. Sayiyi Giriniz : ");
        sayi1 = scan.nextInt();

        System.out.print("2. Sayiyi Giriniz : ");
        sayi2 = scan.nextInt();

        if (sayi2 == 0)
        {
            System.out.println("------------------------------\nIkinci Sayi 0'dan Farkli Olmalidir!");
            return 0;
        }
        sonuc = sayi1 / sayi2;
        System.out.println("------------------------------\nGirdiginiz Sayilarin Bolumu : " + sonuc);
        return sonuc;
    }

    static void usluSayi()
    {
        int taban, usSayisi, sonuc = 1;
        Scanner scan = new Scanner(System.in);

        System.out.print("------------------------------\nTaban Sayisini Giriniz : ");
        taban = scan.nextInt();

        System.out.print("Us Olacak Sayiyi Giriniz : ");
        usSayisi = scan.nextInt();

        for (int i = 1; i <= usSayisi; i++)
        {
            sonuc *= taban;
        }
        System.out.println("------------------------------\n"+ taban +" Ussu "+ usSayisi + " : " + sonuc);
    }

    static void faktoriyel()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("------------------------------\nFaktoriyelini Almak Istediginiz Sayiyi Giriniz : ");
        int sayi = scan.nextInt();
        int sonuc = 1;

        for (int i = sayi; i > 0; i--) {
            sonuc = sonuc * i;
        }

        System.out.println("------------------------------\n"+ sayi + " Sayisinin Faktoriyeli : " + sonuc);
    }

    static void modAlma()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("------------------------------\nModu Alinacak Sayiyi Giriniz: ");
        int sayi = scan.nextInt();

        System.out.print("Modu Giriniz: ");
        int mod = scan.nextInt();

        int sonuc = sayi % mod;
        System.out.println("Sonuc : " + sonuc);
    }

    static void dikdortgenAlanCevre()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("------------------------------\nKisa Kenari Giriniz: ");
        int kisaKenar = scan.nextInt();

        System.out.print("Uzun Kenari Giriniz: ");
        int uzunKenar = scan.nextInt();

        System.out.println("------------------------------\nDikdortgenin Cevresi: " + (2 * (uzunKenar + kisaKenar)));
        System.out.println("Dikdortgenin Alani: " + (uzunKenar * kisaKenar));
    }

    static void surpriz()
    {
        System.out.println("Tuslamaniz Icin Tesekkurler :)\nProgrami Kullanidiginiz Icin Tesekkur Ederiz!");
    }

    public static void main(String[] args) {
        //Degiskenler tanimlandi.
        int secim, sayi1, sayi2;

        //Kullanicidan yapmak istedigi islem icin secim alindi ve islem yapilarak ekrana yazdirildi.
        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------------\n\tGelismis Hesap Makinesi\n------------------------------");
        System.out.print("1. Toplama Islemi\n2. Cikarma Islemi\n3. Carpma Islemi\n4. Bolme Islemi\n5. Uslu Sayi Hesaplama" +
                "\n6. Faktoriyel Hesaplama\n7. Mod Alma\n8. Dikdortgen Alan ve Cevre Hesabi\n9. Surpriz\n0. Cikis Yap");


        while (true)
        {
            System.out.print("\n------------------------------\nSeciminizi Giriniz : ");
            secim = scan.nextInt();

            if (secim == 0) {
                System.out.println("------------------------------\nProgrami Kullandiginiz Icin Tesekkurler!");
                break;
            }

            switch (secim)
            {
                case 1:
                    toplama();
                    break;

                case 2:
                    cikarma();
                    break;

                case 3:
                    carpma();
                    break;

                case 4:
                    bolme();
                    break;

                case 5:
                    usluSayi();
                    break;

                case 6:
                    faktoriyel();
                    break;

                case 7:
                    modAlma();
                    break;

                case 8:
                    dikdortgenAlanCevre();
                    break;

                case 9:
                    surpriz();
                    break;

                default:
                    System.out.println("Hatali Tuslama Yaptiniz!");
            }
        }
    }
}
