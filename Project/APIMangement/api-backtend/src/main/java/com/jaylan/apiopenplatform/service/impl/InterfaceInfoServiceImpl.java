package com.jaylan.apiopenplatform.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jaylan.apiopenplatform.service.InterfaceInfoService;
import com.jaylan.apiopenplatform.model.entity.InterfaceInfo;
import com.jaylan.apiopenplatform.mapper.InterfaceInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author Jaylan
* @description 针对表【interface_info(接口信息表)】的数据库操作Service实现
* @createDate 2024-04-25 16:52:03
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService {

}




