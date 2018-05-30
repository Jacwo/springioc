import com.flashhold.springioc.Car;
import com.flashhold.springioc.Wheel;

public class Main {

    public static void main(String[] args) {
        String location = SimpleIOC.class.getClassLoader().getResource("ioc.xml").getFile();
        SimpleIOC bf = null;
        try {
            bf = new SimpleIOC(location);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel);
        Car car = (Car) bf.getBean("car");
        System.out.println(car);
    }
}
