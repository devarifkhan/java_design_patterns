import java.util.ArrayList;
import java.util.List;

class NewsChannel implements Subject {
    private List<Observer> observers;
    private String latestNews;

    public NewsChannel() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestNews);
        }
    }

    public void setLatestNews(String news) {
        this.latestNews = news;
        notifyObservers();
    }
}
