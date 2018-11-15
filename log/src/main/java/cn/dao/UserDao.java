package cn.dao;


import cn.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository("locUser")
public interface UserDao {

    /**
     * ��������: <br>
     * �������û���Ϣ��
     *
     * @param user
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/4 21:21
     */
    int addUser(User user);

    /**
     * ��������: <br>
     * �������û���Ϣ��
     *
     * @param uopenid
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/4 21:22
     */
    User selUser(@Param("uopenid") String uopenid);

    /**
     * ��ѯ�Ƿ�����ͬ���û���
     *
     * @param num �û���
     * @return �����Ƿ�Ϊ0
     */
    int selUserNum(@Param("num") String num);

    /**
     * ��ѯ�û���
     *
     * @param uopenid �û����
     * @return �û���
     */
    String selUserNums(@Param("uopenid") String uopenid);
}