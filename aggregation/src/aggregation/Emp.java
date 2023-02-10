package aggregation;

public class Emp {
int id;
String name;
Adress adress;
public Emp(int id,String name,Adress adress) {
	this.id=id;
	this.name=name;
	this.adress=adress;
}
void display() {
	System.out.println(id+" "+name);
	System.out.println(adress.state+" "+adress.country);
}
public static void main(String[] args) {
	Adress ad1=new Adress("UP","India");
	Adress ad2=new Adress("KL","India");
	Emp e1=new Emp(123,"suru",ad1);
	Emp e2=new Emp(456,"Haro",ad2);
	e1.display();
	e2.display();
}
}
