package cn.xiaobei56.sannian.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * package : cn.xiaobei56.sannian.bean
 * author : XiaoBei
 * date : 2020/7/2
 */
@Entity
public class UserBean {

    @Id
    private int Id;
//    名字
    private String name;
    @Column(length = 64)
//    昵称
    private String niceName;
// 码
    private String code;
//    简述
    @Column(columnDefinition = "")
    private String briefIntro;
//    年龄
    private int age;
//   性别
    private int gender; // 1:男 2：女 3：保密

}
