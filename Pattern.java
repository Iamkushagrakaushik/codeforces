public class Pattern {
    
    public static void main(String[] args) {
        int n=4;
       for(int j=0 ;j<n;j++){
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("_______________________________________________");
    for(int j=0 ;j<n;j++){
        for(int i=0;i<n;i++){
            if (i==0 || i==n-1 || j==0 || j==n-1){
            System.out.print("*");}
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    System.out.println("_______________________________________________");
    for(int j=0 ;j<n;j++){
        for(int i=0;i<j+1;i++){
            
            System.out.print("*");}
        
        
        System.out.println();
    }
    System.out.println("_______________________________________________");
    for(int j=0 ;j<n;j++){
        for(int i=j;i<n;i++){
            
            System.out.print("*");}
        
        
        System.out.println();
    }
    System.out.println("_______________________________________________");
    for(int j=0 ;j<n;j++){
        for(int k=0;k<j;k++){
            System.out.print(" ");
        }
        for(int i=0;i<n;i++){
            
            System.out.print("*");}
        
        
        System.out.println();
    }
    System.out.println("_______________________________________________");
    for(int j=0 ;j<n;j++){
        for(int k=0;k<n-j;k++){ 
            System.out.print(" ");
        }
        for(int i=0;i<n;i++){
            
            System.out.print("*");}
        
        
        System.out.println();
    }
    
    
    


    
    

}
}
