package LOGICS;

/*
CREATED BY BISWARUP BHATTACHARJEE
EMAIL    : bbiswa471@gmail.com
PHONE NO : 6290272740
*/
import java.util.Scanner;
public class Neonnum {
    public boolean neon(int m){
        int f, rem, s = 0;

        f = m * m;
        for (; f != 0; f = (f / 10)) {
            rem = f % 10;
            s = rem + s;

        }
        if (s == m)
            return true;
        else
            return false;
    }
}
