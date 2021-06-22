public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        //демонстрация
        System.out.println("В результате операции сложения получится: " +
                bins.sum("01000", "01111"));
        System.out.println("В результате операции умножения получится: " +
                bins.mult("01000", "01111"));
    }
}
