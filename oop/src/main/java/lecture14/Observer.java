package lecture14;

import java.util.ArrayList;
import java.util.List;

/*public class ObserverExample {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        NewsChannel channel1 = new NewsChannel("CNN");
        NewsChannel channel2 = new NewsChannel("BBC");
        agency.attach(channel1);
        agency.attach(channel2);
        agency.notify("Breaking News!");
    }
}*/
interface Observer {
    void update(String message);
}

interface Subject {
    void attach(Observer observer);
    void notify(String message);
}

class NewsAgency implements Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notify(String message) {
        for(Observer observer : observers) {
            observer.update(message);
        }
    }
}

class NewsChannel implements Observer {
    private String name;

    public NewsChannel(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

