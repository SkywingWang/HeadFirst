package TemplatePattern;

/**
 * Created by SkywingWang on 17/2/12.
 */
public class Duck implements Comparable {
    String name;
    int weight;
    public Duck(String name,int weight){
        this.name = name;
        this.weight = weight;
    }
    public String toString(){
        return name + " weights " + weight;
    }

    @Override
    public int compareTo(java.lang.Object o) {
        Duck otherDuck = (Duck) o;
        if(this.weight < otherDuck.weight){
            return -1;
        }else if(this.weight == otherDuck.weight){
            return 0;
        }else {
            return 1;
        }
    }
}
