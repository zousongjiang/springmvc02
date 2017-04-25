package org.framestudy.springmvc02.sysmag.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@RequestMapping("/files")
@Controller
public class FileUploadController {

	@RequestMapping(value="/upload",method=RequestMethod.POST)
	public String upload(@RequestParam("fileName")CommonsMultipartFile file){
		
		String fileName = file.getOriginalFilename();//得到文件原始名称
		System.out.println(fileName);
		String path = "D://files";
		
		try {
			File dir = new File(path);
			if(!dir.exists()|| !dir.isDirectory()){//判断dir是否是一个文件夹
				dir.mkdir();
			}
			
			path = path + File.separator + fileName;//真实文件名称
			file.getFileItem().write(new File(path));//将临时文件输出到真实文件中
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "/index";
	}
	
	
	
	
	
}
