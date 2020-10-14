import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public abstract class customer extends PropertyChangeSupport implements PropertyChangeListener{
    public customer (bean sourcebean) {
        super(sourcebean);
    }

    public String type;
    public void arrive () {
        System.out.println("A " + type + " customer has arrived!");
    }
    public void leave () {
        System.out.println("A " + type + " customer has left!");
    }

    public void propertyChange(PropertyChangeEvent event) { //whenever event changes, zoo announcer announces.
        if (event.getNewValue() == "closed") {
            leave();
        }
    }
}
