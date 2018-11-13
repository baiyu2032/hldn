package cn.dao;


import cn.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository("locUser")
public interface UserDao {

    /**
     * 功能描述: <br>
     * 〈新增用户信息〉
     *
     * @param user
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/4 21:21
     */
    int addUser(User user);

    /**
     * 功能描述: <br>
     * 〈查找用户信息〉
     *
     * @param uopenid
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/4 21:22
     */
    User selUser(@Param("uopenid") String uopenid);

    /**
     * 查询是否有相同的用户码
     *
     * @param num 用户码
     * @return 返回是否为0
     */
    int selUserNum(@Param("num") String num);

    /**
     * 查询用户码
     *
     * @param uopenid 用户编号
     * @return 用户码
     */
    String selUserNums(@Param("uopenid") String uopenid);
}
