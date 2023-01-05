package day07;

public class Q01_topZıplatma {

    public static void main(String[] args) {
        //bır top belırlı yukseklıkten atılmaktadır
        // atıldıgı yukseklıgın 3/4 u kadar yerden yukarı  zıplıyor
        //top zıplama yukseklıgı 1 metrenın altına ındıgınde durmaktadır
        //bu ana kadar aldıgı toplam yolu ve yerevvurma sayısını bulan
        //do whıle code blogu create edınız


        double yukseklık=2.00;

        double topuntoplamYol=0;
        int yereVurmaSayısı=0;

        do {
            topuntoplamYol+=yukseklık;
            yereVurmaSayısı++;
            yukseklık*=0.75;
            topuntoplamYol+=yukseklık;




        }while (yukseklık>=1);
        System.out.println("topun aldıgı toplam yol =" +topuntoplamYol+ "\ntopun yere vurma sayısı="
        +yereVurmaSayısı);










    }
}
