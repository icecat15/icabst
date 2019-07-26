package com.apanse.icabst.modules.service;

import com.apanse.icabst.modules.common.Messages;
import com.apanse.icabst.modules.dto.SignUpDTO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: icabst
 * @Date: 2019/5/29 8:29 PM
 * @Author: sunguolu
 * @Description:
 */
public interface IcabstService {


    Messages uploadFile(MultipartFile file) throws IOException;

    Messages save(SignUpDTO signUpDTO,boolean open) throws Exception;

    Messages downloadFile(HttpServletRequest request, HttpServletResponse response, String fileName);

    Messages enSave(SignUpDTO signUpDTO, boolean open) throws Exception;

}
