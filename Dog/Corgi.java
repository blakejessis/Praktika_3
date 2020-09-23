public class Corgi extends Dog {
    String type;
    String color;
    String employment;
    int lifespan;

    String getType(){
        return "Pembroke";
    }

    @Override
    String getHair() {
        return "straight";
    }

    @Override
    int getAge() {
        return 6;
    }

    @Override
    String getCountry() {
        return "UK";
    }

    @Override
    void setCountry() {
        this.country = country;
    }



    @Override
    void setAge(int age) {
        this.age = age;
    }

}
