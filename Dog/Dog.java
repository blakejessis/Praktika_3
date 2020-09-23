public abstract class Dog {
    public String hair;
    int age;
    String country;

    abstract String getHair();
    abstract int getAge();

    abstract String getCountry();
    abstract void setCountry();


    abstract void setAge(int age);
}
