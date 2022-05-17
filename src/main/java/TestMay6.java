public class TestMay6 {

    public static void main(String[] args) {

        String string = "radar";
        String result = "";
        for(int i = string.length()-1; i>=0;i--){
            result += string.charAt(i);
        }
        if(result.equals(string)){
            System.out.println("The given string "+string+" is palindrome");
        }else{
            System.out.println("The given string "+string+" is not palindrome");
        }
    }

}


// #state .css-tlfecz-indicatorContainer
//driver.manage().switchTo.frame();
//driver.getWindowHandles() -> Set<String>
// int i = 1;
//for(String eachWindow: winHadles){
// if(i==5){
// driver.manage(0.switchToWindow(eachWindow);
//}
//i++
// }
