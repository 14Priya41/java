class Dog {
    String name;
    int age;
    void eat()
    {
        System.out.println("the dog is eating");
    }
    public static void main(String args[])
    {
       Dog dog1=new Dog();
       Dog dog2=new Dog();
       Dog dog3=new Dog();
       dog1.eat();
       dog2.eat();
       dog3.eat();
    }
}
