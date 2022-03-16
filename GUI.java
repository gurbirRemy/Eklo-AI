
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class GUI {

	public GUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Enter");
		JTextField tf = new JTextField(30);
		JTextArea jArea = new JTextArea();
		jArea.setEditable(false);
		button.setBounds(200,50,100,20);
		panel.add(jArea);
		panel.add(tf);
		panel.add(button);
		
		frame.setSize(300, 300);
		frame.add(new JScrollPane(jArea),BorderLayout.CENTER);
		frame.add(panel,BorderLayout.PAGE_END);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Chat");
		frame.pack();
		frame.setVisible(true);

		jArea.append("Type 'end' to end the conversation.\nType something:\n");
		
	
	button.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			String content=tf.getText();
			jArea.append("User: "+content+"\n");
		    jArea.append("AI: "+words(content)+"\n");
		}
	});
	}

	public static String words(String sentence) {
		String x = sentence.toLowerCase();
		x = x.replaceAll("\\p{Punct}", "");
		Process p = new Process();
		Process p1 = new Process();
		Process p2 = new Process();
		Process p3 = new Process();
		Scanner in  = new Scanner(x);
		ArrayList<String> a = new ArrayList<String>();
		
		while(in.hasNext()){
			String z = in.next();
			a.add(z);
		}
		in.close();
		
		String[] str = p.LEMMA(x);
		String[] str1 = p1.POS(x);
		String[] str2= p2.NER(x);
		ArrayList<String> str3= p3.CoreRes(x);

		// for(int i=0; i < str.length;i++){
		// 	if(str[i].contains("be")){
		// 		str[i] = null;
		// 		str1[i] = null;
		// 		str2[i] = null;
		// 	}
		// }

			String y="";
		for(int i = 0; i< a.size();i++){
			
			if(str[i].contains("be")){
				a.set(i,"");
			}

			if(str1[i].contains("NN") ||str1[i].contains("JJ")||str1[i].contains("UH")){
				y = a.get(i);
				
			}else{
				a.set(i,"");
			}

			if(str2[i].contains("O")){

			}
			
		}

		for (int i = 0; i < a.size(); i++) { 	
			if(!a.get(i).contains("")){
				y = a.get(i);   
			}
		}   
		Profile pro = new Profile();
		String output="";
		// if(!pro.noun(y).contains("")){
		// 	output=pro.noun(y);
		// 	System.out.println(output);
		// }else if(!pro.adjective(y).contains("")){
		// 	output = pro.adjective(y);
		// 	System.out.println(output);
		// }
		
		String set1 = pro.noun(y);
		String set2 = pro.other(y);
		String set3 = pro.adjective(y);

		if(set1 != ""){
			output = set1;
		}else if(set2 != ""){
			output = set2;
		}else if( set3 != ""){
			output=set3;
		}

		return output;
	}

	public static String randAns() {  //This is probably the best code in the program.
		int num = (int) (Math.random()*10);
		String x = "";
		switch(num) {
		case 0: x = "Yes."; break;
		case 1: x = "No."; break;
		case 2: x = "Sure."; break;
		case 3: x = "No way."; break;
		case 4: x = "Obviously."; break;
		case 5: x = "No, of course not."; break;
		case 6: x = "Probably."; break;
		case 7: x = "Probably not."; break;
		case 8: x = "Yeah."; break;
		case 9: x = "Never."; break;
		}
		return x;
	}
	public static String question() {  //Asks a question.
		int num = (int) (Math.random()*10);
		String x = "";
		switch(num) {
		case 0: x = "What's your favourite colour?"; break;
		case 1: x = "What's your favourite animal?"; break;
		case 2: x = "How old are you?"; break;
		case 3: x = "Do you like me?"; break;
		case 4: x = "Do you have friends?"; break;
		case 5: x = "Have you noticed the man behind you?"; break;
		case 6: x = "Are you in a relationship?"; break;
		case 7: x = "Do you like games?"; break;
		case 8: x = "Do you have a job?"; break;
		case 9: x = "Are you in school?"; break;
		}
		return x;
	}
	public static String randDontUnderstand(String word) {  //This works. I hope.
		int num = (int) (Math.random()*5);
		String x = "";
		switch(num) {
		case 0: x = "I don't understand "+word+". "; break;
		case 1: x = "I don't know what "+word+" is. "; break;
		case 2: x = "I wonder what my mom thinks of "+word+". "; break;
		case 3: x = "I was never taught about "+word+". "; break;
		case 4: x = "Ummmm.... "; break;
		}
		return x;
	}
	public static void main(String[] args) {
		new GUI();
	}
}
