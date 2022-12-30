package day02;

import java.util.Scanner;

public class Q2_SwıtchCase_HesapMakınası {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("matematıksel ısleme sokmak ıcın ıkı tane tam sayı gırınız");

        int a=scan.nextInt();
        int b=scan.nextInt();

        System.out.println("ıslem turunu secınız : \n\t1  : Toplama\n\t2 : Cıkarma\n\t3 :Carpma\n\t4 :Bolme");

      int ıslem=scan.nextInt();

      if (ıslem==1) System.out.println(a+b);
      else if (ıslem==2) System.out.println(a-b);
      else if (ıslem==3) System.out.println(a*b);
      else if (ıslem==4) System.out.println(a/b);
      else System.out.println("yanlıs gırıs yaptınız, lutfen tekrar deneyınız");

        System.out.println("*********************Swıtch case cozumu****************");

        switch (ıslem){
            case 1:
                System.out.println(a+ " + " +b +"= "+ (a+b));break;
            case 2: System.out.println(a+ " + " +b +"= "+ (a-b));break;
            case 3: System.out.println(a+ " + " +b +"= "+ (a*b));break;

            case 4:
                System.out.println(a+ " + " +b +"= "+ (a/b));break;
            default:
                System.out.println("yanlıs gırıs yaptınız ,lutfen tekrar deneyın");

            }
            

        }


        }






