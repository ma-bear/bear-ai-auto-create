package com.mabear.bearaicodemother.service.impl;

import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author: ma bear
 * @date: 2025/8/26 9:49
 */
public interface ProjectDownloadService {
    void downloadProjectAsZip(String projectPath, String downloadFileName, HttpServletResponse response);
}
