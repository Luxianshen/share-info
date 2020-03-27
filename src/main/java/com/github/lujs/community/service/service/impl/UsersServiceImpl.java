package com.github.lujs.community.service.service.impl;

import com.github.lujs.community.service.mapper.UsersMapper;
import com.github.lujs.community.api.model.pojo.Users;
import com.github.lujs.community.api.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *  服务实现类
 * @author joysim
 * @since 2020-03-27
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
