package lec18;

import java.util.ArrayList;

public class lexo {
    public static void main(String[] args) {

        int n=1000;
        lexicontig(0,n);

    }
    public static void lexicontig(int curr, int n)
    {
        if(curr>n)
        {
            return;
        }
        System.out.println(curr);
        int i=0;
        if(curr==0)
        {
            i=1;
        }
        for(;i<9;i++)
        {
            lexicontig(curr*10+i,n);

        }

    }
}
