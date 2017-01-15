package ObserverPattern;


/**
 * Created by SkywingWang on 17/1/15.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}
