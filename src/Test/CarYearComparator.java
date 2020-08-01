package Test;
import java.util.Comparator;

/**
 * @project Test
 * @user: tosipova
 **/

public class CarYearComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        Integer year1 = Integer.valueOf(o1.getYear());
        Integer year2 = Integer.valueOf(o2.getYear());
        return year1.compareTo(year2);
    }
}


