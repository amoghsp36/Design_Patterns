package org.example.COR;

import lombok.Data;

@Data
public class ChainOfResponsibility implements PurchaseHandler{
    private PurchaseHandler nextHandler;
    //private PurchaseAmount amount;
    @Override
    public void setNextHandler(PurchaseHandler handler){
        this.nextHandler=handler;
    }
    @Override
    public void processRequest(PurchaseAmount request){
        if(request.getAmount() <= 100){
            System.out.println("Employee can approve purchase of "+ request.getAmount());
        } else if (nextHandler!=null) {
            nextHandler.processRequest(request);
        }
    }
}
