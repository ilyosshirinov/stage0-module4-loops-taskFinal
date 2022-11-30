package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) { //3-misol
        int sum = 1;
        for (int i = 0; i < power; i++) {
            sum *= numberToPrint;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        new Power().printPower(-10, 3);
    }
}
