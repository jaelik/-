package com.hwj.pms.vo;

public class MemberVO {
	
	private String memberId,memberPw,memberName,memberMail,
	memberAddr1,memberAddr2,memberAddr3;
	private Integer adminCk,money,point,regDate;
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberMail() {
		return memberMail;
	}
	public void setMemberMail(String memberMail) {
		this.memberMail = memberMail;
	}
	public String getMemberAddr1() {
		return memberAddr1;
	}
	public void setMemberAddr1(String memberAddr1) {
		this.memberAddr1 = memberAddr1;
	}
	public String getMemberAddr2() {
		return memberAddr2;
	}
	public void setMemberAddr2(String memberAddr2) {
		this.memberAddr2 = memberAddr2;
	}
	public String getMemberAddr3() {
		return memberAddr3;
	}
	public void setMemberAddr3(String memberAddr3) {
		this.memberAddr3 = memberAddr3;
	}
	public Integer getAdminCk() {
		return adminCk;
	}
	public void setAdminCk(Integer adminCk) {
		this.adminCk = adminCk;
	}
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	public Integer getPoint() {
		return point;
	}
	public void setPoint(Integer point) {
		this.point = point;
	}
	public Integer getRegDate() {
		return regDate;
	}
	public void setRegDate(Integer regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return "MemberVO [memberId=" + memberId + ", memberPw=" + memberPw + ", memberName=" + memberName
				+ ", memberMail=" + memberMail + ", memberAddr1=" + memberAddr1 + ", memberAddr2=" + memberAddr2
				+ ", memberAddr3=" + memberAddr3 + ", adminCk=" + adminCk + ", money=" + money + ", point=" + point
				+ ", regDate=" + regDate + "]";
	}
	
	

}
