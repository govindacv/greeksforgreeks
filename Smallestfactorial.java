class Solution
{
    
    int findNum(int n)
    {
        int low =1;
        int high=n*5;
        int inti =low;
        while (low<=high)
        {
            int mid=(low +high)/2;
            int zero = trailingzero(mid);
            if (zero>=n)
            {
                inti =mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
            
        }
        return inti;
        
        
    }
    public  static int trailingzero(int n)
    {
        int count =0;
        for (int i=5;i<=n;i*=5)
        {
            count =count+(n/i);
        }
        return count;
    }
}
