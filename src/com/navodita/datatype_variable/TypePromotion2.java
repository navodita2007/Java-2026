package com.navodita.datatype_variable;

public class TypePromotion2 {
    public static void main(String[] args) {
        byte b=5;
       // byte a=b*2; // error because type promotion occurs in expression b*2. b becomes int datatype.
                    // int is bigger than byte, so data loss can take place that's why java throws error.
        byte a = (byte) (b*2); // Type casting
        System.out.println(a);
    }
}
