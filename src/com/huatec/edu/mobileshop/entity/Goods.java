package com.huatec.edu.mobileshop.entity;
import java.io.Serializable;
import java.sql.Timestamp;

//商品
public class Goods implements Serializable {
	private Integer goods_id;//商品编号
	private String name;//名称
	private String sn;//货号
	private String brief;//简介
	private String description;//详细描述
	private Double price;//销售价
	private Double cost;//成本价
	private Double mktprice;//市场价
	private Integer mkt_enable;//是否上架，0：上架，1：不上架
	private Integer cat_id;//分类编号
	private Integer brand_id;//品牌编号
	private Double weight;//重量
	private String intro;//详情图片
	private String params;//参数
	private Timestamp creatime;//创建时间
	private Timestamp last_modify;//最后修改时间
	private Integer view_count;//浏览次数
	private Integer buy_count;//购买次数
	private String thumbnail;//缩略图
	private String big;//大图
	private String small;//小图
	private String original;//原图

    public Goods() {
    }

    public Goods(Integer goods_id, String name, String sn, String brief, String description,
                 Double price, Double cost, Double mktprice, Integer mkt_enable, Integer cat_id,
                 Integer brand_id, Double weight, String intro, String params, Timestamp creatime,
                 Timestamp last_modify, Integer view_count, Integer buy_count, String thumbnail,
                 String big, String small, String original) {
        this.goods_id = goods_id;
        this.name = name;
        this.sn = sn;
        this.brief = brief;
        this.description = description;
        this.price = price;
        this.cost = cost;
        this.mktprice = mktprice;
        this.mkt_enable = mkt_enable;
        this.cat_id = cat_id;
        this.brand_id = brand_id;
        this.weight = weight;
        this.intro = intro;
        this.params = params;
        this.creatime = creatime;
        this.last_modify = last_modify;
        this.view_count = view_count;
        this.buy_count = buy_count;
        this.thumbnail = thumbnail;
        this.big = big;
        this.small = small;
        this.original = original;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getMktprice() {
        return mktprice;
    }

    public void setMktprice(Double mktprice) {
        this.mktprice = mktprice;
    }

    public Integer getMkt_enable() {
        return mkt_enable;
    }

    public void setMkt_enable(Integer mkt_enable) {
        this.mkt_enable = mkt_enable;
    }

    public Integer getCat_id() {
        return cat_id;
    }

    public void setCat_id(Integer cat_id) {
        this.cat_id = cat_id;
    }

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public Timestamp getCreatime() {
        return creatime;
    }

    public void setCreatime(Timestamp creatime) {
        this.creatime = creatime;
    }

    public Timestamp getLast_modify() {
        return last_modify;
    }

    public void setLast_modify(Timestamp last_modify) {
        this.last_modify = last_modify;
    }

    public Integer getView_count() {
        return view_count;
    }

    public void setView_count(Integer view_count) {
        this.view_count = view_count;
    }

    public Integer getBuy_count() {
        return buy_count;
    }

    public void setBuy_count(Integer buy_count) {
        this.buy_count = buy_count;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getBig() {
        return big;
    }

    public void setBig(String big) {
        this.big = big;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goods_id=" + goods_id +
                ", name='" + name + '\'' +
                ", sn='" + sn + '\'' +
                ", brief='" + brief + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", cost=" + cost +
                ", mktprice=" + mktprice +
                ", mkt_enable=" + mkt_enable +
                ", cat_id=" + cat_id +
                ", brand_id=" + brand_id +
                ", weight=" + weight +
                ", intro='" + intro + '\'' +
                ", params='" + params + '\'' +
                ", creatime=" + creatime +
                ", last_modify=" + last_modify +
                ", view_count=" + view_count +
                ", buy_count=" + buy_count +
                ", thumbnail='" + thumbnail + '\'' +
                ", big='" + big + '\'' +
                ", small='" + small + '\'' +
                ", original='" + original + '\'' +
                '}';
    }
}
