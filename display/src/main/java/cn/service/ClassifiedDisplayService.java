package cn.service;

import org.apache.ibatis.annotations.Param;

/**
 * 分类展示信息
 * author: len
 */
public interface ClassifiedDisplayService {
    /**
     * 获得所有电脑种类
     * @return  电脑种类json数组
     */
    String getbrand();

    /**
     * 对应电脑种类展示
     * @param gbra  电脑类型ID
     * @return
     */
    String computerShow(int gbra);

    /**
     * 模糊查询电脑信息
     * @param string
     * @return
     */
    String findByComname(String string);
    /**
     * 所有电脑品牌集合
     * @return
     */
    String getallbrand();

    /**
     * 根据商品ID查询对应电脑
     * @param gid  商品ID
     * @return   电脑对象转换的json对象
     */
    String getgoodsbyid(@Param("gid") int gid);
    /**
     * 分页显示所有电脑商品
     * @return
     */
    String getallgoods(int pagenum, int pagesize) throws Exception;
}
