// Loosely coupled demo using interface
public class Car{
	private Engine engine;
	
	Car(Engine engine){
		this.engine = engine;
	}
	
	void drive() {
		engine.start();
		System.out.println("car is moving");
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
//		PetrolEngine petrolEngine = new PetrolEngine();
//		Car car1 = new Car(petrolEngine);
//		car1.drive();
//		
//		ElectricEngine electricEngine = new ElectricEngine();
//		Car car2 = new Car(electricEngine);
//		car2.drive();
//
//		CNGEngine cngEngine = new CNGEngine();
//		Car car3 = new Car(cngEngine);
//		car3.drive();

	java.util.Scanner sc = new java.util.Scanner(System.in);
	
	System.out.println("list of engines....");
	System.out.println("1: petrolEngine");
	System.out.println("2: ElectricEngine");
	System.out.println("3: CNGEngine");
	System.out.println("read a type of engine :: ");
	
	String engineType = sc.next();
	
	try {
		Class cls = Class.forName(engineType);//this is for default package,,, for separate package class.forName(packagename.class Name)
//		Object obj = cls.newInstance();
//		Engine engine = (Engine)obj;
		
		
		Engine engine = (Engine)cls.newInstance();;
		
		Car car = new Car(engine);
		car.drive();
		
	}catch(ClassNotFoundException e){
		System.out.println("engine not exist");
	}
		
	}
}







/* tightly coupled
 public class Car {
 
	//Engine engine;
	//PetrolEngine petrolEngine;
	//ElectricEngine electricEngine;
	CNGEngine cngEngine;
	Car(){
		//engine = new Engine();
		//petrolEngine = new PetrolEngine();
		cngEngine = new CNGEngine();
	}
	
	void drive() {
		//engine.start();
		//petrolEngine.start();
		cngEngine.start();
		System.out.println("car is moving..........");
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.drive();

	}

}
*/