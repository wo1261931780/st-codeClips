package wo1261931780.stcodeClips.a20230304.ccc189Design_Patterns;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220503.ccc189Design_Patterns
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-17-26  星期二
 */
public class ccc004factorypattern {
    public static ccc001computer creatcomputer(String info) {
        switch (info) {
            case "mac":
                ccc002mac x = new ccc002mac();
                x.setName("mac");
                x.setPrice(11111.11);
                return x;
            case "alienware":
                ccc003Alienware x1 = new ccc003Alienware();
                x1.setName("alienware");
                x1.setPrice(12000.00);
                return x1;
            default:
                return null;
        }
    }
}
