package chapter03;

/*
 * 岳小鹏参加Java考试，他和父亲岳不群达成承诺：
 * 如果：
 * 成绩为100分时，奖励一辆跑车
 * 成绩为(80, 99]时，奖励一辆山地自行车
 * 成绩为[60, 80]时，奖励环球影城一日游
 * 其他胖揍一顿
 */
public class IfElseTest1 {
    public static void main(String[] args) {
        int score = 59;

        if(score == 100) {
            System.out.println("奖励一辆跑车");
        } else if (score > 80) {
            System.out.println("奖励一辆山地自行车");
        } else if(score >= 60) {
            System.out.println("奖励环球影城一日游");
        } else {
            System.out.println("胖揍一顿");
        }
    }
}
