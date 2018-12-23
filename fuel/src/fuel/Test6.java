package fuel;

import static org.junit.Assert.*;

import org.junit.Test;

//создание класса Test6
public class Test6 {

	@org.junit.Test
	public void test1() {
		
		// создание объекта Calc с передачей параметров
		Calc a = new Calc(756,24,31);
		// сравнение результатов
		assertEquals(a.getCost(),"5624.64");
	}

}
