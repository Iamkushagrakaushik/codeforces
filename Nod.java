public class Nod {
    static void prr(int i){
        if (i>0){
            System.out.println("JAVA");
            prr(i-1);

            

        }

    }
    static void pp(int c){
        if(c>0){
            System.out.println(c);
     pp(c-1);
     System.out.println(c);}
     }

    
    static int soln(long n){
        if (n==0){
            return 0;
        }
        return soln(n/10) +1;
    }
 public static void main(String[] args) {
    System.out.println(soln(4223546592922929920L));
    prr(5);
    pp(10);
 }   
}
