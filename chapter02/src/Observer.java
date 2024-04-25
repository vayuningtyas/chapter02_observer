import java.util.Vector;

interface Observer {
    public void receiveNotification(String msg);
}

interface Observable {
    public void addSubscriber(User user);
    public void removeSubscriber(User user);
    public void notifyUser(String msg);
}
class User implements Observer {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void receiveNotification(String msg) {
        System.out.println(msg);
    }

    public void subscribe(Channel channel) {
        channel.addSubscriber(this);
    }

    public void unsubscribe(Channel channel) {
        channel.removeSubscriber(this);
    }

    public String getName() {
        return name;
    }
}

class Channel implements Observable {
    private String name;
    private Vector<User> subscibers;

    public Channel(String name) {
        this.name = name;
        this.subscibers = new Vector<User>();
    }

    @Override
    public void addSubscriber(User user) {
        subscibers.add(user);
    }

    @Override
    public void removeSubscriber(User user) {
        subscibers.remove(user);
    }

    @Override
    public void notifyUser(String msg) {
        System.out.println(name + " posted a new video!");
        String constructedMessage = String.format("%s: %s", name, msg);
        for(User user : subscibers) {
            user.receiveNotification(constructedMessage);
        }
    }
}
