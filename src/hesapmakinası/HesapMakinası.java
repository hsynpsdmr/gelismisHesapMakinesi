package hesapmakinası;
import java.util.Scanner;
public class HesapMakinası {
    public static void main(String[] args) {
      int sayi1,sayi2;
String sec;
Scanner veri = new Scanner (System.in);
System.out.println("Yapılacak işlemi seçiniz : \n Toplama = 1 \t Çıkartma = 2 \n "
        + "Çaprma = 3 \t Bölme = 4 \n Üs Alma = 5 \t Karekök Alma = 6 \n Karesini Alma = 7 \t"
        + "Küpünü Alma = 8 \n Sinüs = 9 \t Cosinüs = 10 \n Tanjant = 11 \t Logaritma Alma = 12 \n Faktöriyel Alma = 13");
sec = veri.next();
switch (sec){
case "1" :
{  System.out.println("Toplama işlemi seçildi…");
System.out.print("1.Sayiyi giriniz = ");
sayi1= veri.nextInt();
System.out.print("2.Sayıyi giriniz = ");
sayi2= veri.nextInt();
System.out.println("Sonuç= "+ (sayi1+sayi2));
}break;
case "2":
{ System.out.println("Çıkarma işlemi seçildi…");
System.out.print("1.Sayiyi giriniz = ");
sayi1= veri.nextInt();
System.out.print("2.Sayıyi giriniz = ");
sayi2= veri.nextInt();
System.out.println("Sonuç= "+(sayi1-sayi2));
}break;
case "3":
{  System.out.println("Çarpma işlemi seçildi…");
System.out.print("1.Sayiyi giriniz = ");
sayi1= veri.nextInt();
System.out.print("2.Sayıyi giriniz = ");
sayi2= veri.nextInt();
System.out.println("Sonuç= "+(sayi1*sayi2));
}break;
case "4":
{ System.out.println("Bölme işlemi seçildi…");
System.out.print("Bölümü giriniz = ");
sayi1= veri.nextInt();
System.out.print("Böleni giriniz = ");
sayi2= veri.nextInt();
System.out.println("Sonuç= "+((float)sayi1/sayi2));
}break;
case "5":
{ System.out.println("Üs Alma işlemi seçildi…");
System.out.print("1.Sayiyi giriniz = ");
sayi1= veri.nextInt();
System.out.print("2.Sayıyi giriniz = ");
sayi2= veri.nextInt();
System.out.println("Sonuç= "+(int)Math.pow(sayi1,sayi2));
}break;
case "6":
{ System.out.println("Karekök Alma işlemi seçildi…");
System.out.print("1.Sayiyi giriniz = ");
sayi1= veri.nextInt();
System.out.println("Sonuç= "+(float)Math.sqrt(sayi1));
}break;
case "7":
{ System.out.println("Karesini Alma işlemi seçildi…");
System.out.print("1.Sayiyi giriniz = ");
sayi1= veri.nextInt();
System.out.println("Sonuç= "+(sayi1*sayi1));
}break;
case "8":
{ System.out.println("Küpünü Alma işlemi seçildi…");
System.out.print("1.Sayiyi giriniz = ");
sayi1= veri.nextInt();
System.out.println("Sonuç= "+(sayi1*sayi1*sayi1));
}break;
case "9":
{ System.out.println("Sinüs işlemi seçildi…");
System.out.print("1.Sayiyi giriniz = ");
sayi1= veri.nextInt();
System.out.println("Sonuç= "+(float)Math.sin(Math.toRadians(sayi1)));
}break;
case "10":
{ System.out.println("Cosinüs işlemi seçildi…");
System.out.print("1.Sayiyi giriniz = ");
sayi1= veri.nextInt();
System.out.println("Sonuç= "+(float)Math.cos(Math.toRadians(sayi1)));
}break;
case "11":
{ System.out.println("Tanjant işlemi seçildi…");
System.out.print("1.Sayiyi giriniz = ");
sayi1= veri.nextInt();
System.out.println("Sonuç= "+(float)Math.tan(Math.toRadians(sayi1)));
}break;
case "12":
{ System.out.println("Logaritma Alma işlemi seçildi…");
System.out.print("1.Sayiyi giriniz = ");
sayi1= veri.nextInt();
 System.out.println("Sonuç = "+(float)Math.log(sayi1));
}break;
case "13":
{ System.out.println("Faktöriyel işlemi seçildi…");
System.out.print("1.Sayiyi giriniz = ");
sayi1= veri.nextInt();
int faktoriyel = 1;
for (int i = 2; i <= sayi1; i++) {
faktoriyel = i * faktoriyel;
}
System.out.println("Sonuç = "+faktoriyel);
}break;
default:{System.out.println("Geçersiz ifade girildi…");}
}
    }
    
}
