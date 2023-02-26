package wo1261931780.stcodeClips.a20230217;

/**
 * @author junw
 */

public class A004StudentObj {
	private int number;
	private String name;
	private int age;
	private String address;

	public A004StudentObj(int number, String name, int age, String address) {
		this.number = number;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public A004StudentObj() {
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
