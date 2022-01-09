package QuizApp;
import java.util.*;

public class Sports {

		private int right=0;
		private int wrong=0;
		private int answer;
		
		public Sports () {
		Scanner sc=new Scanner(System.in);	
		System.out.println("\n WELCOME TO THE SPORTS QUIZ ");
		
	System.out.println("\nQ.1: Who has become the first Indian fencer to qualify for Tokyo Olympic Games?\r\n"
			+ "\n1) Kavitha Devi\r\n"
			+ "2) Bhavani Devi\r\n"
			+ "3) Daina Devi\r\n"
			+ "4) Kaushik Vedika");
	

	this.answer=sc.nextInt();
	if(answer==2) {
	System.out.println("\nCorrect Answer");
	System.out.println("\nNote: Tamil Nadu fencer Bhavani Devi scripted history by becoming"+"\nthe first Indian fencer to qualify for Olympic Games.");
	this.right++;
	}
	else {
	System.out.println("\nWrong Answer");
	System.out.println("\nNote: Tamil Nadu fencer Bhavani Devi scripted history by becoming"+"\nthe first Indian fencer to qualify for Olympic Games.");
	this.wrong++;	 
	}
	
	System.out.println("\nQ.2: Which of the following football club wins FIFA Club World Cup 2020?\r\n"
			+ "\n1) Juventus F. C\r\n"
			+ "2) FC Barcelona\r\n"
			+ "3) Manchester United\r\n"
			+ "4) Bayern Munich");
	

	answer=sc.nextInt();
	if(answer==4) {
	System.out.println("\nCorrect Answer");
	System.out.println("\nNote: German football club Bayern Munich emerged as champion"+"\nof the FIFA Club World Cup 2020, beating Mexican club Tigers.");
	right++;
	}
	else {
	System.out.println("\nWrong Answer");	
	System.out.println("\nNote: German football club Bayern Munich emerged as champion"+"\nof the FIFA Club World Cup 2020, beating Mexican club Tigers.");
	wrong++;	 
	}
	
	System.out.println("\nQ.3: Who among the following woman cricketers was the first who has scored 10,000 runs in International Cricket format?\r\n"
			+ "\n1) Mithali Raj\r\n"
			+ "2) Anjum Chopra\r\n"
			+ "3) Charlotte Edwards\r\n"
			+ "4) Ellyse Perry");
	

	answer=sc.nextInt();
	if(answer==3) {
	System.out.println("\nCorrect Answer");
	right++;
	}
	else {
	System.out.println("\nWrong Answer");		 
	wrong++;	 
	}
	
	System.out.println("\nQ.4: Who becomes the first cricketer who has hit the six sixes in an over in One Day Internation (50-50) cricket?\r\n"
			+ "\n1) Kieron Pollard\r\n"
			+ "2) Yuvraj Singh\r\n"
			+ "3) Herschelle Gibs\r\n"
			+ "4) Viv Richards");
	
	answer=sc.nextInt();
	if(answer==3) {
	System.out.println("\nCorrect Answer");
	System.out.println("\nNote: South African opener Herschelle Gibbs has hit six sixes in an over"+"\nin World Cup 2007 (50-50 format) match against the Netherlands.");
	right++;
	}
	else {
	System.out.println("\nWrong Answer");
	System.out.println("\nNote: South African opener Herschelle Gibbs has hit six sixes in an over"+"\nin World Cup 2007 (50-50 format) match against the Netherlands.");
	wrong++;	 
	}
	
	System.out.println("\nQ.5: Grand Slam tournaments are operated by -\r\n"
			+ "\n1) The Association of Tennis Professionals (ATP)\r\n"
			+ "2) The Women's Tennis Association (WTA)\r\n"
			+ "3) The International Tennis Federation The (ITF)\r\n"
			+ "4) Jointly by the Association of Tennis Professionals (ATP) and The Women's Tennis Association (WTA)");
	
	answer=sc.nextInt();
	if(answer==3) {
	System.out.println("\nCorrect Answer");
	right++;
	}
	else {
	System.out.println("\nWrong Answer");		 
	wrong++;	 
	}
	
	System.out.println("\nQ.6: IPL stands for -\r\n"
			+ "\n1) Indian Premier League\r\n"
			+ "2) Indo-Pakistan League\r\n"
			+ "3) International Premier League\r\n"
			+ "4) Indian Players League");
	
	
	answer=sc.nextInt();
	if(answer==1) {
	System.out.println("\nCorrect Answer");
	System.out.println("\nNote: The Indian Premier League (IPL) is a professional Twenty-20 cricket league in India."+"\nThe league was founded by the Board of Control for Cricket in India (BCCI) in 2008.");
	right++;
	}
	else {
	System.out.println("\nWrong Answer");
	System.out.println("\nNote: The Indian Premier League (IPL) is a professional Twenty-20 cricket league in India."+"\nThe league was founded by the Board of Control for Cricket in India (BCCI) in 2008.");
	wrong++;	 
	}
	
	System.out.println("\nQ.7: Who was the first Indian Woman to get an Olympic medal?\r\n"
			+ "\n1) P.T. Usha\r\n"
			+ "2) Sania Mirza\r\n"
			+ "3) Aarti Saha\r\n"
			+ "4) Karnam Malleswari");
	
	answer=sc.nextInt();
	if(answer==4) {
	System.out.println("\nCorrect Answer");
	System.out.println("\nNote: The first Indian woman to ever win an Olympic medal was Karnam Malleswari"+"\nwho won a bronze medal at the 2000 Sydney Olympics"+"\nin the Women's 69 kg category in Weightlifting.");
	right++;
	}
	else {
	System.out.println("\nWrong Answer");
	System.out.println("\nNote: The first Indian woman to ever win an Olympic medal was Karnam Malleswari"+"\nwho won a bronze medal at the 2000 Sydney Olympics"+"\nin the Women's 69 kg category in Weightlifting.");
	wrong++;	 
	}
	
	System.out.println("\nQ.8: Who won the Women Singles title in the US Open Tennis Tournament 2018?\r\n"
			+ "\n1) Anastasija Sevastova\r\n"
			+ "2) Serena Williams\r\n"
			+ "3) Naomi Osaka\r\n"
			+ "4) Elena Vesnina");
	
	
	answer=sc.nextInt();
	if(answer==3) {
	System.out.println("\nCorrect Answer");
	System.out.println("\nNote: Naomi Osaka defeated Serena Williams in the final, 6-2, 6-4, "+"\nto win the Women's Singles tennis title at the 2018 US Open.");
	right++;
	}
	else {
	System.out.println("\nWrong Answer");
	System.out.println("\nNote: Naomi Osaka defeated Serena Williams in the final, 6-2, 6-4, "+"\nto win the Women's Singles tennis title at the 2018 US Open.");
	wrong++;	 
	}
	
	System.out.println("\nQ.9: The famous C.K. Naidu Trophy is associated with which sport?\r\n"
			+ "\n1) Badminton\r\n"
			+ "2) Hockey\r\n"
			+ "3) Lawn Tennis\r\n"
			+ "4) Cricket");
	
	answer=sc.nextInt();
	if(answer==4) {
	System.out.println("\nCorrect Answer");
	System.out.println("\n Cricket is the games with which C. K. Nayudu Trophy is related."+"\nThe national Under-25 tournament was christened the C. K. Nayudu Trophy."+"\nColonel Cottari Kankaiya 'C. K.' Nayudu, born October 31, 1895,"+"\nwas the first truly great cricketer India produced.");
	right++;
	}
	else {
	System.out.println("\nWrong Answer");
	System.out.println("\n Cricket is the games with which C. K. Nayudu Trophy is related."+"\nThe national Under-25 tournament was christened the C. K. Nayudu Trophy."+"\nColonel Cottari Kankaiya 'C. K.' Nayudu, born October 31, 1895,"+"\nwas the first truly great cricketer India produced.");
	wrong++;	 
	}
	
	System.out.println("\nQ.10: Who is the first woman cricketer in the world to score 7000 runs in one day international match?\r\n"
			+ "\n1) Mithali Raj, India\r\n"
			+ "2) Charlotte Edwards, England\r\n"
			+ "3) Belinda Clark, Australia\r\n"
			+ "4) Karen Rolton, Australia");
	

	answer=sc.nextInt();
	if(answer==1) {
	System.out.println("\nCorrect Answer");
	right++;
	}
	else {
	System.out.println("\nWrong Answer");		 
	wrong++;	 
	}
}
		public void resultSports() {

			System.out.println("\nTOTAL CORRECT ANSWER ARE: "+right+"\n\nTOTAL WRONG ANSWER ARE: "+wrong);	
			}
}