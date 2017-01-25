package ObserverPattern;

/**
 * Created by SkywingWang on 17/1/15.
 */
public interface Observer {
    //所有观察者都必须实现update()方法,以实现观察者接口。
    //当气象观测值改变时,主题会把这些状态值当作方法参数,传送给观察者
    public void update(float temp, float humidity, float pressure);
}
