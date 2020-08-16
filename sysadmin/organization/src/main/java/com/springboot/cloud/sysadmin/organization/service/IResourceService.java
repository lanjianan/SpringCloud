package com.springboot.cloud.sysadmin.organization.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springboot.cloud.sysadmin.organization.entity.dto.SysResourceTree;
import com.springboot.cloud.sysadmin.organization.entity.param.ResourceQueryParam;
import com.springboot.cloud.sysadmin.organization.entity.po.Resource;

import java.util.List;
import java.util.Set;

public interface IResourceService {
    /**
     * 获取资源
     *
     * @param id
     * @return
     */
    Resource get(String id);

    /**
     * 新增资源
     *
     * @param resource
     * @return
     */
    boolean add(Resource resource);

    /**
     * 查询资源,分页
     *
     * @return
     */
    IPage<Resource> query(Page page, ResourceQueryParam resourceQueryParam);

    /**
     * 查询所有资源
     *
     * @return
     */
    List<Resource> getAll();

    /**
     * 根据username查询角色拥有的资源
     *
     * @return
     */
    List<Resource> query(String username);

    /**
     * 根据userId查询角色拥有的资源
     *
     * @return
     */
    Set<String> queryResourceIds(String userId);

    /**
     * 根据用户角色查询拥有的资源
     *
     * @return
     */
    Set<String> queryPermissionsByRoleIds(Set<String> roleIds);

    /**
     * 更新资源信息
     *
     * @param resource
     */
    boolean update(Resource resource);

    /**
     * 根据id删除资源
     *
     * @param id
     */
    boolean delete(String id);

    /**
     * 使用角色列表查询菜单
     * @param roleCodes
     * @return
     */
    List<SysResourceTree> getMenuTreeByRoleCodes(Set<String> roleCodes);

    /**
     * 查询所有的资源
     * @return
     */
    List<SysResourceTree> getAllResourceTree();
}
