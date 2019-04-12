package cn.yc.cms.dao.LoginDao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.yc.cms.pojo.Admin;

public interface AdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_table
     *
     * @mbg.generated Sat Dec 22 23:36:04 CST 2018
     */
    int deleteByPrimaryKey(Integer aId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_table
     *
     * @mbg.generated Sat Dec 22 23:36:04 CST 2018
     */
    int insert(Admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_table
     *
     * @mbg.generated Sat Dec 22 23:36:04 CST 2018
     */
    int insertSelective(Admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_table
     *
     * @mbg.generated Sat Dec 22 23:36:04 CST 2018
     */
    Admin selectByPrimaryKey(Integer aId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_table
     *
     * @mbg.generated Sat Dec 22 23:36:04 CST 2018
     */
    int updateByPrimaryKeySelective(Admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_table
     *
     * @mbg.generated Sat Dec 22 23:36:04 CST 2018
     */
    int updateByPrimaryKey(Admin record);
    
    /**
     * 查询管理员角色账号密码及权限信息
     * */
    Map<String, Object> selectPer(@Param("adminID")Integer adminID);
    
    /**
     * 根据账号密码查询管理员
     * */
    public Admin selectByNamePwd(@Param("username")String username,@Param("password")String password);
    
    /**
     * 查询所有管理员
     * */
    public List<Map<String,Object>> selectAllByLimit(
    		@Param("start")Integer start,@Param("end")Integer end,@Param("level")Integer level);
    
    /**
     * 统计
     * */
    Integer selectAllByCount(@Param("level")Integer level);
    
    /**
     * 根据id查询管理员
     * */
    Map<String, Object> selectAdminById(@Param("id")Integer id);
}