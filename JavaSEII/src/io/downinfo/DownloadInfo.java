package io.downinfo;

import java.io.Serializable;

/**
 * ����һ�����������������Ϣ
 * @author sunddenly
 * VO:Value Objectֵ����
 * ���ã� ����һ������
 * ���������ݱ�ʾ�������ݿ��е�һ�����ݵĻ�
 * ��ô������������Entity ʵ��
 * 
 * ͨ��ʵ��Serializable�ӿ�����ʶ��������л�
 */
public class DownloadInfo implements Serializable{
	private static final long serialVersionUID = 1l;
	private String url;     //�����ļ��ĵ�ַ
	private transient long pos;       //�Ѿ����ص��ֽ���
	private long fileSize;  //�ļ���С
	private String fileName; //�����ڱ��ص��ļ���
	public DownloadInfo(String url, String fileName) {
		this.url = url;
		this.fileName = fileName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public long getPos() {
		return pos;
	}
	public void setPos(long pos) {
		this.pos = pos;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	

	
}
