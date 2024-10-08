class Loop{
    public static void main(String[] args) {
        if (args.length!=3){
            System.out.println("invalid input");

        }
        else{
            int a=Integer.parseInt(args[0]);
            String b=args[1];
            int c=Integer.parseInt(args[2]);
            switch (b) {
                case "+":
                System.out.println(a+c);
                break;

                case "-": 
                System.out.println(a-c);
                break;

                case "*":
                System.out.println(a*c);
                break;

                case "/":
                System.out.println(a/c);
                break;
                
                default:
                System.out.println("invalid operator");
                    break;
            }

        }
    
    }
}