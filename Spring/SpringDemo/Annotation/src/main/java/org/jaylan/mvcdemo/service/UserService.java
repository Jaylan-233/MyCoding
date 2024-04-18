package org.jaylan.mvcdemo.service;

import org.jaylan.mvcdemo.dao.DBDao;

import org.jaylan.mvcdemo.dao.impl.MySQLDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
//    实例化这个对象

//    为什么不推荐使用@Autowired
    // 说明用哪一个 类 上面的是接口
//    @Autowired
//    @Qualifier("mySQLDao") //多个对象 使用一个接口 系统? 你要哪个对象? 使用这个说明
//    // 切好到哪个 用这个指定
//    private DBDao dbDao;

    //TODO 改造成可使用@Qualifier("mySQLDao") 切换的
    @Autowired
    private MySQLDao mySQLDao;

    /**
     * 调用Dao层的方法
     */
    public void saveService()
    {
//        dbDao.saveData();
        mySQLDao.saveData();
    }

}
