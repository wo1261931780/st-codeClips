package wo1261931780.stcodeClips.a20230304.ccc189Design_Patterns;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220503.ccc189Design_Patterns
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-17-11  星期二
 */
public abstract class ccc001computer {
    private String name;
    private double price;

    public ccc001computer() {
    }

    public abstract void wakeup();


    @Override
    public String toString() {
        return "ddd050做数组拷贝{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public ccc001computer(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
