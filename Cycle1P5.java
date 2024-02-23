class CPU {
    double price;
    class Processor {
        int cores;
        String manufacturer;
            Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }
        void display() {
            System.out.println("Processor Cores: " + cores);
            System.out.println("Processor Manufacturer: " + manufacturer);
        }
    }
    static class RAM {
        double memory;
        String manufacturer;
        RAM(double memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }
        static void display(RAM ram) {
            System.out.println("RAM Memory: " + ram.memory + " GB");
            System.out.println("RAM Manufacturer: " + ram.manufacturer);
        }
    }
    CPU(double price) {
        this.price = price;
    }
    void display() {
        System.out.println("CPU Price: $" + price);
    }
}
public class Cycle1P5 {
    public static void main(String[] args) {
        System.out.println("Akshay Unni M V\n23mca010\ndt:14/02/2024\nCPU");
        CPU myCPU = new CPU(500.00);
        CPU.Processor myProcessor = myCPU.new Processor(4, "Intel");
        CPU.RAM myRAM = new CPU.RAM(8.0, "Kingston");
        System.out.println("CPU Information:");
        myCPU.display();
        System.out.println("\nProcessor Information:");
        myProcessor.display();
        System.out.println("\nRAM Information:");
        CPU.RAM.display(myRAM);
    }
}
