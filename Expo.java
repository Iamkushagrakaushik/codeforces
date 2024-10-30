public class Expo {
    static int exp(int n, int e){
        if (e==0){
            return 1;
        }
        n=n*exp(n,e-1);
        return n;
    } 
    public static void main(String[] args) {
        System.out.println(exp(4,3));
    }
}
