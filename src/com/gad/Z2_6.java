package com.gad;

public class Z2_6 {
    StringBuffer str;

    public Z2_6(String s) {
        str = new StringBuffer(s);
    }

    @Override
    public String toString() {

        String strR = str.toString();
        str.reverse();
        if (str.length() == 4 && strR.equals(str.toString())) {
            return "true";
        } else {
            return "false";
        }
    }
}
