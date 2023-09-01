import java.util.Scanner;
public class NotHesaplama {
    public static void main(String[] args) {
        Scanner inputf=new Scanner(System.in);
        byte fzk,kimya,mat,turk,tarih,muzik;
        System.out.print("Fizik notunu giriniz: ");
        fzk=inputf.nextByte();
        Scanner inputk=new Scanner(System.in);
        System.out.print("Kimya notunu giriniz: ");
        kimya=inputk.nextByte();
        Scanner inputm=new Scanner(System.in);
        System.out.print("Matematik notunu giriniz: ");
        mat=inputm.nextByte();
        Scanner inputt=new Scanner(System.in);
        System.out.print("Türkçe notunu giriniz: ");
        turk=inputt.nextByte();
        Scanner inputta=new Scanner(System.in);
        System.out.print("Tarih notunu giriniz: ");
        tarih=inputta.nextByte();
        Scanner inputmu=new Scanner(System.in);
        System.out.print("Müzik notunu giriniz: ");
        muzik=inputmu.nextByte();
        double ortalama;
        ortalama=(fzk+mat+muzik+turk+kimya+tarih)/6;
        System.out.println("Not ortalamanız: "+ ortalama);
        String  str = ortalama > 60 ? "Tebrikler! sınıfı geçtiniz." : "Üzgünüz, sınıfta kaldınız.";
        System.out.print(str);
    }
}
