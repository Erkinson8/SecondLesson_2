import java.util.Random;

public class Main {
    public static void main(String[] args) {
        test(20, 25);
        test(31, 21);
        test(15, -26);
        test(25, 31);
        test(45, 35);
        System.out.println();
        System.out.println("Рандомный возраст " + generateRandomAge() + " " + human(generateRandomAge(), 21));
    }
    public static String human(int age, double temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайся дома";
        }
    }
    public static int generateRandomAge(){
        int generate = (int) (Math.random()*80)+1;
        return generate;
    }
    public static void test(int age, double temp){
        String result = human(age, temp);
        System.out.println("Возраст " + age + " Температура " + temp + " = " + result);
    }
}
