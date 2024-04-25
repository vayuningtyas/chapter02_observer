import java.util.ArrayList;
import java.util.List;

// Interface Observer2
interface Observer2 {
    void update(String message);
}

// Subject (Observable)
class Subject {
    private List<Observer2> observers = new ArrayList<>();

    // Method untuk menambahkan Observer
    public void attach(Observer2 observer) {
        observers.add(observer);
    }

    // Method untuk menghapus Observer
    public void detach(Observer2 observer) {
        observers.remove(observer);
    }

    // Method untuk memberitahu Observer tentang perubahan
    public void notifyObservers(String message) {
        for (Observer2 observer : observers) {
            observer.update(message);
        }
    }

    // Metode yang akan membuat perubahan dan memberi tahu Observer
    public void doSomething() {
        // Lakukan sesuatu yang akan memicu notifikasi ke Observer
        notifyObservers("Ada sesuatu yang terjadi!");
    }
}

// Concrete Observer
class ConcreteObserver implements Observer2 {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " menerima pesan: " + message);
    }
}



