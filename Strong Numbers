class Solution
{
    public int is_StrongNumber(int n)
    {
        int temp=n;
        int sum=0;
        
        while(temp>0)
        {
            int ans=temp%10;
            sum=sum +factorial(ans);
            temp=temp/10;
            
            
        }
        if(sum==n)
        {
            return 1;
        }
        return 0;
    }
    public  static int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact =fact *i;
        }
        return fact;
    }
}
