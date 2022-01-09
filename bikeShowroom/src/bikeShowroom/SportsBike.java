package bikeShowroom;

class SportsBike extends BikeShowroom  {
}

class DodgeTomahawk extends SportsBike{ 

public DodgeTomahawk() {

System.out.println("\n----FEATURES OF DODGE TOMAHAWK-----\n");

this.Engine();
this.Seats();
this.Mileage();
this.MaxSpeed();
this.KerbWeight();
this.price();
}

public  void Engine() {
System.out.println("The Engine Capacity -- 8.3 litre , v-10"+"\nMaximun Torque -- 712 nm @ 4200 rpm");
}
public void Seats() {
System.out.println("No: of seat is -- '1' ");
};
public void Mileage() {
System.out.println("Mileage is -- 8 kmpl");	
};	
public void MaxSpeed() {
System.out.println("Top Speed -- 675 km/h "+"\n Power -- 500hp");	
};

public void KerbWeight() {
System.out.println("The Kerb Weight -- 680 Kg");	
};

public void price() {
System.out.println("The prie of the bike is -- 3.7 Cr");	
};
}

class SuzukiHayabusa extends SportsBike{ 

public  SuzukiHayabusa() {

System.out.println("\n----FEATURES OF SUZUKI HAYABUSA-----\n");

this.Engine();
this.Seats();
this.Mileage();
this.MaxSpeed();
this.KerbWeight();
this.price();
}

public  void Engine() {
System.out.println("The Engine Capacity -- 1,299 cc (79.3 cu in)"+"\nMaximun Torque -- 126.6–135.0 nm @ 6,750–7,000 rpm");

}
public void Seats() {
System.out.println("No: of seat is -- '1' ");
};
public void Mileage() {
System.out.println("Mileage is -- 14 kmpl");	
};	
public void MaxSpeed() {
System.out.println("Top Speed -- 303–312 km/h "+"\nPower -- 173 hp ");	
};

public void KerbWeight() {
System.out.println("The Kerb Weight -- 250–255.3 kg");	
};

public void price() {
System.out.println("The prie of the bike is -- 13.40 lakh ");	
};
}

class KawasakiNinjaH2 extends SportsBike{ 

public  KawasakiNinjaH2 () {

System.out.println("\n----FEATURES OF KAWASAKI NINJA H2-----\n");

this.Engine();
this.Seats();
this.Mileage();
this.MaxSpeed();
this.KerbWeight();
this.price();
}

public  void Engine() {
System.out.println("The Engine Capacity -- Supercharged (two-speed centrifugal) 998 cc inline-4 DOHC "+"\nMaximun Torque -- 	115 lb⋅ft (156 N⋅m) @12,500 rpm");

}
public void Seats() {
System.out.println("No: of seat is -- '2' ");
};
public void Mileage() {
System.out.println("Mileage is --40 kmpl");	
};	
public void MaxSpeed() {
System.out.println("Top Speed -- 	331–400 km/h  "+"\nPower -- 310 hp ");	
};

public void KerbWeight() {
System.out.println("The Kerb Weight -- 215 kg");	
};

public void price() {
System.out.println("The prie of the bike is -- 34.40 lakh,only ");	
};
}

class HondaCBR1100XX extends SportsBike{ 

public  HondaCBR1100XX () {

System.out.println("\n----FEATURES OF HONDA CBR110XX-----\n");

this.Engine();
this.Seats();
this.Mileage();
this.MaxSpeed();
this.KerbWeight();
this.price();
}

public  void Engine() {
System.out.println("The Engine Capacity -- 	1,137 cc (69.4 cu in) "+"\nMaximun Torque -- 80.9 lbf⋅ft (109.7 N⋅m) @ 7,500 rpm ");

}
public void Seats() {
System.out.println("No: of seat is -- '2' ");
};
public void Mileage() {
System.out.println("Mileage is --17 kmpl");	
};	
public void MaxSpeed() {
System.out.println("Top Speed -- 200- 290 km/h  "+"\nPower -- 132 hp ");	
};

public void KerbWeight() {
System.out.println("The Kerb Weight -- 250 kg");	
};

public void price() {
System.out.println("The prie of the bike is -- 3.40 lakh,only ");	
};
}


