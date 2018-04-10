package basicStuff;

import java.math.BigDecimal;

/**
 *
 * @author Jackson Trahan
 */
public class Cost {
    BigDecimal cost;
    
    public String getCost() {
        return "$" + cost.toString();
    }
}
