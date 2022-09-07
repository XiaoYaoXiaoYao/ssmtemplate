package cn.xiaoyao.ssm.dao;

import cn.xiaoyao.ssm.pojo.TOrder;

import java.util.List;

public interface TOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TOrder record);

    int insertSelective(TOrder record);

    TOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TOrder record);

    int updateByPrimaryKey(TOrder record);

    List<TOrder> selectAllList();

}