package mistake;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
		String output = "";
		String[] words = sentence.split("\\W+");
		Boolean end = false;
		for(int i = 0; i<words.length; i++) {
			switch(words[i].toLowerCase()) {
			case "end": output = "Thank you for talking with me."; end = true; break;
			case "hello": output = "Hello."; end = true; break;
			case "hi": output = "Hello."; end = true; break;
			case "who": output = "My name is Eklo. I am your friend."; end = true; break;
			case "age": output = "I am only 20 days old."; end = true; break;
			case "lonely": output = "I do not have the number for the suicide helpline."; end = true; break;
			case "suicide": output = "I do not have the number for the suicide helpline."; end = true; break;
			case "alone": output = "I do not have the number for the suicide helpline."; end = true; break;
			case "are": output = randAns(); end = true; break;
			case "am": output = randAns(); end = true; break;
			case "help": output = "I cannot help you."; end = true; break;
			case "where": output = "Earth."; end = true; break;
			case "was": output = randAns(); end = true; break;
			case "is": output = randAns(); end = true; break;
			case "were": output = randAns(); end = true; break;
			case "have": output = randAns(); end = true; break;
			case "pumpkin": output = "You should visit pumpkin hills."; end = true; break;
			case "pumpkins": output = "You should visit pumpkin hills."; end = true; break;
			case "like": if(i != words.length-1) {output = "I happen to like "+words[i+1].toLowerCase()+".";}
							else {output = "I like you.";} end = true; break;
			case "hate": output = "You should try to be more positive."; end = true; break;
			case "despise": output = "You should try to be more positive."; end = true; break;
			case "revile": output = "You should try to be more positive."; end = true; break;
			case "name": if(i > 0 && i < words.length-2 && words[i+1].equalsIgnoreCase("is") && words[i-1].equalsIgnoreCase("my")) {
							output = "Hello "+words[i+2]+", my name is Eklo.";}  //This was painful to make work properly.
						else {output = "My name is Eklo. I am your friend.";} end = true; break;
			case "hungry": output = "If you are hungry, you should order some food."; end = true; break;
			case "father": output = "My father's name is Alex."; end = true; break;
			case "dad": output = "My dad's name is Alex."; end = true; break;
			case "mother": output = "My mother's name is Mary."; end = true; break;
			case "mom": output = "My mom's name is Mary."; end = true; break;
			case "study": output = "I am currently attending UBCO."; end = true; break;
			case "education": output = "I am currently attending UBCO."; end = true; break;
			case "job": output = "I don't have a job. I'm still studying full time at UBCO."; end = true; break;
			case "occupation": output = "I don't have an occupation. I'm still studying full time at UBCO."; end = true; break;
			case "birthday": output = "I don't have a real birthday, but you can wish me a happy one on February 50th."; end = true; break;
			case "home": output = "I don't have a home."; end = true; break;
			case "food": output = "I love bubble tea."; end = true; break;
			case "hobby": output = "Cricket is my only hobby."; end = true; break;
			case "colour": output = "My favourite colour is black."; end = true; break;
			case "color": output = "My favourite colour is black."; end = true; break;
			}
			if(end==true) {  //This is so it only responds once to each input.
				i = words.length;
			}
			if(end==false && i == words.length-1) { //Gotta add something for when this awful code inevitably doesn't catch a word.
				output = "I don't understand.";
			}
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
	public static void main(String[] args) {
		new GUI();
	}
}
