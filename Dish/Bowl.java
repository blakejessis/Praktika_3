public class Bowl extends Dish {
    String color;
    double diameter;
    int size;


    @Override
    String getMaterial() {
        return "steel";
    }

    @Override
    int getCost() {
        return 0;
    }

    @Override
    String getMaker() {
        return "IKEA";
    }

    @Override
    void setMaker() {
        this.maker = maker;
    }

    @Override
    void setMaker(String maker) {

    }
}
