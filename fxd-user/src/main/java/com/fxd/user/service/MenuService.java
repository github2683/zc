package com.fxd.user.service;

import com.fxd.core.service.BaseService;
import com.fxd.user.entity.Menu;
import com.fxd.user.entityext.MenuExt;

import java.util.List;

/**
 * @Author zhc
 * @Date 2021/3/4 20:32
 */
public interface MenuService extends BaseService<Menu, MenuExt> {
    List<Menu> findByUser(String userName);
}
