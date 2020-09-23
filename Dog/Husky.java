public class Husky extends Dog {
    String color;
    protected String employment;
    public String eyecolor;
    double weight;

    @Override
    String getHair() {
        return "long";
    }

    @Override
    int getAge() {
        return 2;
    }

    @Override
    String getCountry() {
        return "Russia";
    }

    @Override
    void setCountry() {
        this.country = country;
    }

    @Override
    void setAge(int age) {

    }

}
