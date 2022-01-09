package QuizApp;


import java.util.*;
public class Agriculture {
private int right=0;
private int wrong=0;
private int answer;
public Agriculture () {
Scanner sc=new Scanner(System.in);	
System.out.println("\n WELCOME TO THE AGRICULTURE QUIZ ");

System.out.println("\n\nQ.1:  What kind of cropping pattern is used in rainfed farming areas?\r\n"
		+ "1) Single cropping\r\n"
		+ "2) Relay cropping\r\n"
		+ "3) Ratoon cropping\r\n"
		+ "4) Intercropping");

 this.answer=sc.nextInt();
 if(answer==4) {
 System.out.println("\nCorrect Answer");
 System.out.println("\nNote: Intercropping is a method of growing crops together, the rationale is that two or more crops"+"\nwith diverse growth habits or duration of growth, or both, may be able"+"\nto exploit plant nutrients and moisture in different soil layers"+"\nand intercept light more effectively than a single crop.");
 
 this.right++;
 }
 else {
 System.out.println("\nWrong Answer");	
 System.out.println("\nNote: Intercropping is a method of growing crops together, the rationale is that two or more crops"+"\nwith diverse growth habits or duration of growth, or both, may be able"+"\nto exploit plant nutrients and moisture in different soil layers"+"\nand intercept light more effectively than a single crop.");
 this.wrong++;	 
}
 
System.out.println("\nQ.2: The method of harvesting a crop which leaves the roots and the lower parts of the plant uncut to give the subtle crops is known as -\r\n"
		+ "1) Mulching\r\n"
		+ "2) Intensive farming\r\n"
		+ "3) Ratooning\r\n"
		+ "4) Zero tillage farming");

answer=sc.nextInt();
if(answer==3) {
System.out.println("\nCorrect Answer");
right++;
}
else {
System.out.println("\nWrong Answer");		 
wrong++;	 
}

System.out.println("\nQ.3: Which of the following fruits has maximum area under cultivation?\r\n"
		+ "1) Mango\r\n"
		+ "2) Jackfruit\r\n"
		+ "3) Berries\r\n"
		+ "4) Apple");

answer=sc.nextInt();
if(answer==1) {
System.out.println("\nCorrect Answer");
right++;
}
else {
System.out.println("\nWrong Answer");		 
wrong++;	 
}

System.out.println("\nQ.4: Jute cultivation in India is concentrated in delta area of which of the following rivers?\r\n"
		+ "1) Ganga\r\n"
		+ "2) Mahanadi\r\n"
		+ "3) Brahmaputra\r\n"
		+ "4) Godavari");

answer=sc.nextInt();
if(answer==1) {
System.out.println("\nCorrect Answer");
right++;
}
else {
System.out.println("\nWrong Answer");		 
wrong++;	 
}

System.out.println("\nQ.5: Which of the following terms is associated with Dairying?\r\n"
		+ "I. Pasturisation\r\n"
		+ "II. Homogenisation\r\n"
		+ "III. Cream Neutralisation\r\n"
		+ "Correct code is -\r\n"
		+ "1) Only I\r\n"
		+ "2) Only I and II\r\n"
		+ "3) I, II and III all\r\n"
		+ "4) Only II and III");

answer=sc.nextInt();
if(answer==3) {
System.out.println("\nCorrect Answer");
System.out.println("\nNote: Pasturisation is a process in which milk is heated"+" up to 1000C to eliminate pathogens keeping its nutritive value intact.");
right++;
}
else {
System.out.println("\nWrong Answer");
System.out.println("\nNote: Pasturisation is a process in which milk is heated"+" up to 1000C to eliminate pathogens keeping its nutritive value intact.");
wrong++;	 
}

System.out.println("\nQ.6: Which of the following is/ are a method of propagation?\r\n"
		+ "I. Cutting\r\n"
		+ "II. Layering\r\n"
		+ "III. Grafting\r\n"
		+ "IV. Inarching\r\n"
		+ "V. Budding\r\n"
		+ "Correct code is -\r\n"
		+ "1) I, II, and III only\r\n"
		+ "2) II, III and IV only\r\n"
		+ "3) III, IV and V only\r\n"
		+ "4) I, II, III, IV and V");

answer=sc.nextInt();
if(answer==4) {
System.out.println("\nCorrect Answer");
right++;
}
else {
System.out.println("\nWrong Answer");		 
wrong++;	 
}

System.out.println("\nQ.7: Which of the following is not a commercial crop?\r\n"
		+ "1) Cotton\r\n"
		+ "2) Jute\r\n"
		+ "3) Potato\r\n"
		+ "4) Sugarcane");

answer=sc.nextInt();
if(answer==3) {
System.out.println("\nCorrect Answer");
System.out.println("\nNote: Potato is a horticulture crop.");
}
else {
System.out.println("\nWrong Answer");
System.out.println("\nNote: Potato is a horticulture crop.");
wrong++;	 
}

System.out.println("\nQ.8: What culture should be given priority in groundnut cultivation?\r\n"
		+ "1) Mycorrhiza\r\n"
		+ "2) Rhizobium\r\n"
		+ "3) Phosphobacteria\r\n"
		+ "4) Azospirillum");

answer=sc.nextInt();
if(answer==2) {
System.out.println("\nCorrect Answer");
right++;
}
else {
System.out.println("\nWrong Answer");		 
wrong++;	 
}

System.out.println("\nQ.9: Increasing human population put pressure on the natural resources such as land, soil, water, fossil fuels etc. IT causes -\r\n"
		+ "I. Soil erosion\r\n"
		+ "II. Salinization of soils\r\n"
		+ "III. Desertification\r\n"
		+ "IV. Eutrophication\r\n"
		+ "1) I and II\r\n"
		+ "2) I, II and III\r\n"
		+ "3) III and IV\r\n"
		+ "4) I, II, III and IV");

answer=sc.nextInt();
if(answer==4) {
System.out.println("\nCorrect Answer");
right++;
}
else {
System.out.println("\nWrong Answer");		 
wrong++;	 
}

System.out.println("\nQ.10 Which of the following is/ are sustainable agricultural practices?\r\n"
		+ "I. Mixed Cropping\r\n"
		+ "II. Crop Rotation\r\n"
		+ "III. Intercropping\r\n"
		+ "IV. Integrated farming\r\n"
		+ "Correct code is -\r\n"
		+ "1) I, II and III only\r\n"
		+ "2) II, III and IV only\r\n"
		+ "3) I, III, and IV only\r\n"
		+ "4) I, II, III and IV all");

answer=sc.nextInt();
if(answer==4) {
System.out.println("\nCorrect Answer");
right++;
}
else {
System.out.println("\nWrong Answer");		 
wrong++;	 
}
}

public void resultAgriculture() {

System.out.println("\nTOTAL CORRECT ANSWER ARE: "+right+"\n\nTOTAL WRONG ANSWER ARE: "+wrong);	
}
}