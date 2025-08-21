package com.mabear.bearaicodemother.service;

import com.mabear.bearaicodemother.model.dto.app.AppQueryRequest;
import com.mabear.bearaicodemother.model.entity.App;
import com.mabear.bearaicodemother.model.entity.User;
import com.mabear.bearaicodemother.model.vo.AppVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * 应用 服务层。
 *
 * @author 码熊
 */
public interface AppService extends IService<App> {

    Flux<String> chatToGenCode(Long appId, String message, User loginUser);

    AppVO getAppVO(App app);

    List<AppVO> getAppVOList(List<App> appList);

    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);
}
