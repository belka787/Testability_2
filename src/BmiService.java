public class BmiService {
    public int calculate (double stature, int weight){
        return (int) (weight / (Math.pow(stature, 2)));
    }
}
