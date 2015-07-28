package io.downinfo;

import java.io.Serializable;

/**
 * 保存一个下载任务所需的信息
 * @author sunddenly
 * VO:Value Object值对象
 * 作用： 保存一组数据
 * 若这组数据表示的是数据库中的一条数据的话
 * 那么这个对象叫做：Entity 实体
 * 
 * 通过实现Serializable接口来标识该类可序列化
 */
public class DownloadInfo implements Serializable{
	private static final long serialVersionUID = 1l;
	private String url;     //下载文件的地址
	private transient long pos;       //已经下载的字节数
	private long fileSize;  //文件大小
	private String fileName; //保存在本地的文件名
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
