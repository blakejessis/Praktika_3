public class Square extends Rectangle {
    public Square(){
    }

    public Square(double side) {
        setSide(side);
    }

    public Square(double side, String color, boolean filled){
    }

    public double getSide(){
        return width;
    }

    public void setSide(double side){
        this.width = side;
        this.length = side;
    }


    @Override
    public String toString() {
        return "Сторона: " + width;
    }
}
