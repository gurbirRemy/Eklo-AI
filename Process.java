import edu.stanford.nlp.ling.*;
import edu.stanford.nlp.pipeline.*;
import java.util.stream.Collectors;
import java.util.*;

public class Process {

    public String[] POS(String s){

        //remove punctuations to find accurate number of words for array length
        s = s.replaceAll("\\p{Punct}", "");

        //count number of words for array length
        StringTokenizer st = new StringTokenizer(s);
        int count = st.countTokens();
        String[] str = new String[count];

        //counter for input in array
        int i = 0;

        //Core NLP procressing of POS
        Properties props = new Properties();
        props.setProperty("annotators", "tokenize,ssplit,pos");
        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
        CoreDocument document = pipeline.processToCoreDocument(s);

        //Store tag values into array
        for (CoreLabel tok : document.tokens()) {
            str[i] = tok.tag();
            i++;
        }

        return str;
    }

    public String[] NER(String s){

        //remove punctuations to find accurate number of words for array length
        s = s.replaceAll("\\p{Punct}", "");

        //count number of words for array length
        StringTokenizer st = new StringTokenizer(s);
        int count = st.countTokens();
        String[] str = new String[count];
        
        // counter for array
        int i =0;
       

        //Core NLP processing
        Properties p = new Properties();
        p.setProperty("annotators", "tokenize,ssplit,pos,lemma,ner");
        StanfordCoreNLP pipeline = new StanfordCoreNLP(p);
        CoreDocument doc = new CoreDocument(s);
        pipeline.annotate(doc);
     
        String NER = doc.tokens().stream().map(token -> token.ner()).collect(Collectors.joining(" "));
        StringTokenizer token = new StringTokenizer(NER);
        while(token.hasMoreTokens()){
            str[i] = token.nextToken();
            i++;
        }
        return str;
    }

}
