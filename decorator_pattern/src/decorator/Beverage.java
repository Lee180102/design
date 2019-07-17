package decorator;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 *
 */
public abstract class Beverage {
    private  String description;


    public String getDescription() {
        return description;
    }


    abstract Double cost();
}
