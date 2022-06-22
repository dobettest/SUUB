package com.example.emos.api.controller.form;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@Schema
public class GetPhoneCode {
    @NotBlank(message = "手机号不能为空")
    private String Phone;
    @NotBlank(message = "操作码不能为空")
    private int code;
}
