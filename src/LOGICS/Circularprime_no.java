package LOGICS;
import LOGICS.Prime_no;

/*
CREATED BY BISWARUP BHATTACHARJEE
EMAIL    : bbiswa471@gmail.com
PHONE NO : 6290272740
*/
public class Circularprime_no {
    public boolean iscircularprime(int n)
    {
        Prime_no pr= new Prime_no();
        boolean flag = true;
        int  num, r, c = 0;
        num = n;
        while (num > 0)
        {
            r = num % 10;
            c++;
            num = num / 10;
        }
        num = n;
        for (int i = 1; i <= c; i++)
        {
            r = num % 10;
            num = num / 10;
            num = (r * (int) Math.pow(10, c - 1)) + num;
            if (pr.isprime(num))
            {
                flag = false;
                break;
            }
        }

        if(flag)
        {
           return true;
        }
        else
        {
            return false;
        }
    }
}
