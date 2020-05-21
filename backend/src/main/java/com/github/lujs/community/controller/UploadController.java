package com.github.lujs.community.controller;

import com.github.lujs.commmon.controller.BaseController;
import com.github.lujs.commmon.model.vo.BaseResponse;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.model.PutObjectRequest;
import com.qcloud.cos.model.PutObjectResult;
import com.qcloud.cos.region.Region;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @deprecated 文件上传接口
 * @author lujs
 */
@RestController
@RequestMapping("/community/upload")
public class UploadController extends BaseController {

    /**
     * 上传桶
     */
    @Value("${tec.bucketname}")
    private String bucketName;

    /**
     * 密钥ID
     */
    @Value("${tec.secretid}")
    private String secretId;

    /**
     * 密钥
     */
    @Value("${tec.secretkey}")
    private String secretKey;

    /**
     * 上传文件
     *
     * @param file
     * @return
     */
    @PostMapping(value = "/image", produces = "application/json")
    public BaseResponse uploadImage(@RequestParam(required = true, value = "file") MultipartFile file) {
        if (null == file) {
            return failedResponse("");
        }
        String random = RandomStringUtils.randomAlphabetic(16);
        String fileName = random + ".jpg";
        // 指定要上传的文件
        File localFile = (File) file;
        COSCredentials cred = new BasicCOSCredentials(secretId, secretKey);
        Region region = new Region("COS_REGION");
        ClientConfig clientConfig = new ClientConfig(region);
        COSClient cosClient = new COSClient(cred, clientConfig);

        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, fileName, localFile);
        PutObjectResult putObjectResult = cosClient.putObject(putObjectRequest);

        //todo 先本地储存
        //String filePath = imgLocalPath + File.separator + fileName;
        //FileUtil.writeBytes(file.getBytes(), filePath);
        return successResponse(fileName);

    }
}
