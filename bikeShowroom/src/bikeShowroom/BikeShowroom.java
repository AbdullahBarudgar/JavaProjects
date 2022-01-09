package bikeShowroom;
import java.util.*;

public class BikeShowroom {
	

protected void Engine() {
};
protected void Seats() {
};
protected void Mileage() {
};	
protected void MaxSpeed() {
};

protected void KerbWeight() {
};
protected void price() {
};
		
public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
int button1,button2,select;
char question3;

System.out.println("---------WELCOME TO THE MOTORCYCLE SHOWROOM------------");

do {
System.out.println("\n\n1: SPORTS MOTORCYCLES "+"\n2: ADVENTURE MOTORCYCLES "+"\n3: SCOOTY'S\n");

System.out.println("Please select from the above category which type of motorcycle you need\n");
button1=sc.nextInt();

switch(button1)
{
case 1:

    System.out.println("\nPlease select the motorcycle");
    System.out.println("\n1: DODGE TOMAHAWK "+"\n2: SUZUKI HAYABUSA "+"\n3: KAWASAKI NINJA H2 "+"\n4: HONDA CBR110XX \n");
    select=sc.nextInt();

    if(select==1) {
    DodgeTomahawk bike1=new DodgeTomahawk();	
    }
    else if(select==2) {
    SuzukiHayabusa bike2=new SuzukiHayabusa();	
    }
    else if(select==3) {
    KawasakiNinjaH2 bike3=new KawasakiNinjaH2();	
    }

    else if(select==4) {
    HondaCBR1100XX bike4=new HondaCBR1100XX();	
    }
break;

case 2:

	System.out.println("\nPlease select the motorcycle");
	System.out.println("\n1: SUZUKI V-STROM 650 "+"\n2: KAWASAKI VERSYS 650 "+"\n3: BMW R1200GS "+"\n4: DUCATI MULTISTRADA \n");
	select=sc.nextInt();

	if(select==1) {
	SuzukiVStrom650 bike5=new SuzukiVStrom650();	
	}
	else if(select==2) {
	KawasakiVersys650 bike6=new KawasakiVersys650();	
	}
	else if(select==3) {
	BMWR1200GS bike7=new BMWR1200GS();	
	}

	else if(select==4) {
	DucatiMultistrada bike8=new DucatiMultistrada();	
	}	
	break;
	
case 3:

	System.out.println("\nPlease select the motorcycle");
	System.out.println("\n1: HONDA ACTIVA 6G "+"\n2: TVS JUPITER "+"\n3: YAMAHA FASCINO "+"\n4: HONDA MAESTRO EDGE 125 \n");
	select=sc.nextInt();

	if(select==1) {
	HondaActiva6G bike9=new HondaActiva6G();	
	}
	else if(select==2) {
	TVSJupiter bike10=new TVSJupiter();	
	}
	else if(select==3) {
	YamahaFascino bike11=new YamahaFascino();	
	}

	else if(select==4) {
	HeroMaestroEdge125 bike12=new HeroMaestroEdge125();	
	}
   break;
   
	default: {
	System.out.println("\nERROR----PLEASE SELECT APPROPRIATE OPTION ");	
	}
}
System.out.println("\nDo You Want see more bikes"+"\nIf 'YES' enter 'Y' and for 'NO' enter 'N'");
question3=sc.next().charAt(0);
}
while(question3=='Y');

Customer customer=new Customer();
customer.ques();

}
};
