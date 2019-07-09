package observer.observerOrder.order;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import observer.observerOrder.notification.Observer;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
public class Order implements Observable {
    private Long OrderNumber;
    private OrderStatus orderStatus;
    private Set<Observer> registeredObservers = new HashSet<>();

    public Order(Long orderNumber, OrderStatus orderStatus) {
        OrderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    public void changeOrderStatus(OrderStatus orderStatus) {
        setOrderStatus(orderStatus);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        registeredObservers.stream().forEach(
                observer -> observer.changeOrderStatus(this)
        );
    }
}
