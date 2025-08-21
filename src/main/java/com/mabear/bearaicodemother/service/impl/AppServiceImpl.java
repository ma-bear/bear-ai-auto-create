package com.mabear.bearaicodemother.service.impl;

import com.mabear.bearaicodemother.mapper.AppMapper;
import com.mabear.bearaicodemother.model.entity.App;
import com.mabear.bearaicodemother.service.AppService;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 应用 服务层实现。
 *
 * @author 码熊
 */
@Service
public class AppServiceImpl extends ServiceImpl<AppMapper, App>  implements AppService {

}
