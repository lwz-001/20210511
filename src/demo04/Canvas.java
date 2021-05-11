package demo04;

import java.util.ArrayList;
import java.util.List;

/**
 * @qvthor liuwenzheng
 * @date 2021/5/11 16:03
 */
public class Canvas {
    // 在画布上画的一个
    public void draw(Shape shape){
        shape.xingzhuang();
    }
    // 在画布上画多个
    public void drawAll(List< ? extends Shape >shapeList){
        for (Shape s : shapeList){
            s.xingzhuang();
        }
    }
    public void drawAll(ArrayList<Shape> list) {
    }
}
