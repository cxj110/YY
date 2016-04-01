package com.yy.cloud.core.workflow.data.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the member database table.
 * 
 */
@Entity
@NamedQuery(name="Member.findAll", query="SELECT m FROM Member m")
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int age;

	private String areaInfo;

	@Temporal(TemporalType.DATE)
	private Date birthday;

	private String carNo;

	private BigInteger channelId;

	private String comment;

	private String createMan;

	private int createManId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime;

	private String deviceIMEI;

	private String disLike;

	private String email;

	private int headImgId;

	private String IDCard;

	private int IDCardType;

	private String individualAutograph;

	private String latitude;

	private String loginDeviceType;

	private int loginState;

	private String longitude;

	private String love;

	private String memberNo;

	private String mobilePhone;

	private float money;

	private String name;

	private String nickName;

	private String phone;

	private String pwd;

	private String qq;

	private String saleMan;

	private int saleManId;

	private float score;

	private int sex;

	private int state;

	@Column(name="transfer_pwd")
	private String transferPwd;

	private int type;

	private String typeName;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTime;

	private String userId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date validTime;

	private String weiXin;

	public Member() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAreaInfo() {
		return this.areaInfo;
	}

	public void setAreaInfo(String areaInfo) {
		this.areaInfo = areaInfo;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getCarNo() {
		return this.carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public BigInteger getChannelId() {
		return this.channelId;
	}

	public void setChannelId(BigInteger channelId) {
		this.channelId = channelId;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCreateMan() {
		return this.createMan;
	}

	public void setCreateMan(String createMan) {
		this.createMan = createMan;
	}

	public int getCreateManId() {
		return this.createManId;
	}

	public void setCreateManId(int createManId) {
		this.createManId = createManId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDeviceIMEI() {
		return this.deviceIMEI;
	}

	public void setDeviceIMEI(String deviceIMEI) {
		this.deviceIMEI = deviceIMEI;
	}

	public String getDisLike() {
		return this.disLike;
	}

	public void setDisLike(String disLike) {
		this.disLike = disLike;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getHeadImgId() {
		return this.headImgId;
	}

	public void setHeadImgId(int headImgId) {
		this.headImgId = headImgId;
	}

	public String getIDCard() {
		return this.IDCard;
	}

	public void setIDCard(String IDCard) {
		this.IDCard = IDCard;
	}

	public int getIDCardType() {
		return this.IDCardType;
	}

	public void setIDCardType(int IDCardType) {
		this.IDCardType = IDCardType;
	}

	public String getIndividualAutograph() {
		return this.individualAutograph;
	}

	public void setIndividualAutograph(String individualAutograph) {
		this.individualAutograph = individualAutograph;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLoginDeviceType() {
		return this.loginDeviceType;
	}

	public void setLoginDeviceType(String loginDeviceType) {
		this.loginDeviceType = loginDeviceType;
	}

	public int getLoginState() {
		return this.loginState;
	}

	public void setLoginState(int loginState) {
		this.loginState = loginState;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLove() {
		return this.love;
	}

	public void setLove(String love) {
		this.love = love;
	}

	public String getMemberNo() {
		return this.memberNo;
	}

	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public float getMoney() {
		return this.money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getSaleMan() {
		return this.saleMan;
	}

	public void setSaleMan(String saleMan) {
		this.saleMan = saleMan;
	}

	public int getSaleManId() {
		return this.saleManId;
	}

	public void setSaleManId(int saleManId) {
		this.saleManId = saleManId;
	}

	public float getScore() {
		return this.score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public int getSex() {
		return this.sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getTransferPwd() {
		return this.transferPwd;
	}

	public void setTransferPwd(String transferPwd) {
		this.transferPwd = transferPwd;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getValidTime() {
		return this.validTime;
	}

	public void setValidTime(Date validTime) {
		this.validTime = validTime;
	}

	public String getWeiXin() {
		return this.weiXin;
	}

	public void setWeiXin(String weiXin) {
		this.weiXin = weiXin;
	}

}