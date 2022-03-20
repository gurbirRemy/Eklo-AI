# COSC-310-Team-14
This project is a communicative agent that responds to user input in an interactive manner. It's a companion chatbot. It can answer basic information about itself and pretends itself as a real human.

### AI(.java)
This class has the code for all the functionality of the chatbot.  

### GUI(.java)
This class has the code for the Interface of the chatbot.  

### what we have done
For  assignment 3, we used Stanford's CoreNlp to ascertain the crux of the question so as to find a suitable response
- Lemmetization, Coreference resolution, Part-of-speech tagging and Named entity recognition
  - Lemmitization was used to remove words such as is,am,are .... etc
  - Coreference resolution was used to detect entities which are usually the main subject of the question
  - Part-of-speech tagging was used to remove words that are not nouns, nouns are usually the subject of the question
  - Named entity recognition was also used as a fail safe incase the keyword in the question is not caught
