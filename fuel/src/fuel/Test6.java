package fuel;

import static org.junit.Assert.*;

import org.junit.Test;

//�������� ������ Test6
public class Test6 {

	@org.junit.Test
	public void test1() {
		
		// �������� ������� Calc � ��������� ����������
		Calc a = new Calc(756,24,31);
		// ��������� �����������
		assertEquals(a.getCost(),"5624.64");
	}

}
