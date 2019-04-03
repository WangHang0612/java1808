package com.wanghang.dto;


public class City {

  private long cityId;
  private String cityName;
  private String provinceId;
  private String firstLetter;
  private long isHot;
  private long state;
  private Province province;

  @Override
  public String toString() {
    return "City{" +
            "cityId=" + cityId +
            ", cityName='" + cityName + '\'' +
            ", provinceId='" + provinceId + '\'' +
            ", firstLetter='" + firstLetter + '\'' +
            ", isHot=" + isHot +
            ", state=" + state +
            ", province=" + province +
            '}';
  }

  public Province getProvince() {
    return province;
  }

  public void setProvince(Province province) {
    this.province = province;
  }

  public long getCityId() {
    return cityId;
  }

  public void setCityId(long cityId) {
    this.cityId = cityId;
  }


  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  public String getProvinceId() {
    return provinceId;
  }

  public void setProvinceId(String provinceId) {
    this.provinceId = provinceId;
  }


  public String getFirstLetter() {
    return firstLetter;
  }

  public void setFirstLetter(String firstLetter) {
    this.firstLetter = firstLetter;
  }


  public long getIsHot() {
    return isHot;
  }

  public void setIsHot(long isHot) {
    this.isHot = isHot;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }

}
