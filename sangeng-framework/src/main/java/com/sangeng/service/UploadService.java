package com.sangeng.service;

import com.sangeng.domain.ResponseResult;
import org.springframework.web.multipart.MultipartFile;



public interface UploadService {
    //上传图片
    ResponseResult uploadImg(MultipartFile img);
}
