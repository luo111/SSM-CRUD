package com.crud.bean;

public class StuInfo {
    @Override
	public String toString() {
		return "StuInfo [infoId=" + infoId + ", infoName=" + infoName + ", infoSex=" + infoSex + ", infoTel=" + infoTel
				+ ", infoEmail=" + infoEmail + ", infoQq=" + infoQq + ", infoWechat=" + infoWechat + ", infoNote="
				+ infoNote + "]";
	}

	public StuInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Integer infoId;

    private String infoName;

    private String infoSex;

    private String infoTel;

    private String infoEmail;

    private String infoQq;

    private String infoWechat;

    private String infoNote;

    public StuInfo(Integer infoId, String infoName, String infoSex, String infoTel, String infoEmail, String infoQq,
			String infoWechat, String infoNote) {
		super();
		this.infoId = infoId;
		this.infoName = infoName;
		this.infoSex = infoSex;
		this.infoTel = infoTel;
		this.infoEmail = infoEmail;
		this.infoQq = infoQq;
		this.infoWechat = infoWechat;
		this.infoNote = infoNote;
	}

	public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public String getInfoName() {
        return infoName;
    }

    public void setInfoName(String infoName) {
        this.infoName = infoName == null ? null : infoName.trim();
    }

    public String getInfoSex() {
        return infoSex;
    }

    public void setInfoSex(String infoSex) {
        this.infoSex = infoSex == null ? null : infoSex.trim();
    }

    public String getInfoTel() {
        return infoTel;
    }

    public void setInfoTel(String infoTel) {
        this.infoTel = infoTel == null ? null : infoTel.trim();
    }

    public String getInfoEmail() {
        return infoEmail;
    }

    public void setInfoEmail(String infoEmail) {
        this.infoEmail = infoEmail == null ? null : infoEmail.trim();
    }

    public String getInfoQq() {
        return infoQq;
    }

    public void setInfoQq(String infoQq) {
        this.infoQq = infoQq == null ? null : infoQq.trim();
    }

    public String getInfoWechat() {
        return infoWechat;
    }

    public void setInfoWechat(String infoWechat) {
        this.infoWechat = infoWechat == null ? null : infoWechat.trim();
    }

    public String getInfoNote() {
        return infoNote;
    }

    public void setInfoNote(String infoNote) {
        this.infoNote = infoNote == null ? null : infoNote.trim();
    }
}