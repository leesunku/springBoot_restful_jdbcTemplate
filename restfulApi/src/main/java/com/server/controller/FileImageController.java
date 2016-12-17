package com.server.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
@RestController
public class FileImageController {
	@Autowired private Environment env;
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/imageUpload/{channel}/{type}/{name}", method = RequestMethod.POST)
	@ResponseBody
	public String uploadFile(@RequestParam("uploadfile") MultipartFile uploadfile, @PathVariable String channel, @PathVariable String type, @PathVariable String name) {
		String filename = null;
		try {
			long fileSize = uploadfile.getSize();
			if (fileSize > 1024000)
				return "sizeOver";
			String imgFileName = uploadfile.getOriginalFilename().trim();
			int pathPoint = imgFileName.lastIndexOf(".");
			String filePoint = imgFileName.substring(
					pathPoint + 1, 
					imgFileName.length());
			String fileType = filePoint.toLowerCase();
			if (!fileType.equalsIgnoreCase("jpg") &&
				!fileType.equalsIgnoreCase("jpeg") &&
				!fileType.equalsIgnoreCase("png"))
				return "noImages";
			
			String uid = UUID.randomUUID().toString().replaceAll("-", "");
			filename = name + "_" + uid + "." + fileType;
			String directory = env.getProperty("spring.paths.uploadedFiles") + "/" + channel + "/" + type;
			String filepath = Paths.get(directory, filename).toString();
			// Save the file locally
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(filepath)));
			stream.write(uploadfile.getBytes());
			stream.close();
		} catch (Exception e) {
			System.out.println("e.getMessage() = " + e.getMessage());
			return "f";
		}
		return "http://url/files/images/" + channel + "/" + filename;
	} // method uploadFile
}
