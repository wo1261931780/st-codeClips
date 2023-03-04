package wo1261931780.stcodeClips.a20230304.ccc190Decoration_pattern;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220503.ccc190Decoration_pattern
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-17-41  星期二
 */
public class ccc002fileinputstream extends ccc001inputstream {
    @Override
    public void read() {
        System.out.println("我是file input stream");
    }

    @Override
    public int read(byte[] buffer) {
        buffer[0]=1;
        buffer[1]=1;
        buffer[2]=1;
        System.out.println("我读取了字节数组"+ Arrays.toString(buffer));
        return buffer.length;
    }
}
