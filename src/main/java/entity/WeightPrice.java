package entity;

enum Unity{
    POUND, OUNCE
        }
public class WeightPrice extends Price {
    Unity unity;

    public WeightPrice() {
    }

    public WeightPrice(double value, Unity unity) {
        super(value);
        this.unity = unity;
    }

    public Unity getUnity() {
        return unity;
    }
}
