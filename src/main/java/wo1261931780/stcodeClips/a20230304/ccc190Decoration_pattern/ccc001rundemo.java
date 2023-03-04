package wo1261931780.stcodeClips.a20230304.ccc190Decoration_pattern;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220503.ccc190Decoration_pattern
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-17-39  星期二
 */
public class ccc001rundemo {
    public static void main(String[] args) {
        ccc001inputstream x = new ccc003bufferfileinputstream(new ccc002fileinputstream());
        // 多态的方式构造，类型1的对象=装饰类的对象+类型2的对象
        x.read();
        x.read(new byte[3]);
        // 结果：
        // 我是装饰类
        // 我读取了字节数组[1, 1, 1]
        // 最终还是调用了类型2的方法，但是因为外面有一个装饰类的包装
        // 导致我的语句会先展示装饰类的功能，然后再去使用原来的功能

    }
}
