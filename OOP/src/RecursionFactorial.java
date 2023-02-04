public class RecursionFactorial {
    
    int fact(int n){
        if(n == 1)
            return 1;
        else
            return n * fact(n-1);
    }
    public static void main(String[] args) {
        RecursionFactorial ob = new RecursionFactorial();
        int result = ob.fact(5);
        System.out.printf("Factorial: %d \n",result);

    }
    
}