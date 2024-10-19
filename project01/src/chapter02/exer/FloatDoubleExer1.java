package chapter02.exer;

/*
 * 小明要到美国旅游，可是那里的温度是以华氏度为单位记录的。
 * 它需要一个程序将华氏温度(80度)转换为摄氏度，并以华氏度和摄氏度为单位分别显示该温度
 * ℃=(℉-32)/1.8
 */
public class FloatDoubleExer1 {
    public static void main(String[] args) {
        //定义华氏温度
        double hua = 80.0;

        //使用公式计算
        double she = (hua - 32) / 1.8;

        //输出结果
        System.out.println("华氏度为" + hua + "转换为摄氏度为"+ she);
    }
}
