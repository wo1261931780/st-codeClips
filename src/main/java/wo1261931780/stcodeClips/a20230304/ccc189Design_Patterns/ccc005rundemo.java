package wo1261931780.stcodeClips.a20230304.ccc189Design_Patterns;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220503.ccc189Design_Patterns
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-17-31  星期二
 */
public class ccc005rundemo {
    public static void main(String[] args) {
        ccc001computer x = ccc004factorypattern.creatcomputer("huawei");
        System.out.println(x.getName()+x.getPrice());
    }
}
