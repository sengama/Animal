public class Main {
    public static void main(String[] args) {
        Animal elefant = new Elefant();
        elefant.mananca();
        elefant.misca();
        elefant.bate();
        elefant.adoarme();
        elefant.suna();
        System.out.println(Animal.numarPicioare());
    }
}