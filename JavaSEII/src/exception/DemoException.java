package exception;
/**
 * �쳣����
 * @author sunddenly
 *
 */
public class DemoException {
	public static void main(String[] args) {
		try {
			String info = "hello";
			System.out.println("����ַ����ĳ��ȣ�"+info.length());
			System.out.println("��ʮ���ַ���"+info.charAt(10));
			/**
			 * ��������ֵ��쳣û�в�����
			 * ������ĳ��򽫲��ڼ���ִ��
			 * 
			 * ע�⣬���ڲ�����г����쳣��try{}֮��ĳ����ִ��
			 * try{}�ڲ������쳣���к��潫�����ٴ�ִ��
			 */
			System.out.println("try�������������ˣ�");
		} catch (NullPointerException e) {
			System.out.println("����ַ����ǿգ�");
		} catch (StringIndexOutOfBoundsException e){
			System.out.println("�ַ����±�Խ�磡");
		} catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("�����������ˣ�");
	}
}
