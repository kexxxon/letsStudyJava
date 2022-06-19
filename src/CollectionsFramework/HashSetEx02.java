package CollectionsFramework;

import java.util.HashSet;
import java.util.Objects;

public class HashSetEx02 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc"); // 중복이라 저장 안됨
		set.add(new Person("June", 6));
		set.add(new Person("June", 6));
		// June: 6이 두번 출력 => 다른 것으로 인식함
		
		System.out.println(set);
	}
}

// equals()와 hashCode()를 오버라이딩 해야 HashSet이 바르게 동작

class Person {
	String name;
	int age;
	
	@Override
	public int hashCode() {
		// int hash(Object... values); // 가변인자
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		
		Person p = (Person)obj;
		// 나 자신(this)의 이름과 나이를 p와 비교
		return this.name.equals(p.name) && this.age == p.age;
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;;
	}
	
	public String toString() {
		return name + ": " + age;
	}
}