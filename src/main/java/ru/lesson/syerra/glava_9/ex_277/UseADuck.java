package syerraBeyts.glava_9.ex_277;

/**
 * @autor irinaff
 * @since 27.01.2017
 **/

public class UseADuck {
    public static void main(String [] args) {
        int weight = 8;
        float density = 2.3F;
        String name = "Дональд";
        long[] features = {1,2,3,4,5,6};
        boolean canFly = true;
        int airspeed = 22;
        Duck[] d = new Duck[7];
        d[0] = new Duck();
        d[1] = new Duck(density, weight);
        d[2] = new Duck(name, features);
        d[3] = new Duck(canFly);
        d[4] = new Duck(3.3F, airspeed);
        d[5] = new Duck(false);
        d[6] = new Duck(airspeed,density);
    }
}
