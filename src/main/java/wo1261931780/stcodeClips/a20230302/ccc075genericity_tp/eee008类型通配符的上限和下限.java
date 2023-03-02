package wo1261931780.stcodeClips.a20230302.ccc075genericity_tp;

import java.util.ArrayList;
import java.util.List;

/**
 * 类型通配符：<?>
 * List<?>：表示元素类型未知的List，它的元素可以匹配任何的类型
 * 这种带通配符的List仅表示它是各种泛型List的父类，并不能把元素添加到其中
 * ------------------------------------------------------------
 * 类型通配符上限：<? extends 类型>
 * List<? extends Number>：它表示的类型是Number或者其子类型
 * 这里，
 * extends number表示数据只能是number和number的子类
 * ------------------------------------------------------------
 * 类型通配符下限：<? super 类型>
 * List<? super Number>：它表示的类型是Number或者其父类型
 * 解释一下吧，
 * super number表示数据只能是number和number的父类，
 * 相当于设置了一个数据的下限
 */
public class eee008类型通配符的上限和下限 {
    public static void main(String[] args) {
        List<?> x = new ArrayList<>();
        List<? extends Number> x1 = new ArrayList<Integer>();
        // x1.add(1);
        List<? super Number> x2 = new ArrayList<>();
        // x2.add("aa");

    }

}
