package com.yy.cloud.composite.webui.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the book database table.
 * 
 */
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private Date checkTime;

	private String comment;

	private String contactName;

	private String contactPhone;

	private Date createTime;

	private String creator;

	private int creatorId;

	private Date dinnerTime;

	private float discount;

	private int discountId;

	private float discountRate;

	private String groupCode;

	private String groupName;

	private int isChoseProduct;

	private String memberCard;

	private int memberId;

	private String memberName;

	private float memberPay;

	private float money;

	private float moneyDiscount;

	private float pay;

	private int payed;

	private int payType;

	private int peopleNum;

	private int periodType;

	private String phone;

	private int score;

	private String serialNo;

	private int state;

	private int storeId;

	private String storeName;

	private int tableId;

	private String tableName;

	private int tableTypeId;

	private String tableTypeName;

	private String threepart;

	private float threepartpay;

	private int threeparttype;

	private String ticketCode;

	private String ticketIds;

	private float ticketMoney;

	private Date updateTime;

	private String vip;

	private float vippay;

	private List<Bookdetail> bookdetails;

	public Book() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public int getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}

	public Date getDinnerTime() {
		return this.dinnerTime;
	}

	public void setDinnerTime(Date dinnerTime) {
		this.dinnerTime = dinnerTime;
	}

	public float getDiscount() {
		return this.discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public int getDiscountId() {
		return this.discountId;
	}

	public void setDiscountId(int discountId) {
		this.discountId = discountId;
	}

	public float getDiscountRate() {
		return this.discountRate;
	}

	public void setDiscountRate(float discountRate) {
		this.discountRate = discountRate;
	}

	public String getGroupCode() {
		return this.groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getIsChoseProduct() {
		return this.isChoseProduct;
	}

	public void setIsChoseProduct(int isChoseProduct) {
		this.isChoseProduct = isChoseProduct;
	}

	public String getMemberCard() {
		return this.memberCard;
	}

	public void setMemberCard(String memberCard) {
		this.memberCard = memberCard;
	}

	public int getMemberId() {
		return this.memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return this.memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public float getMemberPay() {
		return this.memberPay;
	}

	public void setMemberPay(float memberPay) {
		this.memberPay = memberPay;
	}

	public float getMoney() {
		return this.money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	public float getMoneyDiscount() {
		return this.moneyDiscount;
	}

	public void setMoneyDiscount(float moneyDiscount) {
		this.moneyDiscount = moneyDiscount;
	}

	public float getPay() {
		return this.pay;
	}

	public void setPay(float pay) {
		this.pay = pay;
	}

	public int getPayed() {
		return this.payed;
	}

	public void setPayed(int payed) {
		this.payed = payed;
	}

	public int getPayType() {
		return this.payType;
	}

	public void setPayType(int payType) {
		this.payType = payType;
	}

	public int getPeopleNum() {
		return this.peopleNum;
	}

	public void setPeopleNum(int peopleNum) {
		this.peopleNum = peopleNum;
	}

	public int getPeriodType() {
		return this.periodType;
	}

	public void setPeriodType(int periodType) {
		this.periodType = periodType;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public int getTableId() {
		return this.tableId;
	}

	public void setTableId(int tableId) {
		this.tableId = tableId;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public int getTableTypeId() {
		return this.tableTypeId;
	}

	public void setTableTypeId(int tableTypeId) {
		this.tableTypeId = tableTypeId;
	}

	public String getTableTypeName() {
		return this.tableTypeName;
	}

	public void setTableTypeName(String tableTypeName) {
		this.tableTypeName = tableTypeName;
	}

	public String getThreepart() {
		return this.threepart;
	}

	public void setThreepart(String threepart) {
		this.threepart = threepart;
	}

	public float getThreepartpay() {
		return this.threepartpay;
	}

	public void setThreepartpay(float threepartpay) {
		this.threepartpay = threepartpay;
	}

	public int getThreeparttype() {
		return this.threeparttype;
	}

	public void setThreeparttype(int threeparttype) {
		this.threeparttype = threeparttype;
	}

	public String getTicketCode() {
		return this.ticketCode;
	}

	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}

	public String getTicketIds() {
		return this.ticketIds;
	}

	public void setTicketIds(String ticketIds) {
		this.ticketIds = ticketIds;
	}

	public float getTicketMoney() {
		return this.ticketMoney;
	}

	public void setTicketMoney(float ticketMoney) {
		this.ticketMoney = ticketMoney;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getVip() {
		return this.vip;
	}

	public void setVip(String vip) {
		this.vip = vip;
	}

	public float getVippay() {
		return this.vippay;
	}

	public void setVippay(float vippay) {
		this.vippay = vippay;
	}

	public List<Bookdetail> getBookdetails() {
		return this.bookdetails;
	}

	public void setBookdetails(List<Bookdetail> bookdetails) {
		this.bookdetails = bookdetails;
	}

	public Bookdetail addBookdetail(Bookdetail bookdetail) {
		getBookdetails().add(bookdetail);
		bookdetail.setBook(this);

		return bookdetail;
	}

	public Bookdetail removeBookdetail(Bookdetail bookdetail) {
		getBookdetails().remove(bookdetail);
		bookdetail.setBook(null);

		return bookdetail;
	}

}