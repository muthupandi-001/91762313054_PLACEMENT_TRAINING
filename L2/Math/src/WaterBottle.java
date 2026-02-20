public class WaterBottle  {
    public int numWaterBottles(int bottles, int exchange) {
        int total = bottles;
        while (bottles >= exchange) {
            int newBottles = bottles / exchange;
            total += newBottles;
            bottles = newBottles + (bottles % exchange);
        }

        return total;
    }

    public static void main(String[] args) {
        WaterBottle waterBottle = new WaterBottle();
        System.out.println(waterBottle.numWaterBottles(9, 3));
    }
}

