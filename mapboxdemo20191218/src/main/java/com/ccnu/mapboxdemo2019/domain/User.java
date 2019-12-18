package com.ccnu.mapboxdemo2019.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity     // 该注解声明一个实体类，与数据库中的表对应
@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id     //表明
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自动生成
    private Long id;

    private String lng;
    private String lat;
    private String landClass;
    private String userDescription;

    @CreatedDate    //自动生成时间
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date createTime;

    public User() {
    }

    public User(String lng, String lat, String landClass, String userDescription, Date createTime) {
        this.lng = lng;
        this.lat = lat;
        this.landClass = landClass;
        this.userDescription = userDescription;
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLandClass() {
        return landClass;
    }

    public void setLandClass(String landClass) {
        this.landClass = landClass;
    }

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
