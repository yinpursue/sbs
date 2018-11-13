package cn.yin.localDate.vo;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserBirthdayVO {
    private String name;
    private LocalDate birthday;
}
