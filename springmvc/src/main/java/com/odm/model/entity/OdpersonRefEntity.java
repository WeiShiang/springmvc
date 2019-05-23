package com.odm.model.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name = "odpersonRefEntity")
@Table(name = "db2odm.odperson_ref")
public class OdpersonRefEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "PERSON_ID")
	String personId;
	@Column(name = "PERSON_NAME")
	String personName;
	@Column(name = "BRANCH_ID")
	String branchId;
	@Column(name = "BRANCH_CLASS")
	String branchClass;
	@Column(name = "RESIGNATION")
	String resignation;
	@Column(name = "CREATE_DATE")
	Date createDate;
	@Column(name = "CREATOR_ID")
	String creatorId;
	@Column(name = "TRANSTS")
	String transts;
	@Column(name = "REVIEW_FLAG")
	String reviewFlag;
	@Column(name = "REVIEW_DATE")
	Date reviewDate;
	@Column(name = "REVIEWER_ID")
	String reviewerId;
	@Column(name = "UNIT_ID")
	String unitId;
	@Column(name = "PER_SERIL_NO")
	String perSerilNo;
	@Column(name = "SYS_MANAGER")
	String sysManager;

	public OdpersonRefEntity() {

	}
	
	public String getPersonId() {
		return personId;
	}



	public void setPersonId(String personId) {
		this.personId = personId;
	}



	public String getPersonName() {
		return personName;
	}



	public void setPersonName(String personName) {
		this.personName = personName;
	}



	public String getBranchId() {
		return branchId;
	}



	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}



	public String getBranchClass() {
		return branchClass;
	}



	public void setBranchClass(String branchClass) {
		this.branchClass = branchClass;
	}



	public String getResignation() {
		return resignation;
	}



	public void setResignation(String resignation) {
		this.resignation = resignation;
	}



	public Date getCreateDate() {
		return createDate;
	}



	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}



	public String getCreatorId() {
		return creatorId;
	}



	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}



	public String getTransts() {
		return transts;
	}



	public void setTransts(String transts) {
		this.transts = transts;
	}



	public String getReviewFlag() {
		return reviewFlag;
	}



	public void setReviewFlag(String reviewFlag) {
		this.reviewFlag = reviewFlag;
	}



	public Date getReviewDate() {
		return reviewDate;
	}



	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}



	public String getReviewerId() {
		return reviewerId;
	}



	public void setReviewerId(String reviewerId) {
		this.reviewerId = reviewerId;
	}



	public String getUnitId() {
		return unitId;
	}



	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}



	public String getPerSerilNo() {
		return perSerilNo;
	}



	public void setPerSerilNo(String perSerilNo) {
		this.perSerilNo = perSerilNo;
	}



	public String getSysManager() {
		return sysManager;
	}



	public void setSysManager(String sysManager) {
		this.sysManager = sysManager;
	}

	@Override
	public String toString() {
		return "OdpersonRef [personId=" + personId + ", personName=" + personName + ", branchId=" + branchId + ", branchClass=" + branchClass +
			   ", resignation=" + resignation + ", createDate=" + createDate + ", creatorId=" + creatorId + ", transts=" + transts +
			   ", reviewFlag=" + reviewFlag + ", reviewDate=" + reviewDate + ", reviewerId=" + reviewerId + ", unitId=" + unitId +
			   ", perSerilNo=" + perSerilNo + ", sysManager=" + sysManager + "]";
	}
}
