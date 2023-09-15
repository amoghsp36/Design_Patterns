package org.example.Singleton;

public class PrinterDeviceDriver implements DeviceDrivers{
    private static PrinterDeviceDriver printerDriver;
    private PrinterDeviceDriver(){     //private constructor so that the instance cant be instantiated from outside

    }
    private static PrinterDeviceDriver getPrinterDriver(){
        if(printerDriver == null){
            printerDriver = new PrinterDeviceDriver();
        }
        return printerDriver;
    }
    @Override
    public void initiate(){
        System.out.println("Initiating printer driver");
    }
    @Override
    public void readData(){
        System.out.println("reading data from driver");
    }
    @Override
    public void writeData(){
        System.out.println("writing data to driver");
    }

    @Override
    public void close() {
        System.out.println("closing driver");
    }

    public static void main(String[] args) {
        PrinterDeviceDriver printerDeviceDriver = PrinterDeviceDriver.getPrinterDriver();
        printerDeviceDriver.initiate();
        printerDeviceDriver.readData();
        printerDeviceDriver.writeData();
        printerDeviceDriver.close();
    }
}
