package demo04;

import java.awt.*;
import java.util.ArrayList;

/**
 * @qvthor liuwenzheng
 * @date 2021/5/11 16:06
 */
public class Demo04 {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        Circle circle =new Circle();
        canvas.draw(circle);

        //定义多个形状，组成一个数组列表，传入
        Circle circle1 =new Circle();
        Rectabgle rectabgle = new Rectabgle();
        Rectabgle rectabgle1 = new Rectabgle();

//        Rectabgle rectangle =new Rectangle();
//        Rectabgle rectangle1 = new Rectangle();
        Circle circle2 =new Circle();
        //准备一个集合
        ArrayList<Shape>list = new ArrayList<>();
        list.add(circle);
        list.add(circle1);
        list.add(circle2);
        list.add(rectabgle);
        list.add(rectabgle1);
        canvas.drawAll(list);
    }
}
