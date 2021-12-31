package Modulo_16.Aula02;

public interface Subject {
    void registerObserver(Observer observer);
    void removerObserver(Observer observer);
    void notifyObserver();
}
