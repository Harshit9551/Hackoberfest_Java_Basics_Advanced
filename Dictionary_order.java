package assignment_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Dictionary_order
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        ArrayList<String> list = new ArrayList<>();
        dictionary(str,"",str,list);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
    public static void dictionary(String str, String str1, String str2, ArrayList<String> list)
    {
        if(str.length()==0) {
            if (str1.compareTo(str2) > 0) {
                list.add(str1);
            }
            return;

        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String s=str.substring(0,i)+str.substring(i+1);
            dictionary(s,str1+ch,str2,list);
        }
    }
}
