package ObserverPattern;


/**
 * Created by SkywingWang on 17/1/15.
 */
public interface Subject {
    //这两个方法都需要一个观察者作为变量,该观察者是用来注册或被删除的。
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);

    //当主题状态改变时,这个方法会被调用,以通知所有观察者
    public void notifyObservers();

}
