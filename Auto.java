public class Auto {
    static boolean auto(int n){
        int n2=n*n;
        int t1=n;
         
        int c1=0;
        
        while(t1!=0 ){
            if (t1>0){
                c1++;
                t1/=10;

            }
            


        }
        int p=c1;
        int t=1;
        while(p>0){
            t*=10;
            p--;

        }
        if (n2%t==n){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        System.out.println(auto(625));
    }
    
}
