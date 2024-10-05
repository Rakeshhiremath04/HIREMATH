import java.util.Scanner;
public class week {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("enter choice");
        choice=sc.nextInt();
        switch(choice){
            case 1:
                  System.out.println("Mon");
                  break;
            case 2:
                  System.out.println("Tus");
                  break;
            case 3:
                  System.out.println("Wed");
                  break;
            case 4:
                  System.out.println("Thu");
                  break;
            case 5:
                  System.out.println("Fri");
                  break;
            case 6:
                  System.out.println("Sta");
                  break;
            case 7:
                  System.out.println("sun");
                  break;
                  default:
                  System.out.println("its birthday");


        }
    }
    
}
