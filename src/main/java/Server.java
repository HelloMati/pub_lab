import java.util.ArrayList;

public class Server {
//    private ArrayList<String> drinks;
//
//    public Server(){
//        this.drinks = new ArrayList<>();
//    }
//
//    public void addDrink(String drink) {
//        this.drinks.add(drink);
//    }
//
//    public boolean canMakeDrink(String drink) {
//        if (!this.drinks.contains(drink)) {
//            return false;
//        }

    public boolean canServeGuest(Guest guest){
        if (guest.getAge() < 18) {
            return false;
        }

        if (guest.getMoney() < 5.00){
            return false;
        }

        if (guest.getSoberpoints() < 50){
            return false;
        }

        if (guest.Banned()){
            return false;
        }

//        if (guest.getCurrency()){
//            return false;
//        }

        return true;
    }
}
