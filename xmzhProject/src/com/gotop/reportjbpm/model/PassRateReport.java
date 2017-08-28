package com.gotop.reportjbpm.model;

import java.io.Serializable;

public class PassRateReport implements Serializable {
	//报单日期-开始
	private String repTimeStart;
	//报单日期--结束
	private String repTimeEnd;
	//一级支行
	private String orgCodeOne;
	//一级支行--名称
	private String orgNameOne;
	//二级支行
	private String orgCodeTwo;
	//二级支行--名称
	private String orgNameTwo;
	//一级分类名称
	private String oneCategory;
	//一级分类id
	private String oneCategoryId;
	
	//贷种分类
	private String loanCategory;
	//贷种分类id
	private String loanCategoryId;
	//审查人
	private String reviewEmpname;
	//审批人
	private String approvalEmpname;
	
	/*一次通过率
	（相同的 一级、二级机构、一级、贷种分类前提下，表示一条记录，这条记录汇总前的一次通过笔数/汇总前的经过"受理调查-->收单派单"的一次及以上流程笔数）
	一次通过笔数 = 一次经过"受理调查-->收单派单"，并且到“发起合同预审”
	*/
	private String passone_rate;
	
	/*二次通过率
	（相同的 一级、二级机构、一级、贷种分类前提下，表示一条记录，这条记录汇总前的二次通过笔数/汇总前的经过"受理调查-->收单派单"的二次及以上流程笔数）
	二次通过笔数 = 二次经过"受理调查-->收单派单"，并且到“发起合同预审”
	*/
	private String passtwo_rate;
	
	
	private String passone_num;
	private String scsp_one_allnum;
	private String passtwo_num;
	private String scsp_two_allnum;
	
	public String getPassone_num() {
		return passone_num;
	}
	public String getScsp_one_allnum() {
		return scsp_one_allnum;
	}
	public String getPasstwo_num() {
		return passtwo_num;
	}
	public String getScsp_two_allnum() {
		return scsp_two_allnum;
	}
	public void setPassone_num(String passone_num) {
		this.passone_num = passone_num;
	}
	public void setScsp_one_allnum(String scsp_one_allnum) {
		this.scsp_one_allnum = scsp_one_allnum;
	}
	public void setPasstwo_num(String passtwo_num) {
		this.passtwo_num = passtwo_num;
	}
	public void setScsp_two_allnum(String scsp_two_allnum) {
		this.scsp_two_allnum = scsp_two_allnum;
	}
	public String getRepTimeStart() {
		return repTimeStart;
	}
	public void setRepTimeStart(String repTimeStart) {
		this.repTimeStart = repTimeStart;
	}
	public String getRepTimeEnd() {
		return repTimeEnd;
	}
	public void setRepTimeEnd(String repTimeEnd) {
		this.repTimeEnd = repTimeEnd;
	}
	public String getOrgCodeOne() {
		return orgCodeOne;
	}
	public void setOrgCodeOne(String orgCodeOne) {
		this.orgCodeOne = orgCodeOne;
	}
	public String getOrgNameOne() {
		return orgNameOne;
	}
	public void setOrgNameOne(String orgNameOne) {
		this.orgNameOne = orgNameOne;
	}
	public String getOrgCodeTwo() {
		return orgCodeTwo;
	}
	public void setOrgCodeTwo(String orgCodeTwo) {
		this.orgCodeTwo = orgCodeTwo;
	}
	public String getOrgNameTwo() {
		return orgNameTwo;
	}
	public void setOrgNameTwo(String orgNameTwo) {
		this.orgNameTwo = orgNameTwo;
	}
	public String getOneCategory() {
		return oneCategory;
	}
	public void setOneCategory(String oneCategory) {
		this.oneCategory = oneCategory;
	}
	public String getLoanCategory() {
		return loanCategory;
	}
	public void setLoanCategory(String loanCategory) {
		this.loanCategory = loanCategory;
	}
	public String getReviewEmpname() {
		return reviewEmpname;
	}
	public void setReviewEmpname(String reviewEmpname) {
		this.reviewEmpname = reviewEmpname;
	}
	public String getApprovalEmpname() {
		return approvalEmpname;
	}
	public void setApprovalEmpname(String approvalEmpname) {
		this.approvalEmpname = approvalEmpname;
	}
	public String getLoanCategoryId() {
		return loanCategoryId;
	}
	public void setLoanCategoryId(String loanCategoryId) {
		this.loanCategoryId = loanCategoryId;
	}
	public String getOneCategoryId() {
		return oneCategoryId;
	}
	public void setOneCategoryId(String oneCategoryId) {
		this.oneCategoryId = oneCategoryId;
	}
	public String getPassone_rate() {
		return passone_rate;
	}
	public void setPassone_rate(String passone_rate) {
		this.passone_rate = passone_rate;
	}
	public String getPasstwo_rate() {
		return passtwo_rate;
	}
	public void setPasstwo_rate(String passtwo_rate) {
		this.passtwo_rate = passtwo_rate;
	}
	

	
}
