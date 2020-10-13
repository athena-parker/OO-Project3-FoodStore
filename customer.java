import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public abstract class customer extends PropertyChangeSupport implements PropertyChangeListener{
    public customer (bean sourcebean) {
        super(sourcebean);
    }

    public String type;
    public void setType(String customerType) {
        type = customerType;
    }
    public void arrive () {}
    public void leave () {}
    public void buyRolls () {}
    public void rollsOut () {}

    public void propertyChange(PropertyChangeEvent event) { //whenever event changes, zoo announcer announces.
        if (event.getOldValue() != event.getNewValue()) {
            leave();
        }
    }
}
