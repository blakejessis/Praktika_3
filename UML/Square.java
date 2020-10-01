public class Square extends Rectangle {
    private double side;
    public Square(){
    }

    public Square(double side) {
        setSide(side);
    }

    public Square(double side, String color, boolean filled){
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double length) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
