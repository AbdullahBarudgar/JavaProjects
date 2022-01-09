package QuizApp;
import java.util.*;

public class History {

private int right=0;
private int wrong=0;
private int answer;	

public History () {
Scanner sc=new Scanner(System.in);	
System.out.println("\n WELCOME TO THE HISTORY QUIZ ");

System.out.println("\nQ.1: Who among the following was the President of Indian National Congress when India got independence?\r\n"
		+ "1) J. B. Kriplani\r\n"
		+ "2) Sardar Vallabhbhai Patel\r\n"
		+ "3) Mahatma Gandhi\r\n"
		+ "4) Jawahar Lal Nehru");

this.answer=sc.nextInt();
if(answer==1) {
System.out.println("\nCorrect Answer");
this.right++;
}
else {
System.out.println("\nWrong Answer");	
this.wrong++;	 
}

System.out.println("\nQ.2: Consider the following Bhakti Saints -\r\n"
		+ "1. Dadu Dayal\r\n"
		+ "2. Guru Nanak\r\n"
		+ "3. Tyagaraja\r\n"
		+ "\nWho among the above was/ were preaching when the Lodi dynasty fell and Babur took over?\r\n"
		+ "1) 1 and 3\r\n"
		+ "2) Only 2\r\n"
		+ "3) 2 and 3\r\n"
		+ "4) Only 1");

answer=sc.nextInt();
if(answer==4) {
System.out.println("\nCorrect Answer");
right++;
}
else {
System.out.println("\nWrong Answer");		 
wrong++;	 
}

System.out.println("\nQ.3: Which of the following Kingdoms were associated with the life of the Buddha?\r\n"
		+ "1. Avanti\r\n"
		+ "2. Gandhara\r\n"
		+ "3. Kosala\r\n"
		+ "4. Magadha\r\n"
		+ "\nSelect the correct answer using the code given below -\r\n"
		+ "1) 1, 2 and 3\r\n"
		+ "2) 2 and 4\r\n"
		+ "3) Only 3 and 4\r\n"
		+ "4) 1, 3 and 4");

answer=sc.nextInt();
if(answer==4) {
System.out.println("\nCorrect Answer");
System.out.println("Note: It is said that when Pajjota heard of the Buddha's advent to the world,"+"\nhe sent his chaplain's son, Kaccana, with seven others, to invite him to Avanti.");
right++;
}
else {
System.out.println("\nWrong Answer");	
System.out.println("\nNote: It is said that when Pajjota heard of the Buddha's advent to the world,"+"\nhe sent his chaplain's son, Kaccana, with seven others, to invite him to Avanti.");
wrong++;	 
}

System.out.println("\nQ.4: What was the main reason for the split in the Indian National Congress at Surat in 1907?\r\n"
		+ "1) Introduction of communalism into Indian politics by Lord Minto\r\n"
		+ "2) Extremists' lack of faith in the capacity of the moderates to negotiate with the British Government\r\n"
		+ "3) Foundation of Muslim League\r\n"
		+ "4) Aurobindo Ghosh's inability to be elected as the President of the Indian National Congress\n");

answer=sc.nextInt();
if(answer==2) {
System.out.println("\nCorrect Answer");
right++;
}
else {
System.out.println("\nWrong Answer");	
wrong++;	 
}

System.out.println("\nQ.5: Regarding the taxation system of Krishna Deva, the ruler of Vijayanagar, consider the following statements -\r\n"
		+ "\n1. The tax rate on land was fixed depending on the quality of the land.\r\n"
		+ "2. Private owners of workshops paid an industries tax.\r\n"
		+ "\nWhich of the statements given above is/are correct?\r\n"
		+ "1) Only 1\r\n"
		+ "2) Only 2\r\n"
		+ "3) Both 1 and 2\r\n"
		+ "4) Neither 1 nor 2");

answer=sc.nextInt();
if(answer==3) {
System.out.println("\nCorrect Answer");
System.out.println("\nNote: Vijayanagara rulers followed an oppressive taxation policy.");
right++;
}
else {
System.out.println("\nWrong Answer");
System.out.println("\nNote: Vijayanagara rulers followed an oppressive taxation policy.");
wrong++;	 
}

System.out.println("\nQ.6: Who among the following had first deciphered the edicts of Emperor Ashoka?\r\n"
		+ "1) Georg Buhler\r\n"
		+ "2) James Prinsep\r\n"
		+ "3) Max Muller\r\n"
		+ "4) William Jones");

answer=sc.nextInt();
if(answer==2) {
System.out.println("\nCorrect Answer");
System.out.println("\nNote: It was James Prinsep in 1837"+" who succeeded in deciphering an ancient inscription on a large stone pillar in Delhi"+" which was the edict of Emperor Ashoka.");
right++;
}
else {
System.out.println("\nWrong Answer");	
System.out.println("\nNote: It was James Prinsep in 1837"+" who succeeded in deciphering an ancient inscription on a large stone pillar in Delhi"+" which was the edict of Emperor Ashoka.");
wrong++;	 
}

System.out.println("\nQ.7: The Ghadr (Ghadar) was a -\r\n"
		+ "\n1) revolutionary association of Indians with headquarters at San Francisco.\r\n"
		+ "2) nationalist organization operating from Singapore.\r\n"
		+ "3) militant organisation with headquarters at Berlin\r\n"
		+ "4) Communist movement for India's freedom with headquarters at Tashkent");

answer=sc.nextInt();
if(answer==1) {
System.out.println("\nCorrect Answer");
right++;
}
else {
System.out.println("\nWrong Answer");	
wrong++;	 
}

System.out.println("\nQ.8: With reference to the economic history of medieval India, the term Araghatta refers to -\r\n"
		+ "\n1) bonded labour\r\n"
		+ "2) land grant made to military officers\r\n"
		+ "3) waterwheel used in the irrigation of land\r\n"
		+ "4) wasteland converted to cultivated land");

answer=sc.nextInt();
if(answer==3) {
System.out.println("\nCorrect Answer");
right++;
}
else {
System.out.println("\nWrong Answer");	
wrong++;	 
}

System.out.println("\nQ.9: In the context of Indian history, the principle of Dyarchy (diarchy) refers to -\r\n"
		+ "\n1) Division of the central legislature into two houses\r\n"
		+ "2) Introduction of double government i.e., Central and Statement governments\r\n"
		+ "3) Having two sets of rulers; one in London and another in Delhi\r\n"
		+ "4) Division of the subjects delegated to the provinces into two categories");

answer=sc.nextInt();
if(answer==4) {
System.out.println("\nCorrect Answer");
right++;
}
else {
System.out.println("\nWrong Answer");	
wrong++;	 
}

System.out.println("\nQ.10: Arrange the following in chronological order with respect to their date of arrival in India ?\r\n"
		+ "\n1. Al-Biruni 2. Francois Bernier\r\n"
		+ "3. Ibn Battuta 4. Marco Polo\r\n"
		+ "\nChoose the correct answer from the following code -\r\n"
		+ "1) 1-2-3-4\r\n"
		+ "2) 1-4-3-2\r\n"
		+ "3) 3-4-2-1\r\n"
		+ "4) 3-2-4-1");

answer=sc.nextInt();
if(answer==2) {
System.out.println("\nCorrect Answer");
right++;
}
else {
System.out.println("\nWrong Answer");	
wrong++;	 
}
}

public void resultHistory() {

System.out.println("\nTOTAL CORRECT ANSWER ARE: "+right+"\n\nTOTAL WRONG ANSWER ARE: "+wrong);	
}
}
