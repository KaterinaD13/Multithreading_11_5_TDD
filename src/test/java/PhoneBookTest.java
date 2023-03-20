import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();

    @BeforeEach
    public void testStarted() {
        System.out.println("The beginning of the test");
    }

    @AfterEach
    public void testFinished() {
        System.out.println("End of the test");
    }

    @Test
    public void testAddContact() {
        int expected = phoneBook.add("Misha", "+79851754235");
        expected++;
        Assertions.assertEquals(expected, phoneBook.add("Masha", "+79259754875"));
    }

    @Test
    public void testWhenFirstNameIsNull() {
        Assertions.assertThrows(RuntimeException.class, () -> phoneBook.add(null, "+79871723414"));
    }
}