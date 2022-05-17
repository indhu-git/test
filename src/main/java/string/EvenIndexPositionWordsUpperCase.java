package string;

public class EvenIndexPositionWordsUpperCase {
    public static void main(String []args){

        String str = "Indhumathi with tvs next";

        String output = "INDHUMATHI with TVS next";

        String[] strArray = str.split(" ");

        String out = "";
        for(int i = 0; i<strArray.length; i++){
            if(i%2==0){
                out+=strArray[i].toUpperCase()+" ";
            }else{
                out+= strArray[i]+" ";
            }
        }
        System.out.println(out.trim());

    }
}
