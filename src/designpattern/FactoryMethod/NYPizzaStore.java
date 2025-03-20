// NYPizzaStore.java
package designpattern.FactoryMethod;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        // 다른 피자 타입이 필요한 경우 추가할 수 있습니다.
        return null;
    }
}
