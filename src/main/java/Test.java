import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Indhu");
        list.add("Mathi");
        System.out.println(list);
        list.removeAll(list);
        System.out.println(list);


        //            List<WebElement> links = driver.findElements(by.tagName("a"));

//        given()
//                .when()
//                //
//                .get(link)
//                .then()
//                .statusCode(200);
//
//            TakeScreenShot sht = (driver)TakeScreenShot.getScreentShot();
//
//            WebElement prodTypeDropdown = driver.finElement(by.xpath(".//button[@id='SearchProduct']/.."));
//            //open prod type
//            prodTypeDropdown.click();
//            //open commercial
//            prodTypeDropdown.findElement(by.xpath(".//ul//*[text()='Commercial']")).click();
//




    }
}
