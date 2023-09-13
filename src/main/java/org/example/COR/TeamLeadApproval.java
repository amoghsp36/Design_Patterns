package org.example.COR;

public class TeamLeadApproval implements PurchaseHandler{
    private PurchaseHandler nextHandler;
    @Override
    public void setNextHandler(PurchaseHandler handler){
        this.nextHandler=handler;
    }
    public void processRequest(PurchaseAmount request){
        if(request.getAmount() <= 1000){
            System.out.println("Your purchase request can be approved by a team lead of amount "+request.getAmount());
        }else if(nextHandler != null){
            nextHandler.processRequest(request);
        }
    }
}
