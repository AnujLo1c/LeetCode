import java.util.*;
class Lc168 {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
        int div=0;
        int mod=(columnNumber-1)%26;
        if(columnNumber>26){
         div=(columnNumber)/26;
         sb.append((char)(65+div-1));
        }
         sb.append((char)(65+mod));
        //  System.out.println(sb);
         return sb.toString();
    }
    
        public static void main(String[] args){
         System.out.println(convertToTitle(1));;   
        }
    
    
}