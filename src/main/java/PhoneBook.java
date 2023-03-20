import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public Map<String, String> contactsList = new HashMap<>();

    public int add(String name, String phoneNumber) {
        if (!contactsList.containsValue(name)) {
            contactsList.put(name, phoneNumber);
        } else {
            System.out.println("There is already a contact with this name");// Контакт с таким именем уже есть
        }
        if (name == null)
            throw new RuntimeException("The name cannot be null");// Имя не может быть нулевым
        return contactsList.size();
    }

    public String findByNumber(String phoneNumber){
        return null;
    }
}
