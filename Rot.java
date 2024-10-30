public class Rot {
    static int rot(int n, int r,int c){
        if (r==0){
            return n;
        }
         
        int c1=c;
         

         
        int q=n%10;
        n/=10;
        while(c>1){
            q*=10;
            c--;
        }
         
        q+=n;
        return rot(q,r-1,c1);
    }
    static boolean palin(int n){
        int s=0;
        int t=n;
        while(t>0){
           int  r=t%10;
            t/=10;
            s=s*10+r;


        }
        if (s==n){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        int n=11*11*11*11*11;
         
        int t=n;
        int c=0;
        while(t!=0){
            c+=1;
            t/=10;
        }
        int s=n;
        int f=0;
        int z=c;
        while(z>0){
             
            if (palin(s)){
                System.out.println(s+" is palindrome");
                f=1;
                break;

            }
             s=rot(n,1,c);
            z--;
        }
        if (f==0){
            System.out.println("no rotation can make it palindrome");
        }
    }
    
}
