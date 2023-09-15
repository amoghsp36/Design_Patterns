package org.example.Optionals;

import java.util.Optional;

public class VerifyUser {
    private static final Authenticate authenticate= new Authenticate("user123","password");
    private static final String welcomeMessage = "Welcome user!";
    private Optional<String> customWelcomeMessage = Optional.empty();

    public Optional<String> authenticateUser(String name, String password){
        if(authenticate.getUserName().equals(name) && authenticate.getPassword().equals(password)){
            return Optional.of("Authentication successful");
        }else{
            return Optional.empty();
        }
    }
    public void setCustomMessage(String message){
        customWelcomeMessage = Optional.ofNullable(message);
    }
    public String getCustomMessage(){
        return customWelcomeMessage.orElse(welcomeMessage);
    }

}
