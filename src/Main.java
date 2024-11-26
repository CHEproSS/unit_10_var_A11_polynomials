public class Main {
    public static void main(String[] args) {
        Polynomial pol1 = new Polynomial();
        pol1.addTerm(2, 3);
        pol1.addTerm(1, 2);
        pol1.addTerm(0, 1);

        pol1.output();

        Polynomial pol2 = new Polynomial();
        pol2.addTerm(2, 1);
        pol2.addTerm(1, -2);
        pol2.addTerm(0, 4);

        pol2.output();

        Polynomial result = pol1.add(pol2);

        System.out.println("Result:");
        result.output();

    }
}