package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        System.out.println(first>=second&&first>=third?first: second>=third&&second>=first?second:third);
    }
}
