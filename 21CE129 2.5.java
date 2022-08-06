public class Prac2_5 {
    void average(int a, int b){
        float avg;
        avg=(a+b)/2;
        System.out.println("The average of the numbers is :"+avg);
    }
    void average(float a,float b){
        float avg;
        avg=(a+b)/2;
        System.out.println("The average of the numbers is :"+avg);
    }
    void average(Double a,Double b){
        double avg;
        avg=(a+b)/2;
        System.out.println("The average of the numbers is :"+avg);
    }
    public static void main(String[] args) {
        Prac2_5 p1=new Prac2_5();
        p1.average(2, 5);
        p1.average(2.5, 3.5);
        p1.average(2.55D, 3.664D);
    }
}
