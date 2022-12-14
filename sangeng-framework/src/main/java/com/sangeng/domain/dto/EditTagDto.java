package com.sangeng.domain.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EditTagDto {

    private Long id;

    //标签名
    private String name;

    //备注
    private String remark;
}
