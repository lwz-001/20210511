package demo02;

/**
 * @qvthor liuwenzheng
 * @date 2021/5/11 15:23
 */
public class Demo02 {
    public static void main(String[] args) {
        Pair<Integer> pair1 = new Pair<>(1, 2);
        System.out.println(pair1);

        Pair<Double> pair2 = new Pair<>(1.1, 2.2);
        System.out.println(pair2);

        Pair<String> pair3 = new Pair<>("haha", "hehe");
        System.out.println(pair3);
    }
}
