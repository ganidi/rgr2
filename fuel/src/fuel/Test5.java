package fuel;

import static org.junit.Assert.*;

import org.junit.Test;

//создание класса Test5
public class Test5 {

	@org.junit.Test
	public void test1() {
		
		// создание объекта Calc с передачей параметров
		Calc a = new Calc(680, 14, 40);
		// сравнение результатов
		assertEquals(a.getFuel(),"95.2");
	}

}
