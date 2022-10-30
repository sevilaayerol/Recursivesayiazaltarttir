import java.util.Scanner;

public class sayilar {

	public static void main(String[] args) {
		System.out.println("Lütfen sayýyý girin.");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Girdiðiniz sayý: "+number);
        System.out.print("Çýktýsý : ");
        num(number,number,number);
        input.close();
    }
    static void num(int a,int b,int c)
    {
        if (a>0)
        {
            System.out.print(a+" ");
            a =a-5;
            c=a;
            num(a,b,c);
        }
        else if(a <=0)
        {
            System.out.print(c +" ");
            c=c+5;
            if (b ==c)
            {
                System.out.println(b);
            }
            else
            {
                num(a,b,c);

            }
        }
    }


}


