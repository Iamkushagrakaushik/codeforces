import java.util.Scanner;
public class Tax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.nextLine();
        System.out.println("enter item number");
        int itemno=sc.nextInt();
        sc.nextLine();
        int i=0;
        String item[]=new String[itemno];
        int [] tax=new int[itemno]; 
        int [] price= new int[itemno];
        while (i<itemno){
            System.out.println("enter item ");
            item[i]=sc.nextLine();
            System.out.println("enter price");
            price[i]=sc.nextInt();
            sc.nextLine();
            System.out.println("enter tax");
            tax[i]=sc.nextInt();
            sc.nextLine();
            i++;

             
        }
        System.out.println("customer name ==>"+name);
        for(int j=0;j<itemno;j++){
            System.out.println("***************************");
            System.out.println("item number"+(j+1));
            System.out.println("item is"+item[j]);
            
            System.out.println("price exclusive tax is"+(price[j]-(price[j]*tax[j])));
             

        }

    sc.close();
    }
    
}
