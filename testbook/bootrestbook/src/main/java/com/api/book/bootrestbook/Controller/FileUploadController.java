package com.api.book.bootrestbook.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.api.book.bootrestbook.helper.FileUploadHelper;

@RestController
public class FileUploadController {
    @Autowired
    private FileUploadHelper fileuploadhelper;

    @PostMapping("/file-upload")
    public ResponseEntity<String> uplodFile(@RequestParam("file") MultipartFile file)
    {
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getSize());
        System.out.println(file.getContentType());
        System.out.println(file.getName());

            try{
        if(file.isEmpty())
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("empty");
        }

        // if(!file.getContentType().equals("jpeg/image/PNG"))
        // {
        //     return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("only jpg ");
        // }

        boolean f=fileuploadhelper.uploadFile(file);
        if(f)
        {
            return ResponseEntity.ok("success");
        }
        
    }catch(Exception e){
        e.printStackTrace();
    }

    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("try again");
    }
}
