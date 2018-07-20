package com.sjzc.java;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * 模板的位置：setting-Editor-live templates/postfix completion
 *
 */
public class TemplateTest {

//    prsf
     private static final int prsf = 0;

//    psf
    public static final int psf = 0;

//    psfi
    public static final int psfi = 0;

//    psfs
    public static final String psfs = "China";



    //psvm
    public static void main(String[] args) {

//        sout
        System.out.println("");
//        soutm/soutp/soutv/
        System.out.println("TemplateTest.main");
        String[] names = new String[]{"Tom","sdc"};
//        fori
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
//        变形：iter
        for (String arg : names) {
            System.out.println(arg);
        }
//        itar
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println(name);
        }

        List list = new ArrayList();
        list.add("123");
        list.add("666");
        list.add("789");
//      list.for
        for (Object o : list) {
            
        }
//        变形：list.fori、list.forr
        for (int i = 0; i < list.size(); i++) {
            
        }
//        list.forr:逆序
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

//        ifn
        if (list == null) {
            System.out.println("null");
        }    
//       变形：inn
        if (list != null) {
            
        }
//      变形：xxx.nn、xxx.null
        if (list != null) {

        }
//        list.null
        if (list == null) {

        }


//        prsf

    }


}
