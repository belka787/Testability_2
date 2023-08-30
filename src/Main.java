public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
//        double stature = 1.87;
//        int weight = 98;
//        int bmi = service.calculate(stature, weight);
//        System.out.println(bmi);

        System.out.println();
        System.out.println("рост: 1.86, вес: 98 ");
        System.out.println("ИМТ: " + service.calculate(1.86, 98));

        System.out.println();
        System.out.println("рост: 1.55, вес: 50 ");
        System.out.println("ИМТ: " + service.calculate(1.55, 50));

        System.out.println();
        System.out.println("рост: 1.8, вес: 80 ");
        System.out.println("ИМТ: " + service.calculate(1.8, 80));
    }
}