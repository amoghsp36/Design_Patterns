package org.example.COR;

public class Main {
    public static void main(String[] args) {
        PurchaseHandler employee = new ChainOfResponsibility();
        PurchaseHandler teamLead = new TeamLeadApproval();
        PurchaseHandler manager = new ManagerApproval();
        PurchaseHandler director = new DirectorApproval();

        employee.setNextHandler(teamLead);
        teamLead.setNextHandler(manager);
        manager.setNextHandler(director);

        PurchaseAmount req1 = new PurchaseAmount(20);
        PurchaseAmount req2 = new PurchaseAmount(1000);
        PurchaseAmount req3 = new PurchaseAmount(1500);
        PurchaseAmount req4 = new PurchaseAmount(8000);

        employee.processRequest(req1);
        employee.processRequest(req2);
        employee.processRequest(req3);
        employee.processRequest(req4);
    }
}
