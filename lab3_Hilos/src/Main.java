import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> urls = new ArrayList<>();
        urls.add("https://www.example1.com");
        urls.add("https://www.example2.com");
        urls.add("https://www.example3.com");

        WebToPdfConverter.convertUrlsToPdf(urls);
    }
}
