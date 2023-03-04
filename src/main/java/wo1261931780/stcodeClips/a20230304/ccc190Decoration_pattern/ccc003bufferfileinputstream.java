package wo1261931780.stcodeClips.a20230304.ccc190Decoration_pattern;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220503.ccc190Decoration_pattern
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-18-18  星期二
 */
public class ccc003bufferfileinputstream extends ccc001inputstream {
    private ccc001inputstream demo;

    // 新建一个带有父类对象的构造器
    public ccc003bufferfileinputstream(ccc001inputstream demo) {
        this.demo = demo;
    }

    @Override
    public void read() {
        System.out.println("我是装饰类");

    }

    @Override
    public int read(byte[] buffer) {
        System.out.println("我是装饰类");
        return demo.read(buffer);
    }
}
