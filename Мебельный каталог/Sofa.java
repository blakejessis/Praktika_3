public class Sofa extends Furniture{
    Sofa(int cost, String maker, String material){
        this.cost = cost;
        this.maker = maker;
        this.material = material;
    }
    @Override
    int getCost() {
        return cost;
    }

    @Override
    String getMaker() {
        return maker;
    }

    @Override
    String getMaterial() {
        return material;
    }

    @Override
    void setCost() {
        this.cost = cost;
    }

    @Override
    void setMaker() {
        this.maker = maker;
    }

    @Override
    void setMaterial() {
        this.material = material;
    }
}
