package fuel;

import static org.junit.Assert.*;

import org.junit.Test;

//�������� ������ Test5
public class Test5 {

	@org.junit.Test
	public void test1() {
		
		// �������� ������� Calc � ��������� ����������
		Calc a = new Calc(680, 14, 40);
		// ��������� �����������
		assertEquals(a.getFuel(),"95.2");
	}

}
