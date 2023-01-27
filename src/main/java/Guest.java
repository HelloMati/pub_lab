public class Guest {
    private String name;
    private int age;
    private double money;
    private int soberpoints;
    private boolean banned;
//    private char currency;

    public Guest(String name, int age, double money, int soberpoints, boolean banned){
// char currency
        this.name = name;
        this.age = age;
        this.money = money;
        this.soberpoints = soberpoints;
        this.banned = banned;
 //       this.currency = currency;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMoney() {
        return money;
    }

    public int getSoberpoints() {
        return soberpoints;
    }

    public boolean Banned() {
        return banned;
    }

//    public boolean getCurrency() {
//        return currency;
//    }
}