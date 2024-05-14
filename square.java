public class square {
    public static void main(String[] args) {
        int a=17,x,k,f=0;
        k=Math.round(a/2);
        for(x=1;x<k;x++)
        {
            if(x*x==a)
            {
                System.out.println("valid");
                f=1;
                break;

            }
            
        }
        if (f==0) {
            
            System.out.println("not valid");
            System.out.println("not valid");
            
        }
    }
}
