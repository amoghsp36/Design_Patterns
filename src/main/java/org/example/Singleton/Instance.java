package org.example.Singleton;

public class Instance {
    private static Instance instance;
    private Instance(){

    }
    public static Instance getInstance(){
        if(instance == null){
            instance =new Instance();
        }
        return instance;
    }
    public void Operation(){
        System.out.println("Performing operation");
    }

    public static void main(String[] args) {
        Instance instance1 = Instance.getInstance();
        Instance instance2 = Instance.getInstance();
        System.out.println(instance1.equals(instance2));
        instance1.Operation();


    }
}
