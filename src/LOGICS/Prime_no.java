package LOGICS;

/*
CREATED BY BISWARUP BHATTACHARJEE
EMAIL    : bbiswa471@gmail.com
PHONE NO : 6290272740
*/
public class Prime_no
{
    public boolean isprime(int n)
    {
        int i,c=0;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c>1)
            return false;
        else
            return true;
    }
}
