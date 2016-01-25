/**   
* @Title: User.java 
* @Description:(用一句话描述该文件做什么) 
* @author fyf  
* @date 2016年1月19日 
* @version V1.0   
*/
package com.fengzhi.web.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	private static final long serialVersionUID = 4031277742702091485L;
	private long userId;
	private String userName;
	private String userNo;
	private String userPassword;
	private Date borth;
	private String gender;
	private String serialNo;
	private String telphone;
	private String address;
	private String email;
	private String workExperience;
	private String position;
	private String politicalAffiliation;
	private String graduation;
	private int userType;
	private String introduce;
	private String websiteUrl;
	private String photo;
	private long orgId;
	private char flag;
	private String priv;
	private String fatherName;
	private String fatherTel;
	private String motherName;
	private String motherTel;
	private Integer actives;
	private String cardId;
	private Character isOpenSms;
	private String sign;
	private Integer groupId;
	private Date createDate;
	private Date modifyDate;
	private String nickname;
	private String namestory;
	private String bornstory;
	private Character registerFlag;
	private Short smsFlag;
	private Short smsCount;
	private Date smsDate;
	private Short smsCardCount;
	private String bdUserId;
	private String bdChannelId;
	private char osType;
	private String deviceSerialId;
	private Integer vcode;
	private Date vcodeTime;
	private String orgName;
	private char videoFlag;
	private String videoAccount;
	private String videoPassword;
	private Integer gpsId;
	private char gpsStatus;
	private char appFlag;
	private String devicetoken;
	private char isManager;
	private char recordFlag;

	public User() {
	}

	/**
	 * 
	 * Description: 远程视频账号信息
	 * 
	 * @param videoFlag
	 * @param videoAccount
	 * @param videoPassword
	 */
	public User(char videoFlag, String videoAccount, String videoPassword, long orgId) {
		this.videoFlag = videoFlag;
		this.videoAccount = videoAccount;
		this.videoPassword = videoPassword;
		this.orgId = orgId;
	}

	public User(long userId) {
		this.userId = userId;
	}

	public User(long userId, String userName, String cardId, String orgName) {
		this.userId = userId;
		this.userName = userName;
		this.cardId = cardId;
		this.orgName = orgName;
	}

	public User(long orgId, long userId, String userName, String cardId, String orgName) {
		this.orgId = orgId;
		this.userId = userId;
		this.userName = userName;
		this.cardId = cardId;
		this.orgName = orgName;
	}

	public User(long userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}

	public User(long userId, Date vcodeTime) {
		this.userId = userId;
		this.vcodeTime = vcodeTime;
	}

	public User(long userId, String bdUserId, String bdChannelId) {
		this.userId = userId;
		this.bdUserId = bdUserId;
		this.bdChannelId = bdChannelId;
	}

	public User(String fatherTel, long userId, String bdUserId, String bdChannelId) {
		this.fatherTel = fatherTel;
		this.userId = userId;
		this.bdUserId = bdUserId;
		this.bdChannelId = bdChannelId;
	}

	public User(long userId, String bdUserId, String bdChannelId, char osType) {
		this.userId = userId;
		this.bdUserId = bdUserId;
		this.bdChannelId = bdChannelId;
		this.osType = osType;
	}

	public User(long userId, String userName, String telphone, int userType, String photo, String fatherTel) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.telphone = telphone;
		this.userType = userType;
		this.photo = photo;
		this.fatherTel = fatherTel;
	}

	public User(long userId, String userName, int userType, long orgId, String photo, String deviceSerialId, char videoFlag, String videoAccount, String videoPassword) {
		this.userId = userId;
		this.userName = userName;
		this.userType = userType;
		this.orgId = orgId;
		this.photo = photo;
		this.deviceSerialId = deviceSerialId;
		this.videoFlag = videoFlag;
		this.videoAccount = videoAccount;
		this.videoPassword = videoPassword;
	}

	public User(String userName, String userNo, String userPassword, Date borth, String gender, String serialNo, String telphone, String address, String email,
			String workExperience, String position, String politicalAffiliation, String graduation, int userType, String introduce, String websiteUrl, String photo, long orgId,
			char flag, String priv, String fatherName, String fatherTel, String motherName, String motherTel, Integer actives, String cardId, Character isOpenSms, String sign,
			Integer groupId, Date createDate, Date modifyDate, String nickname, String namestory, String bornstory, Character registerFlag, Short smsFlag, Short smsCount,
			Date smsDate, Short smsCardCount) {
		this.userName = userName;
		this.userNo = userNo;
		this.userPassword = userPassword;
		this.borth = borth;
		this.gender = gender;
		this.serialNo = serialNo;
		this.telphone = telphone;
		this.address = address;
		this.email = email;
		this.workExperience = workExperience;
		this.position = position;
		this.politicalAffiliation = politicalAffiliation;
		this.graduation = graduation;
		this.userType = userType;
		this.introduce = introduce;
		this.websiteUrl = websiteUrl;
		this.photo = photo;
		this.orgId = orgId;
		this.flag = flag;
		this.priv = priv;
		this.fatherName = fatherName;
		this.fatherTel = fatherTel;
		this.motherName = motherName;
		this.motherTel = motherTel;
		this.actives = actives;
		this.cardId = cardId;
		this.isOpenSms = isOpenSms;
		this.sign = sign;
		this.groupId = groupId;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
		this.nickname = nickname;
		this.namestory = namestory;
		this.bornstory = bornstory;
		this.registerFlag = registerFlag;
		this.smsFlag = smsFlag;
		this.smsCount = smsCount;
		this.smsDate = smsDate;
		this.smsCardCount = smsCardCount;
	}

	public User(long userId, String userName, int userType, long orgId, String photo, String deviceSerialId, char videoFlag, String videoAccount, String videoPassword,
			char isManager, char appFlag) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userType = userType;
		this.photo = photo;
		this.orgId = orgId;
		this.deviceSerialId = deviceSerialId;
		this.videoFlag = videoFlag;
		this.videoAccount = videoAccount;
		this.videoPassword = videoPassword;
		this.isManager = isManager;
		this.appFlag = appFlag;
	}

	public User(long userId, String userName, char videoFlag) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.videoFlag = videoFlag;
	}

	public String getDevicetoken() {
		return devicetoken;
	}

	public void setDevicetoken(String devicetoken) {
		this.devicetoken = devicetoken;
	}

	public Integer getGpsId() {
		return gpsId;
	}

	public void setGpsId(Integer gpsId) {
		this.gpsId = gpsId;
	}

	public char getGpsStatus() {
		return gpsStatus;
	}

	public void setGpsStatus(char gpsStatus) {
		this.gpsStatus = gpsStatus;
	}

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNo() {
		return this.userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Date getBorth() {
		return this.borth;
	}

	public void setBorth(Date borth) {
		this.borth = borth;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getTelphone() {
		return this.telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWorkExperience() {
		return this.workExperience;
	}

	public void setWorkExperience(String workExperience) {
		this.workExperience = workExperience;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPoliticalAffiliation() {
		return this.politicalAffiliation;
	}

	public void setPoliticalAffiliation(String politicalAffiliation) {
		this.politicalAffiliation = politicalAffiliation;
	}

	public String getGraduation() {
		return this.graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}

	public int getUserType() {
		return this.userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public String getIntroduce() {
		return this.introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getWebsiteUrl() {
		return this.websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public long getOrgId() {
		return this.orgId;
	}

	public void setOrgId(long orgId) {
		this.orgId = orgId;
	}

	public char getFlag() {
		return this.flag;
	}

	public void setFlag(char flag) {
		this.flag = flag;
	}

	public String getPriv() {
		return this.priv;
	}

	public void setPriv(String priv) {
		this.priv = priv;
	}

	public String getFatherName() {
		return this.fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getFatherTel() {
		return this.fatherTel;
	}

	public void setFatherTel(String fatherTel) {
		this.fatherTel = fatherTel;
	}

	public String getMotherName() {
		return this.motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMotherTel() {
		return this.motherTel;
	}

	public void setMotherTel(String motherTel) {
		this.motherTel = motherTel;
	}

	public Integer getActives() {
		return this.actives;
	}

	public void setActives(Integer actives) {
		this.actives = actives;
	}

	public String getCardId() {
		return this.cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public Character getIsOpenSms() {
		return this.isOpenSms;
	}

	public void setIsOpenSms(Character isOpenSms) {
		this.isOpenSms = isOpenSms;
	}

	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getNamestory() {
		return this.namestory;
	}

	public void setNamestory(String namestory) {
		this.namestory = namestory;
	}

	public String getBornstory() {
		return this.bornstory;
	}

	public void setBornstory(String bornstory) {
		this.bornstory = bornstory;
	}

	public Character getRegisterFlag() {
		return this.registerFlag;
	}

	public void setRegisterFlag(Character registerFlag) {
		this.registerFlag = registerFlag;
	}

	public Short getSmsFlag() {
		return this.smsFlag;
	}

	public void setSmsFlag(Short smsFlag) {
		this.smsFlag = smsFlag;
	}

	public Short getSmsCount() {
		return this.smsCount;
	}

	public void setSmsCount(Short smsCount) {
		this.smsCount = smsCount;
	}

	public Date getSmsDate() {
		return this.smsDate;
	}

	public void setSmsDate(Date smsDate) {
		this.smsDate = smsDate;
	}

	public Short getSmsCardCount() {
		return this.smsCardCount;
	}

	public void setSmsCardCount(Short smsCardCount) {
		this.smsCardCount = smsCardCount;
	}

	public String getBdUserId() {
		return bdUserId;
	}

	public void setBdUserId(String bdUserId) {
		this.bdUserId = bdUserId;
	}

	public String getBdChannelId() {
		return bdChannelId;
	}

	public void setBdChannelId(String bdChannelId) {
		this.bdChannelId = bdChannelId;
	}

	public char getOsType() {
		return osType;
	}

	public void setOsType(char osType) {
		this.osType = osType;
	}

	public String getDeviceSerialId() {
		return deviceSerialId;
	}

	public void setDeviceSerialId(String deviceSerialId) {
		this.deviceSerialId = deviceSerialId;
	}

	public Date getVcodeTime() {
		return vcodeTime;
	}

	public void setVcodeTime(Date vcodeTime) {
		this.vcodeTime = vcodeTime;
	}

	public void setVcode(Integer vcode) {
		this.vcode = vcode;
	}

	public Integer getVcode() {
		return vcode;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public char getVideoFlag() {
		return videoFlag;
	}

	public void setVideoFlag(char videoFlag) {
		this.videoFlag = videoFlag;
	}

	public String getVideoAccount() {
		return videoAccount;
	}

	public void setVideoAccount(String videoAccount) {
		this.videoAccount = videoAccount;
	}

	public String getVideoPassword() {
		return videoPassword;
	}

	public void setVideoPassword(String videoPassword) {
		this.videoPassword = videoPassword;
	}

	public char getIsManager() {
		return isManager;
	}

	public void setIsManager(char isManager) {
		this.isManager = isManager;
	}

	public char getAppFlag() {
		return appFlag;
	}

	public void setAppFlag(char appFlag) {
		this.appFlag = appFlag;
	}

	public char getRecordFlag() {
		return recordFlag;
	}

	public void setRecordFlag(char recordFlag) {
		this.recordFlag = recordFlag;
	}

}
