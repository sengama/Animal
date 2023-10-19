public interface Animal {
    void mananca();
    void misca();
    void bate();
    void adoarme();
    default void suna() {
        System.out.println("Animalul face un sunet.");
    }

    static int numarPicioare() {
        return 4;
    }
}
