import java.util.HashMap;
import java.util.Map;

class Document {
    private final Map<String, String> fields;

    public Document() {
        fields = new HashMap<>();
    }

    public void setTitle(String title) {
    }

    public void addField(String key, String value) {
        fields.put(key, value);
    }

    // Другие геттеры и сеттеры для полей (если нужно)
}
