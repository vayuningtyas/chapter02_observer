public class Main {
    public static void main(String[] args) {
        Channel ch = new Channel("Vidya ayu ningtyas Channel");
        User user1 = new User("Wika Wika");
        User user2 = new User("Jobot TV");
        User user3 = new User("Jinjit Karunia");

        ch.addSubscriber(user1);
        ch.addSubscriber(user2);
        ch.notifyUser("Ada video baru buat anda! Jangan lupa di subscribe ya!");

        user3.subscribe(ch);
        ch.notifyUser("Video baru!");


        System.out.println("\n");
// Membuat subjek (Subject)
        Subject subject = new Subject();

        // Membuat observer (Observer2)
        ConcreteObserver observer1 = new ConcreteObserver("Pesan 1");
        ConcreteObserver observer2 = new ConcreteObserver("pesan 2");

        // Menambahkan observer ke subjek
        subject.attach(observer1);
        subject.attach(observer2);

        // Melakukan sesuatu yang akan memicu notifikasi ke Observer
        subject.doSomething();

        // Menghapus salah satu observer
        subject.detach(observer1);

        // Melakukan sesuatu lagi setelah menghapus observer
        subject.doSomething();
            }
        }

        

