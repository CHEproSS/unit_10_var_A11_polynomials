import java.util.HashMap;

public class Polynomial {
    private HashMap<Integer,Integer> terms;

    public Polynomial(){
        this.terms = new HashMap<>();
    }

    public void addTerm(int degree, int coefficient){
        if (degree < 0) {
            throw new IllegalArgumentException("Degree cannot be negative.");
        }

        this.terms.put(degree, this.terms.getOrDefault(degree,0) + coefficient);
    }

    public Polynomial add(Polynomial other){
        Polynomial result = new Polynomial();

        for(int degree : this.terms.keySet()) {
            result.addTerm(degree, this.terms.get(degree));
        }

        for(int degree:other.terms.keySet()){
            result.addTerm(degree,other.terms.get(degree));
        }

        return result;
    }

    public void output() {
        for (int degree : terms.keySet()) {
            System.out.print(terms.get(degree) + "x^" + degree + " + ");
        }
        System.out.println("0");
    }
}