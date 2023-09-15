package org.example.Optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        VerifyUser verifyUser = new VerifyUser();
        Optional<String> authResult = verifyUser.authenticateUser("user123","password");
        System.out.println(authResult.get());

        System.out.println(verifyUser.getCustomMessage());
        verifyUser.setCustomMessage("Welcome user123");
        System.out.println(verifyUser.getCustomMessage());
    }
}