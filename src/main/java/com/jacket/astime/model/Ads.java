package com.jacket.astime.model;

public class Ads {
    private Integer adsId;

    private Integer adsPosition;

    private String adsImageUrl;

    private String adsImageAdurl;

    private Integer adsType;

    public Integer getAdsId() {
        return adsId;
    }

    public void setAdsId(Integer adsId) {
        this.adsId = adsId;
    }

    public Integer getAdsPosition() {
        return adsPosition;
    }

    public void setAdsPosition(Integer adsPosition) {
        this.adsPosition = adsPosition;
    }

    public String getAdsImageUrl() {
        return adsImageUrl;
    }

    public void setAdsImageUrl(String adsImageUrl) {
        this.adsImageUrl = adsImageUrl == null ? null : adsImageUrl.trim();
    }

    public String getAdsImageAdurl() {
        return adsImageAdurl;
    }

    public void setAdsImageAdurl(String adsImageAdurl) {
        this.adsImageAdurl = adsImageAdurl == null ? null : adsImageAdurl.trim();
    }

    public Integer getAdsType() {
        return adsType;
    }

    public void setAdsType(Integer adsType) {
        this.adsType = adsType;
    }
}