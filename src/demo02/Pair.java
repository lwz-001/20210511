package demo02;

/**
 * @qvthor liuwenzheng
 * @date 2021/5/11 15:20
 */
public class Pair<T> {
    private T first ;
    private T second ;
    //构造方法
    public Pair(){
    }
    public Pair(T first, T second){
        this.first = first;
        this.second = second ;
    }
    //setter & getter
    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
