
class singleDigit {
    public static void main(String[] args) {
        int n = 1235;
        System.out.println(solverecursion(n,0));
    }

    static int solverecursion(int n, int sum){
        if(n==0 && sum<9){
            return sum; 
        }
        
        if(n==0){
            n=sum;
            sum=0;
        }
        sum+=n%10;
        n=n/10;
        return solverecursion(n, sum);
    }

    
}