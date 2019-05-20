
package com.ashun.pojo;



import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class User  implements Serializable{
    // 主键
    private Long id;
    // 用户名
    private String name;
    //生日
    private Date birthday;

    public User() {
    }

    public User(Long id, String name, Date birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }
}

