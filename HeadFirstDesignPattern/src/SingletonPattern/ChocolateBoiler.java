package SingletonPattern;

/**
 * Created by SkywingWang on 17/2/2.
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateBoiler uniqueChocolateBoiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstantce() {
        if (uniqueChocolateBoiler == null) {
            synchronized (ChocolateBoiler.class) {
                if (uniqueChocolateBoiler == null) {
                    uniqueChocolateBoiler = new ChocolateBoiler();
                }
            }
        }
        return uniqueChocolateBoiler;

    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;

            //在锅内填满巧克力和牛奶的混合物
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            //排出煮沸的巧克力和牛奶
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            //将炉内物煮沸
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
