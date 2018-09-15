package com.gad;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Z4 {
    private MessageDigest messageDigest;

    private byte byteData[];

    public Z4(String password) {
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            System.err.println(e.toString());
            return;
        }
        messageDigest.update(password.getBytes());
        byteData = messageDigest.digest();
    }

    public boolean check(String password) {
        messageDigest.update(password.getBytes());
        return Arrays.equals(byteData, messageDigest.digest());
    }
}
