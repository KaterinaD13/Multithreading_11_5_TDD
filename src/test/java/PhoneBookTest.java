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

    @Test
    public void testFindByNumber() {
        phoneBook.add("Misha", "+79851754235");
        String expected = "Misha";
        String numberValue = "+79851754235";
        Assertions.assertEquals(expected, phoneBook.findByNumber(numberValue));
    }

    @Test
    public void testFindByName() {
        phoneBook.add("Misha", "+79851754235");
        phoneBook.add("Masha", "+79259754875");
        phoneBook.add("Petia", "+78159032465");
        String expected = "+79259754875";
        String nameValue = "Masha";
        Assertions.assertEquals(expected, phoneBook.findByName(nameValue));
    }
}