class Solution {
    static String isKrishnamurthy(int N) 
    {
        Solution s= new Solution();
        int temp =N;
        int sum=0;
        while(temp>0)
        {
            int ans=temp%10;
            sum=sum+s.fact(ans);
            temp=temp/10;
        }
        if(sum==N)
        {
            return "YES";
        }
        return "NO";
        
        
        
    }
    public int fact(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
       
    }
}
