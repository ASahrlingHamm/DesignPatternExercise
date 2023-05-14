import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class BooleanMaker {
    private boolean orderMade = false;
    private boolean garmentDone = false;

    private PropertyChangeSupport propertyChangeSupport;

    public BooleanMaker() {this.propertyChangeSupport = new PropertyChangeSupport(this);}

    public boolean isOrderMade() {
        return orderMade;
    }

    public void setOrderMade(boolean orderMade) {
        boolean oldOrderMade = this.orderMade;
        this.orderMade = orderMade;

        this.propertyChangeSupport.firePropertyChange("Order made", oldOrderMade, this.orderMade);
    }

    public boolean isGarmentDone() {
        return garmentDone;
    }

    public void setGarmentDone(boolean garmentDone) {
        boolean oldGarmentDone = this.garmentDone;
        this.garmentDone = garmentDone;

        this.propertyChangeSupport.firePropertyChange("Garment done", oldGarmentDone, this.garmentDone);
    }


    public void addPropertyChangeListener(PropertyChangeListener listener) {
     this.propertyChangeSupport.addPropertyChangeListener(listener);
    }
}
