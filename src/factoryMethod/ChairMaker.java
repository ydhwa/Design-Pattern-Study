/*
 * �������� ����� �����ϴ� ��ü
 * */

package factoryMethod;

public class ChairMaker implements Furniture{

	public ChairMaker() {
		System.out.println("���ڸ���Ŀ �����");
	}
	
	@Override
	public void make() {
		System.out.println("���ڸ� ��������ϴ�.");
	}
	
	@Override
	public void newDesign() {
		System.out.println("���ο� ���� �������� �����մϴ�.");
		
	}

}