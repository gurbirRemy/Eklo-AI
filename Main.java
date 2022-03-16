import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        String s = "Hi";
        // set up pipeline properties
        Process p = new Process();
        String[] str = p.NER(s);
        
        for(String x : str){
            System.out.println(x);
        }

        String[] str1 = p.POS(s);
        
        for(String x : str1){
            System.out.println(x);
        }

        // String[] str2 = p.LEMMA(s);
        
        // for(String x : str2){
        //     System.out.println(x);
        // }

        // ArrayList<String> str3 = p.CoreRes(s);
        
        // for(int i =0;i < str3.size(); i++){
        //     System.out.println(str3.get(i));
        // }
        
       
        
      
    }
}
