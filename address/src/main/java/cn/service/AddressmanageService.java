package cn.service;

import cn.pojo.Address;

/**
 * ��������: <br>
 * ����ַ����ģ�页
 *
 * @return:
 * @since: 1.0.0
 * @Author:13654
 * @Date: 2018/11/1 15:32
 */
public interface AddressmanageService {

    /**
     * ��������: <br>
     * �����ӵ�ַ��
     *
     * @param address
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/1 15:53
     */
    String addLocal(Address address);


    /**
     * ��������: <br>
     * ���޸ĵ�ַ��
     *
     * @param address
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/2 11:59
     */
    String updateLocal(Address address);


    /**
     * ��������: <br>
     * ��ɾ����ַ��
     *
     * @param uid,aid
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/2 14:33
     */
    String delLocal(int uid, int aid);


    /**
     * ��������: <br>
     * ����ѯ���û�ȫ���ջ���ַ��
     *
     * @param uid
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/2 16:18
     */
    String selLocal(int uid);

    /**
     * ��������: <br>
     * ����ѯ�����û���ַ��
     *
     * @param uid,aid
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/6 13:15
     */
    String selLoncalinfo(int aid, int uid);
}