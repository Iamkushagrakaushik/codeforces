import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
public class Tax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ResourceBundle r;
        System.out.println("please choose your locale\n press 1 for hindi \n press 2 for french \n press anything else to continue in english");
        int ch=sc.nextInt();
        sc.nextLine();
        Locale locale;
        if (ch==1){
            locale =Locale.of("hi","IN");

        }
        else if(ch==2){
         locale =Locale.of("fr","FR");

        }
        else{
            locale =Locale.of("en","US");
        }
        r= ResourceBundle.getBundle("lo", locale);

        System.out.println(r.getString("getname"));
        String name=sc.nextLine();
        System.out.println(r.getString("getitemno"));
        int itemno=sc.nextInt();
        sc.nextLine();
        int i=0;
        String item[]=new String[itemno];
        int [] tax=new int[itemno]; 
        int [] price= new int[itemno];
        while (i<itemno){
            System.out.println(r.getString("getitem"));
            item[i]=sc.nextLine();
            System.out.println(r.getString("getprice"));
            price[i]=sc.nextInt();
            sc.nextLine();
            System.out.println(r.getString("gettax"));
            tax[i]=sc.nextInt();
            sc.nextLine();
            i++;

             
        }
        System.out.println(r.getString("prcu")+name);
        for(int j=0;j<itemno;j++){
            System.out.println("***************************");
            System.out.println(r.getString("gin")+(j+1));
            System.out.println(r.getString("itis")+item[j]);
            
            System.out.println(r.getString("peti")+(price[j]-(price[j]*tax[j])));
             

        }

    sc.close();
    }
    
}
