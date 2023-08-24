package streams;

import java.util.Arrays;
import java.util.List;

public class mapDemo {
    public static void main(String[] args) {
        List<String> productList1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");
        List<String> productList2 = Arrays.asList("Scanner", "Projector", "Light Pen");
        List<String> productList3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");
        List<String> productList4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable");

        List<List<String>> allProductList = Arrays.asList(productList4, productList3, productList2, productList1);

        List<String> allProductVal = allProductList.stream().flatMap(p -> p.stream()).toList();

        allProductVal.forEach(System.out::println);

    }
}
