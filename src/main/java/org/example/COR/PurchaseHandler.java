package org.example.COR;

//define a common interface for all handlers
public interface PurchaseHandler {
    void setNextHandler(PurchaseHandler handler);
    void processRequest(PurchaseAmount request);
}
