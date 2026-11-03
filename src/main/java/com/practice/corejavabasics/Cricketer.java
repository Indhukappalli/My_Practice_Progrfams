package filehandling.serilizationcodes;
import java.io.Serializable;
class Cricketer implements Serializable{
	String name;
	String country;
	transient int age;
	int matches;
	int runs;
	public Cricketer(String name,String country,int age,int matches,int runs) {
		super();
		this.name = name;
		this.country = country;
		this.age = age;
		this.matches = matches;
		this.runs=runs;
	}
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public int getAge() {
		return age;
	}
	public int getMatches() {
		return matches;
	}
	public int getRuns() {
		return runs;
	}
	@Override
	public String toString() {
		return name+"----------"+country+"-----------------"+age+"--------"+matches+"------"+runs;
	}
	
	}
}