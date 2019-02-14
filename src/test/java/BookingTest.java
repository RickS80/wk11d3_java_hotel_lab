import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;

    @Before

    public void before(){
        bedroom = new Bedroom(17, "Suite", 4, 155.50);
        booking = new Booking (bedroom, 3);
    }

    @Test
    public void testHotelBill(){
        assertEquals(466.50, booking.getBill(), 0.01);
    }


}
