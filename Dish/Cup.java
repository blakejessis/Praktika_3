public abstract class Cup extends Dish{
    String color;
    protected int size;

    void setSize(int size){
        size = 200;
    }

    @Override
    String getMaterial() {
        return material;
    }

    @Override
    int getCost() {
        return cost;
    }

    @Override
    String getMaker() {
        return "Производитель неизвестен";
    }


    @Override
    void setMaker() {
      this.maker = maker;
    }
}
