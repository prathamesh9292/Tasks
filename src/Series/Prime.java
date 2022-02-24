package Series;

public class Prime {

    //    Prime Method
    int isPrime;
    public void prime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0)
            {
                isPrime=0;
                break;
            }
            else
                isPrime=1;
        }
        if(isPrime==1)
            System.out.println(n+" is a prime number.");
        else System.out.println(n+" is not a prime number.");
    }
}
