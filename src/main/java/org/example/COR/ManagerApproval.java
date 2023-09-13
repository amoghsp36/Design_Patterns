package org.example.COR;

public class ManagerApproval implements PurchaseHandler{
    private PurchaseHandler nextHandler;
    @Override
    public void setNextHandler(PurchaseHandler handler){
        this.nextHandler=handler;
    }

    @Override
    public void processRequest(PurchaseAmount request) {
        if(request.getAmount() <= 5000){
            System.out.println("Your purchase request can be approved by a manager for amount "+request.getAmount());
        }else if(nextHandler != null){
            nextHandler.processRequest(request);
        }
    }
}
