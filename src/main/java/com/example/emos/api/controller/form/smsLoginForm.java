package com.example.emos.api.controller.form;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@Schema(description = "短信登录表单类")
public class smsLoginForm {
    @NotBlank(message = "手机号不能为空")
    private String Phone;
    @NotBlank(message = "验证码不能为空")
    private int code;
}
