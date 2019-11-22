/**
 * @author ellen
 * @date 2019-11-22 21:24
 * @description：分割平衡字符串——LeetCode.1221
 *      在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
 *      给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 *      返回可以通过分割得到的平衡字符串的最大数量。
 *      示例 1：
 * 输入：s = "RLRRLLRLRL"
 * 输出：4
 * 解释：s 可以分割为 "RL", "RRLL", "RL", "RL", 每个子字符串中都包含相同数量的 'L' 和 'R'。
 *      示例 2：
 * 输入：s = "RLLLLRRRLR"
 * 输出：3
 * 解释：s 可以分割为 "RL", "LLLRRR", "LR", 每个子字符串中都包含相同数量的 'L' 和 'R'。
 *      示例 3：
 * 输入：s = "LLLLRRRR"
 * 输出：1
 * 解释：s 只能保持原样 "LLLLRRRR".
 */
public class BalancedStringSplit {
    public static void main(String[] args) {
//        System.out.println(balancedStringSplit("RLRRLLRLRL"));
        System.out.println(balancedStringSplit("RLLLLRRRLR"));
//        System.out.println(balancedStringSplit("LLLLRRRR"));
    }

    /**
     *
     * @param s
     * @return：返回能够分割为平衡字符串的个数
     */
    public static int balancedStringSplit(String s) {
        int count = 0;
        char[] arr = s.toCharArray();
        int i = 0;
        int l = 0;
        int r = 0;
        while(i < arr.length){
            // while(i++ < arr.length)//写法是错误的，i++后i为1，所以后期不会计算arr[0]的值
            if(arr[i] == 'R'){
                r++;
            }else if(arr[i] == 'L'){
                l++;
            }
            if(r == l){
                count++;
            }
            i++;
        }
        return count;
    }
}
