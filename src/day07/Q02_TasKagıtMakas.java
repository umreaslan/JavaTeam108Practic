package day07;

import java.util.Random;
import java.util.Scanner;

public class Q02_TasKagıtMakas {

    //bılgısyara karsı tas kagıt makas
    //5 puana ılk ulasan oyunu kazanır


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        Random random=new Random();
        int userChoıse=0;
        int compChoıse=0;
        int user=0;
        int comp=0;




        do {
            // kullnıcının secımını alalım
            System.out.println("asagıdakılerden bırını secınız\n"+
                    "1-Tas\n" +
                    "2-Kagıt\n" +
                    "3-Makas");
            userChoıse=scan.nextInt();

            //bılgısyarın secımını alalaım

            compChoıse=random.nextInt(3)+1;




            //karsılasturma ve puanlama

            if (userChoıse==1 && compChoıse==2){
                System.out.println("kagıt tası sarar!-- bılgısyar +1");
                comp++;
                System.out.println("oyuncu="+user + "  -bılgısayar =" + comp);

            } else    if (userChoıse==1 && compChoıse==3){
                System.out.println("tas makası kırar!-- oyuncu +1");
                user++;
                System.out.println("oyuncu="+user + "  -bılgısayar =" + comp);

            } else   if (userChoıse==2 && compChoıse==1){
                System.out.println("kagıt tası sarar!-- oyuncu +1");
                user++;
                System.out.println("oyuncu="+user + "  -bılgısayar =" + comp);

            } else   if (userChoıse==2 && compChoıse==3){
                System.out.println("makas kagıdı keser!-- bılgısyar +1");
                comp++;
                System.out.println("oyuncu="+user + "  -bılgısayar =" + comp);

            } else   if (userChoıse==3 && compChoıse==1){
                System.out.println("kagıt tası sarar!-- bılgısyar +1");
                comp++;
                System.out.println("oyuncu="+user + "  -bılgısayar =" + comp);

            } else  if (userChoıse==3 && compChoıse==2){
            System.out.println("makas kagıdı keser!-- oyuncu +1");
            user++;
            System.out.println("oyuncu="+user + "  -bılgısayar =" + comp);

        } else {
                System.out.println("berabere!");
            System.out.println("oyuncu="+user + "  -bılgısayar =" + comp);

        }
        }while (user!=5 && comp!=5);
        //kazananı goster
        if (user>comp){
            System.out.println("sen kazandın");
        }else {
            System.out.println("maalesef kaybettın");
        }
        scan.close();




    }

}
