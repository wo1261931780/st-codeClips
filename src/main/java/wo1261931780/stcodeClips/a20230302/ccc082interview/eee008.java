package wo1261931780.stcodeClips.a20230302.ccc082interview;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220302.ccc082interview
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-09-30  星期五
 */
public class eee008 {
    public static void main(String[] args) {
        int[] x = {3, 6, 9, 1, 2, 6};
        // System.out.println(show1(x));
        show2(998);

    }

    public static int show1(int[] x) {
        // 1.元素个数
        // 2.股票价格
        // 3.盈利计算
        // 4.手续费计算
        // 5.返回结果

        if (x.length > 2) {
            int profit = 0;
            for (int i = 0; i < x.length - 1; ) {

                for (int j = i + 1; j < x.length - 1; j++) {
                    int start = x[i];
                    int end = x[j];
                    if (end > x[j + 1]) {
                        profit += end - start - 1;
                        i = j + 1;
                    } else if (j == x.length - 2) {
                        profit += x[j + 1] - start - 1;
                        return profit;
                    }
                }
            }
            return profit;
        }
        return 0;
    }

    public static int show2(int x) {
        x = Math.abs(x);// 绝对值
        if (x < 89) {
            x = 89;
        }
        String x1 = x + "";
        int sum = 0;
        do {
            for (int i = 0; i < x1.length(); i++) {
                sum += x1.charAt(i) - '0';
            }
            // if () {
            //     return sum;
            // }else{
            //     show2(sum);
            // }
        } while (sum > 10);
        return sum;
    }

    public static int show3(int x) {
        x = Math.abs(x);
        int num = 0;
        for (int i = 0; i < x; i++) {
            String x1 = i + "";
            for (int j = 0; j < x1.length(); j++) {
                if (x1.charAt(j) == '0') {
                    num++;
                }
            }
        }
        return num;
    }

}
