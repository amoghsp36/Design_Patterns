package org.example.COR;

public class DirectorApproval implements PurchaseHandler{
    public void setNextHandler(PurchaseHandler handler){

    }
    public void processRequest(PurchaseAmount request){
        System.out.println("Your purchase can be approved by a Director of amount "+request.getAmount());

    }
}
