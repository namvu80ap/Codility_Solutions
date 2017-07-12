package com.nalaan.codilitylession.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by namvu on 16/10/18.
 */
public class M3 {

//    public static void main(String args[] ) throws Exception {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
//        Scanner in = new Scanner(System.in);
//        Set<String> uni = new HashSet<String>();
//
//
//
//
//        while (in.hasNext() == true ) {
//            String x = in.next();
//
//            if (Character.isUpperCase(x.charAt(0)) || Character.isDigit(x.charAt(0))) {
//                uni.add(x);
//            }
//
//        }
//        System.out.println( uni.size() );
//    }


    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        while (in.hasNext() == true ) {
            String x = in.next();
            StringBuffer out = new StringBuffer();
            for( int y =0 ; y < x.length() ; y++ ) {
                Pattern p = Pattern.compile("^*[02468]$");
                Matcher m = p.matcher( ""+x.charAt(y));
                if (m.matches()) {
                    out.append(m.group());
                    out.append(",");
                }
            }
            System.out.println(out.substring(0,out.length()-1));
        }
    }

    Scanner in = new Scanner(System.in);
    Set<String> uni = new HashSet<String>();
    public static String test(){
        return "yes";
    }

}
