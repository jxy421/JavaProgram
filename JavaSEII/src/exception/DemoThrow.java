package exception;

public class DemoThrow {
	public static void main(String[] args) {
		try {
			/**
			 * ͨ�����ǵ��÷�����Ҫ��������Ļ�����ô��Щ����
			 * �������Զ������쳣�����ǽ������׸����ǽ��
			 */
			String result= getGirlFirend("Ů��");
			System.out.println("��׷��Ů������"+result);
		} catch (Exception e) {
			//����Ӧ�������ﲶ���쳣������
			System.out.println("��û׷������������");
		}
	}
	/**
	 * ����Ů����
	 * @param name Ů������
	 * @return     �Ƿ�ͬ��
	 */
	public static String getGirlFirend(String name)throws RuntimeException{
		try {
			if("sundddenly".equals(name)){
				return "��";
			}else if("Jerry".equals(name)){
				return "��";
			}else if("����Ů����".equals(name)){
				return "����";
			}else{
				/**
				 * �������˴���(������ҵ���ϵģ���һ������ʵ��)
				 * ���������׳��쳣
				 */
				throw new RuntimeException("�˼Ҳ��ɣ�");
			}
		} catch (NullPointerException e) {
			throw e;//�����˲�������׸������ߣ���Ϊ���γ�����
		}
	}
}
