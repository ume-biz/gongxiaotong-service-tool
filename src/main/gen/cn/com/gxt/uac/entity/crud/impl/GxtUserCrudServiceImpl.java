package cn.com.gxt.uac.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.uac.entity.GxtUserDto;
import cn.com.gxt.uac.entity.crud.GxtUserCrudService;

/**
 * 供销通用户表:GXT_USER<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class GxtUserCrudServiceImpl extends BaseDBComponent implements GxtUserCrudService {
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.GxtUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(GxtUserDto entity) {
        validate(entity);
        return getDao().update(GxtUserDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.GxtUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<GxtUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (GxtUserDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.GxtUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(GxtUserDto entity) {
        GxtUserDto existed = getDao().queryForObject(GxtUserDto.SQLID.FIND, entity, GxtUserDto.class);
        if (existed == null) {
            return getDao().update(GxtUserDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(GxtUserDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.GxtUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<GxtUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (GxtUserDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.GxtUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(GxtUserDto entity) {
        validate(entity);
        return getDao().update(GxtUserDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.GxtUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<GxtUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (GxtUserDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.GxtUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(GxtUserDto entity) {
        validate(entity);
        return getDao().update(GxtUserDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.GxtUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<GxtUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (GxtUserDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.GxtUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(GxtUserDto entity) {
        return getDao().update(GxtUserDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.GxtUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<GxtUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (GxtUserDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.GxtUserCrudService
     */
    @Override
    public GxtUserDto find(GxtUserDto queryParam) {
        return getDao().queryForObject(GxtUserDto.SQLID.FIND, queryParam, GxtUserDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.GxtUserCrudService
     */
    @Override
    public List<GxtUserDto> search(GxtUserDto condition) {
        return getDao().queryForObjectList(GxtUserDto.SQLID.SEARCH, condition, GxtUserDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.GxtUserCrudService
     */
    @Override
    public List<GxtUserDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(GxtUserDto.SQLID.LIKE_SEARCH, condition, GxtUserDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.GxtUserCrudService
     */
    @Override
    public List<GxtUserDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(GxtUserDto.SQLID.DYNA_SEARCH, condition, GxtUserDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.GxtUserCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(GxtUserDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(GxtUserDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
