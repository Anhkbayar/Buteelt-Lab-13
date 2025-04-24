package AndrewWebServices;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AndrewWebServicesTest {
    // Database database;
    InMemoryDatabase database;
    RecSys recommender;
    PromoService promoService;
    AndrewWebServices andrewWebService;

    // @Before
    // public void setUp() {
    //     // You need to use some mock objects here
    //     database = new Database(); // We probably don't want to access our real database...
    //     recommender = new RecSys();
    //     promoService = new PromoService();

    //     andrewWebService = new AndrewWebServices(database, recommender, promoService);
    // }

    @Before
    public void setUp(){
        // database = mock(InMemoryDatabase.class);
        database = new InMemoryDatabase();
        recommender = mock(RecSys.class);
        promoService = mock(PromoService.class);

        andrewWebService = new AndrewWebServices(database, recommender, promoService);
    }

    @Test
    public void testLogIn() {
        // This is taking way too long to test
        //Say no more
        assertTrue(andrewWebService.logIn("Scotty", 17214));
    }

    @Test
    public void testGetRecommendation() {
        // This is taking way too long to test
        //solved it
        when(recommender.getRecommendation("Scotty")).thenReturn("Animal House");

        assertEquals("Animal House", andrewWebService.getRecommendation("Scotty"));
    }

    @Test
    public void testSendEmail() {
        // How should we test sendEmail() when it doesn't have a return value?
        // Hint: is there something from Mockito that seems useful here?
    }

    @Test
    public void testNoSendEmail() {
        // How should we test that no email has been sent in certain situations (like right after logging in)?
        // Hint: is there something from Mockito that seems useful here?
    }
}
