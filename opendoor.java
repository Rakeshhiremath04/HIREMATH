import java.util.Scanner;

public class opendoor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int doorcode;
        System.out.println("enter age:");
        doorcode=sc.nextInt();


        if(doorcode>=18){
            System.out.println("you can vote");
        }
        else{
        System.out.println("your can not vote");
        }
    }
    
}
