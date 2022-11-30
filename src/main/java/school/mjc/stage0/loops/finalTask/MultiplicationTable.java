package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint) { // 1-misol
        if (numberTableToPrint >= 0) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " x " + numberTableToPrint + " = " + i * numberTableToPrint);
            }
        } else {
            System.out.println("Number Table To Print musbat son kiriting");
        }
    }

    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.printTable(5);
    }
}
