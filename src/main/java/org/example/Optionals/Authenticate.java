package org.example.Optionals;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Authenticate {
    private String userName;
    private String password;
    public Authenticate(){

    }
}
