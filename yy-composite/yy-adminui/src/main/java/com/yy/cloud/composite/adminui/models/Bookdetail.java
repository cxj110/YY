package com.yy.cloud.composite.adminui.models;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the bookdetail database table.
 * 
 */
public class Bookdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String append;

	private String backDes;

	private String comment;

	private Date createTime;

	private int num;

	private float price;

	private int productId;

	private String productName;

	private int status;

	private int storeId;

	private Date updateTime;

	private Book book;

	public Bookdetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAppend() {
		return this.append;
	}

	public void setAppend(String append) {
		this.append = append;
	}

	public String getBackDes() {
		return this.backDes;
	}

	public void setBackDes(String backDes) {
		this.backDes = backDes;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}