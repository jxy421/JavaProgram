package day05;
/**
 * ����ģʽ
 * @author sunddenly
 * ������
 * 		1. ˽�о�̬��ǰ��ʵ��Ϊ����
 *      2. ˽�й��캯��
 *      3. ��̬��ȡʵ�����������ж�ʵ���Ƿ񴴽���
 *
 */
public class Singleton {
	private static Singleton singleton=null;
	private Singleton(){
		
	}

	public static Singleton getInstance(){
		if(singleton==null){
			singleton = new Singleton();
		}
		return singleton;
	}
}
