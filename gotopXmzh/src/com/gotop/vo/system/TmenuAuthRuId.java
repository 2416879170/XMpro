package com.gotop.vo.system;

/**
 * TmenuAuthRuId generated by MyEclipse Persistence Tools
 */

public class TmenuAuthRuId implements java.io.Serializable {

	// Fields

	private Integer id;

	private Short sqdxlx;

	private String cdid;

	// Constructors

	/** default constructor */
	public TmenuAuthRuId() {
	}

	/** full constructor */
	public TmenuAuthRuId(Integer id, Short sqdxlx, String cdid) {
		this.id = id;
		this.sqdxlx = sqdxlx;
		this.cdid = cdid;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Short getSqdxlx() {
		return this.sqdxlx;
	}

	public void setSqdxlx(Short sqdxlx) {
		this.sqdxlx = sqdxlx;
	}

	public String getCdid() {
		return this.cdid;
	}

	public void setCdid(String cdid) {
		this.cdid = cdid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TmenuAuthRuId))
			return false;
		TmenuAuthRuId castOther = (TmenuAuthRuId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getSqdxlx() == castOther.getSqdxlx()) || (this
						.getSqdxlx() != null
						&& castOther.getSqdxlx() != null && this.getSqdxlx()
						.equals(castOther.getSqdxlx())))
				&& ((this.getCdid() == castOther.getCdid()) || (this.getCdid() != null
						&& castOther.getCdid() != null && this.getCdid()
						.equals(castOther.getCdid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getSqdxlx() == null ? 0 : this.getSqdxlx().hashCode());
		result = 37 * result
				+ (getCdid() == null ? 0 : this.getCdid().hashCode());
		return result;
	}

}