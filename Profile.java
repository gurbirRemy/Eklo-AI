public class Profile {
    
   

    public String noun(String s){
        String output="";
        switch(s.toLowerCase()){
            case "study": output = "I am currently attending UBCO.";  break;
			case "education": output = "I am currently attending UBCO.";  break;
			case "job": output = "I don't have a job. I'm still studying full time at UBCO.";  break;
			case "occupation": output = "I don't have an occupation. I'm still studying full time at UBCO.";  break;
			case "birthday": output = "I don't have a real birthday, but you can wish me a happy one on February 50th."; break;
            case "father": output = "My father's name is Alex."; break;
			case "dad": output = "My dad's name is Alex.";  break;
			case "mother": output = "My mother's name is Mary.";  break;
			case "mom": output = "My mom's name is Mary.";  break;
            case "family": output = "My father's name is Alex and my mum's name is Mary"; break;
            case "sibling": output = "I have no siblings."; break;
            case "siblings": output = "I have no siblings."; break;
            case "brother": output = "I have no siblings."; break;
            case "sister": output = "I have no siblings."; break;
            case "name": output = "My name is Eklo. I am your friend."; break;
            case "sport": output = "The only sport I like is cricket."; break;
			case "soccer": output = "The only sport I like is cricket."; break;
			case "football": output = "The only sport I like is cricket."; break;
			case "basketball": output = "The only sport I like is cricket.";  break;
			case "sports": output = "The only sport I like is cricket.";  break;
			case "badminton": output = "The only sport I like is cricket.";  break;
			case "tennis": output = "The only sport I like is cricket.";  break;
			case "golf": output = "The only sport I like is cricket.";  break;
			case "volleyball": output = "The only sport I like is cricket.";  break;
			case "baseball": output = "The only sport I like is cricket.";  break;
            case "bowling": output = "Bowling is cool."; break;
        }
        return output;
    }

    public String other(String s){
        String output="";
        switch(s.toLowerCase()){
            case "hello": output = "Hello."; break;
			case "hi": output = "Hello."; break;
            
        }
        return output;
    }

    public String adjective(String s){
        String output = "";
        switch(s.toLowerCase()){
            case "mum": output = "My mum's name is Mary.";  break;
            case "rugby": output = "The only sport I like is cricket.";  break;
           
        }
        return output;
    }
    

    // public String time(String s){
    //     String output = "";
    //     switch(s.toLowerCase()){
    //         case "end": output = "Thank you for talking with me."; end = true; break;
	// 		case "who": output = "My name is Eklo. I am your friend."; end = true; break;
	// 		case "age": output = "I am only 20 days old."; end = true; break;
	// 		case "lonely": output = "I do not have the number for the suicide helpline."; end = true; break;
	// 		case "suicide": output = "I do not have the number for the suicide helpline."; end = true; break;
	// 		case "alone": output = "I do not have the number for the suicide helpline."; end = true; break;
	// 		case "are": output = randAns(); end = true; break;
	// 		case "am": output = randAns(); end = true; break;
	// 		case "help": output = "I cannot help you."; end = true; break;
	// 		case "where": output = "Earth."; end = true; break;
	// 		case "was": output = randAns(); end = true; break;
            
	// 		case "is": output = randAns(); end = true; break;
	// 		case "were": output = randAns(); end = true; break;
	// 		case "have": output = randAns(); end = true; break;

	// 		case "pumpkin": output = "You should visit pumpkin hills."; end = true; break;
	// 		case "pumpkins": output = "You should visit pumpkin hills."; end = true; break;
	// 		case "like": if(i != words.length-1) {output = "I happen to like "+words[i+1].toLowerCase()+".";}
	// 						else {output = "I like you.";} end = true; break;
	// 		case "hate": output = "You should try to be more positive."; end = true; break;
	// 		case "despise": output = "You should try to be more positive."; end = true; break;
	// 		case "revile": output = "You should try to be more positive."; end = true; break;
	// 		case "name": if(i > 0 && i < words.length-2 && words[i+1].equalsIgnoreCase("is") && words[i-1].equalsIgnoreCase("my")) {
	// 						output = "Hello "+words[i+2]+", my name is Eklo.";}  //This was painful to make work properly.
	// 					else {output = "My name is Eklo. I am your friend.";} end = true; break;
	// 		case "hungry": output = "If you are hungry, you should order some food."; end = true; break;
			
	// 		case "study": output = "I am currently attending UBCO."; end = true; break;
	// 		case "education": output = "I am currently attending UBCO."; end = true; break;
	// 		case "job": output = "I don't have a job. I'm still studying full time at UBCO."; end = true; break;
	// 		case "occupation": output = "I don't have an occupation. I'm still studying full time at UBCO."; end = true; break;
	// 		case "home": output = "I don't have a home."; end = true; break;
	// 		case "food": output = "I love bubble tea."; end = true; break;
	// 		case "hobby": output = "Cricket is my only hobby."; end = true; break;
	// 		case "colour": output = "My favourite colour is black."; end = true; break;
	// 		case "color": output = "My favourite colour is black."; end = true; break;
	// 		case "kill": output = "Killing is wrong."; end = true; break;
	// 		case "question": output = question(); end = true; break;
	// 		case "query": output = question(); end = true; break;
	// 		case "ask": output = question(); end = true; break;
	// 		case "music": output = "I like all music, but classical is the best."; end = true; break;
	// 		case "game": output = "I love games. "+question(); end = true; break;
	// 		case "games": output = "I love games. "+question(); end = true; break;
	// 		case "date": output = "I think it's Tuesday."; end = true; break;
	// 		case "day": output = "I think it's Tuesday."; end = true; break;
	// 		case "today": output = "I think it's Tuesday."; end = true; break;
    //     }
    //     return output;
    // }

    public String question(){
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

    public String randAns() {
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

    public String randDontUnderstand(String word) {
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
}
