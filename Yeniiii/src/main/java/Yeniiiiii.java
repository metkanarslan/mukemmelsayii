import java.util.Scanner;
public class Yeniiiiii {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int number;
        int total=0;
        System.out.print("Sayi Giriniz: ");
        number=inp.nextInt();
        for (int i=1; i<number; i++){
            if(number%i==0){
                total+=i;
            }
        }
        if(total==number){
            System.out.println("Mükemmel Sayıdır.");
        }else{
            System.out.println("Mükemmel Sayı Değildir.");
        }



      }

    }


