package com.test.csvpostgres.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(schema="csv", name = "csv_person")
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String ssoid;
    private int ts;
    private String grp;
    private String type;
    private String subtype;
    private String url;
    private String orgid;
    private String formid;
    private String ltpa;
    private String subirresponse;
    private Date ymdh;

    public Person(String ssoid, int ts, String grp, String type, String subtype, String url, String orgid, String formid, String ltpa, String subirresponse, Date ymdh) {
        this.ssoid = ssoid;
        this.ts = ts;
        this.grp = grp;
        this.type = type;
        this.subtype = subtype;
        this.url = url;
        this.orgid = orgid;
        this.formid = formid;
        this.ltpa = ltpa;
        this.subirresponse = subirresponse;
        this.ymdh = ymdh;
    }

    public Person() {
    }

    public String getSsoid() {
        return ssoid;
    }

    public void setSsoid(String ssoid) {
        this.ssoid = ssoid;
    }

    public int getTs() {
        return ts;
    }

    public void setTs(int ts) {
        this.ts = ts;
    }

    public String getGrp() {
        return grp;
    }

    public void setGrp(String grp) {
        this.grp = grp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public String getFormid() {
        return formid;
    }

    public void setFormid(String formid) {
        this.formid = formid;
    }

    public String getLtpa() {
        return ltpa;
    }

    public void setLtpa(String ltpa) {
        this.ltpa = ltpa;
    }

    public String getSubirresponse() {
        return subirresponse;
    }

    public void setSubirresponse(String subirresponse) {
        this.subirresponse = subirresponse;
    }

    public Date getYmdh() {
        return ymdh;
    }

    public void setYmdh(Date ymdh) {
        this.ymdh = ymdh;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", ssoid='" + ssoid + '\'' +
                ", ts=" + ts +
                ", grp='" + grp + '\'' +
                ", type='" + type + '\'' +
                ", subtype='" + subtype + '\'' +
                ", url='" + url + '\'' +
                ", orgid='" + orgid + '\'' +
                ", formid='" + formid + '\'' +
                ", ltpa='" + ltpa + '\'' +
                ", subirresponse='" + subirresponse + '\'' +
                ", ymdh=" + ymdh +
                '}';
    }
}
