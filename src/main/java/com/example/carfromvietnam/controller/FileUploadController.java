package com.example.carfromvietnam.controller;

import com.example.carfromvietnam.service.Impl.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class FileUploadController {

    @Autowired
    private FileUploadService fileUploadService;

    @PostMapping
    public void uploadFile(@RequestParam("file")MultipartFile file) throws IOException {
        fileUploadService.uploadFile(file);
    }
}
