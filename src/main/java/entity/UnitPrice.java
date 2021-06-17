package entity;

enum Discount {
    NONE, THREE_FOR_ONE_DOLLAR, TWO_FOR_THREE
}
public class UnitPrice extends Price {
    Discount discount;

    public UnitPrice() {
    }

    public UnitPrice(double value, Discount discount) {
        super(value);
        this.discount = discount;
    }

    public Discount getDiscount() {
        return discount;
    }
}
