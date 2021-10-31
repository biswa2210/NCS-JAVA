package LOGICS;

/*
CREATED BY BISWARUP BHATTACHARJEE
EMAIL    : bbiswa471@gmail.com
PHONE NO : 6290272740
*/
public class Amstrong_no {
    public  boolean isAmstrong(int n)
    {
        int a,rem,sum,t;
        t=n;
        a=t;
        sum=0;
        while(a!=0)
        {
            rem=a%10;
            sum=sum+(rem*rem*rem);
            a=a/10;
        }
        if (sum==t)

            return true;
        else
            return false;
    }
}
