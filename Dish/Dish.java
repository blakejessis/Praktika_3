public abstract class Dish {
    public String material;
    public int cost;
    public String maker;

    abstract String getMaterial();
    abstract int getCost();

    abstract String getMaker();
    abstract void setMaker();

    abstract void setMaker(String maker);
}
