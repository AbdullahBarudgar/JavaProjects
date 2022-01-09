package bikeShowroom;

public class AdventureBike extends BikeShowroom {
}

class SuzukiVStrom650 extends SportsBike{ 

public SuzukiVStrom650() {

System.out.println("\n----FEATURES OF SUZUKI V-STROM 650-----\n");

this.Engine();
this.Seats();
this.Mileage();
this.MaxSpeed();
this.KerbWeight();
this.price();
}

public  void Engine() {
System.out.println("The Engine Capacity -- 	645 cc (39.4 cu in) "+"\nMaximun Torque -- 	60.3 N⋅m (44.5 lbf⋅ft) at 6,400 rpm");
}
public void Seats() {
System.out.println("No: of seat is -- '2' ");
};
public void Mileage() {
System.out.println("Mileage is -- 18 Kmpl");	
};	
public void MaxSpeed() {
System.out.println("Top Speed -- 137 km/h "+"\n Power -- 66 bhp (49 kW) at 8,800 rpm");	
};

public void KerbWeight() {
System.out.println("The Kerb Weight -- 213.0 kg ");	
};

public void price() {
System.out.println("The prie of the bike is -- 3.8 Lakh, Only");	
};
}

class KawasakiVersys650 extends SportsBike{ 

public KawasakiVersys650() {

System.out.println("\n----FEATURES OF KAWASAKI VERSYS 650-----\n");

this.Engine();
this.Seats();
this.Mileage();
this.MaxSpeed();
this.KerbWeight();
this.price();
}

public  void Engine() {
System.out.println("The Engine Capacity -- 649 cc (39.6 cu in)"+"\nMaximun Torque -- 	42 lb⋅ft (57 N⋅m)");

}
public void Seats() {
System.out.println("No: of seat is -- '2' ");
};
public void Mileage() {
System.out.println("Mileage is -- 21 kmpl");	
};	
public void MaxSpeed() {
System.out.println("Top Speed -- 200 kmph "+"\nPower -- 59.4 hp (44 kW) @ 8,400 rpm ");	
};

public void KerbWeight() {
System.out.println("The Kerb Weight -- 206 kg ");	
};

public void price() {
System.out.println("The prie of the bike is -- 7.00 lakh ");	
};
}

class BMWR1200GS extends SportsBike{ 

public BMWR1200GS() {

System.out.println("\n----FEATURES OF BMW R1200GS-----\n");

this.Engine();
this.Seats();
this.Mileage();
this.MaxSpeed();
this.KerbWeight();
this.price();
}

public  void Engine() {
System.out.println("The Engine Capacity -- 	1170 cc "+"\nMaximun Torque -- 	125 Nm @ 6500 rpm ");

}
public void Seats() {
System.out.println("No: of seat is -- '2' ");
};
public void Mileage() {
System.out.println("Mileage is -- 24 kmpl");	
};	
public void MaxSpeed() {
System.out.println("Top Speed -- 201 km/h  "+"\nPower -- 125 bhp @ 7750 rpm ");	
};

public void KerbWeight() {
System.out.println("The Kerb Weight -- 244 kg");	
};

public void price() {
System.out.println("The prie of the bike is -- 17 lakh,only ");	
};
}

class DucatiMultistrada extends SportsBike{ 

public DucatiMultistrada() {

System.out.println("\n----FEATURES OF DUCATI MULTISTRADA -----\n");

this.Engine();
this.Seats();
this.Mileage();
this.MaxSpeed();
this.KerbWeight();
this.price();
}

public  void Engine() {
System.out.println("The Engine Capacity -- 	937 cc, Liquid Cooled, Ducati Testastretta "+"\nMaximun Torque -- 94 Nm @ 6750 rpm ");
}

public void Seats() {
System.out.println("No: of seat is -- '2' ");
};
public void Mileage() {
System.out.println("Mileage is -- 22.86 kmpl ");	
};	
public void MaxSpeed() {
System.out.println("Top Speed -- 209 km/h  "+"\nPower -- 114.5 PS @ 9,000 rpm ");	
};

public void KerbWeight() {
System.out.println("The Kerb Weight -- 230 Kg ");	
};

public void price() {
System.out.println("The prie of the bike is -- 15.49 lakh,only ");	
};
}



