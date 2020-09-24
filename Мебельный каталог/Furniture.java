public abstract class Furniture {
    protected int cost;
    protected String maker;
    protected String material;

    abstract int getCost();
    abstract String getMaker();
    abstract String getMaterial();

    abstract void setCost();
    abstract void setMaker();
    abstract void setMaterial();

}
