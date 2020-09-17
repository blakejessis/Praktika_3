public class Fork extends Dish{
    int tine;
    String color;
    String hardness;

    @Override
    String getMaterial() {
        return material;
    }

    @Override
    int getCost() {
        return 500;
    }

    @Override
    String getMaker() {
        return maker;
    }

    @Override
    void setMaker() {
        this.maker = maker;
    }

    @Override
    void setMaker(String maker) {

    }

}
