package com.csu.mall.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//@Data:注在类上,提供类的get、set、equals、hashCode、canEqual、toString方法
//@AllArgsConstructor:注在类上，提供类的全参构造
//@NoArgsConstructor:注在类上，提供类的无参构造
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity //@Entity: 标识这是一个实体类
@Table(name = "address")  //@Table: 标识与之映射的表名
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class Address {

    @Id  //@Id: 标识数据库主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //@GeneratedValue: 标识主键生成策略，这里是自增。
    @Column(name = "id")  //@Column(name = "id")用来标识实体类中属性与数据表中字段的对应关系
    private int id;

    @ManyToOne  //两张表的关系是多对一单向
    @JoinColumn(name="uid")  //注释本表中指向user表的外键
    private User user;

    private String recipient; //收件人
    private String phone; //手机号
    private String province; //省
    private String city; //城市
    private String district; //区
    private String post; //邮编
    private String detail; //具体地址

}
