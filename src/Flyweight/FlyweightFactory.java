package Flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<Integer, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(int flyweightNumber) {
        Flyweight flyweight = flyweights.get(flyweightNumber);

        if (flyweight == null){
            if (flyweightNumber == 1){
                flyweight = new ConcreteFlyweight1();
            }
            else if (flyweightNumber == 2){
                flyweight = new ConcreteFlyweight2();
            }
            flyweights.put(flyweightNumber, flyweight);
        }

        return flyweight;
    }
}
