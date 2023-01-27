import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ServerTest {
    Server server;
    Guest guestUnder18;
    Guest guestOver18;

        @BeforeEach
        public void setUp(){
            server = new Server();
//            server.addDrink("coke");
//            server.addDrink("pepsi");
//            server.addDrink("sprite");
        }

// TODO: test that guest can only get served if over 18

    @Test
    public void testChecksGuestIsOver18_age(){
        guestUnder18 = new Guest("Jean", 17, 5.00, 50, false);
        guestOver18 = new Guest("Wayne", 18, 5.00, 50, false);

            assertThat(server.canServeGuest(guestUnder18)).isEqualTo(false);
            assertThat(server.canServeGuest(guestOver18)).isEqualTo(true);
        }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)

    @Test
    public void testChecksGuestHasEnoughMoneyToBuyDrink(){
        Guest notEnoughMoney = new Guest("notEnoughMoney", 18, 4.99, 50, false);
        Guest enoughMoney = new Guest("enoughMoney", 18, 5.00, 50, false);

        assertThat(server.canServeGuest(notEnoughMoney)).isEqualTo(false);
        assertThat(server.canServeGuest(enoughMoney)).isEqualTo(true);
    }

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)
    @Test
    public void testChecksGuestSoberEnough(){
        Guest notSoberEnough = new Guest("notSoberEnough", 18, 5.00, 49, false);
        Guest SoberEnough = new Guest("SoberEnough", 18, 5.00, 50, false);

        assertThat(server.canServeGuest(notSoberEnough)).isEqualTo(false);
        assertThat(server.canServeGuest(SoberEnough)).isEqualTo(true);
    }

    // TODO: test that guest can only get served if guest is not banned from the pub
    @Test
    public void testGuestNotBanned(){
        Guest notBanned = new Guest("notBanned", 18, 5.00, 50, false);
        Guest banned = new Guest("banned", 18, 5.00, 50, true);

        assertThat(server.canServeGuest(notBanned)).isEqualTo(true);
        assertThat(server.canServeGuest(banned)).isEqualTo(false);
    }

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

//    @Test
//    public void testGuestCanPayInLocalCurrency(){
//        Guest guestWithLocalCurrency = new Guest("guestWithLocalCurrency", 18, 5.00, 50, false, '£');
//        Guest guestWithoutLocalCurrency = new Guest("guestWithoutLocalCurrency", 18, 5.00, 50, false, '$');
//
//        assertThat(server.canServeGuest(guestWithLocalCurrency)).isTrue();
//        assertThat(server.canServeGuest(guestWithoutLocalCurrency)).isFalse();
//    }


    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    @Test
    public void testChecksServerCanMakeFavDrink(){
        Guest CannotMakeFavDrink = new Guest("CannotMakeFavDrink", 18, 5.00, 49, false);
        Guest MakesFavDrink = new Guest("MakesFavDrink", 18, 5.00, 50, false);

        assertThat(server.canServeGuest(CannotMakeFavDrink)).isEqualTo(false);
        assertThat(server.canServeGuest(MakesFavDrink)).isEqualTo(true);
    }

    //  (give server a list of drinks (strings) it can make)

//        @Test
//        public void testServerCanMakeDrink() {
//            assertThat(server.canMakeDrink("coke")).isEqualTo(true);
//            assertThat(server.canMakeDrink("pepsi")).isEqualTo(true);
//            assertThat(server.canMakeDrink("sprite")).isEqualTo(true);
//            assertThat(server.canMakeDrink("7up")).isEqualTo(false);
//        }
    }