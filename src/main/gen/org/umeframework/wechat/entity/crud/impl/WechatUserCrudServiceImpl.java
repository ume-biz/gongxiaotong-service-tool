package org.umeframework.wechat.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import org.umeframework.wechat.entity.WechatUserDto;
import org.umeframework.wechat.entity.crud.WechatUserCrudService;

/**
 * 微信用户基础属性表:WECHAT_USER<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class WechatUserCrudServiceImpl extends BaseDBComponent implements WechatUserCrudService {
    /* (non-Javadoc)
     * 
     * @see org.umeframework.wechat.entity.crud.impl.WechatUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(WechatUserDto entity) {
        validate(entity);
        return getDao().update(WechatUserDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.wechat.entity.crud.impl.WechatUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<WechatUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (WechatUserDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.wechat.entity.crud.impl.WechatUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(WechatUserDto entity) {
        WechatUserDto existed = getDao().queryForObject(WechatUserDto.SQLID.FIND, entity, WechatUserDto.class);
        if (existed == null) {
            return getDao().update(WechatUserDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(WechatUserDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.wechat.entity.crud.impl.WechatUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<WechatUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (WechatUserDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.wechat.entity.crud.impl.WechatUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(WechatUserDto entity) {
        validate(entity);
        return getDao().update(WechatUserDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.wechat.entity.crud.impl.WechatUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<WechatUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (WechatUserDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.wechat.entity.crud.impl.WechatUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(WechatUserDto entity) {
        validate(entity);
        return getDao().update(WechatUserDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.wechat.entity.crud.impl.WechatUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<WechatUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (WechatUserDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.wechat.entity.crud.impl.WechatUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(WechatUserDto entity) {
        return getDao().update(WechatUserDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.wechat.entity.crud.impl.WechatUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<WechatUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (WechatUserDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.wechat.entity.crud.impl.WechatUserCrudService
     */
    @Override
    public WechatUserDto find(WechatUserDto queryParam) {
        return getDao().queryForObject(WechatUserDto.SQLID.FIND, queryParam, WechatUserDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.wechat.entity.crud.impl.WechatUserCrudService
     */
    @Override
    public List<WechatUserDto> search(WechatUserDto condition) {
        return getDao().queryForObjectList(WechatUserDto.SQLID.SEARCH, condition, WechatUserDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.wechat.entity.crud.impl.WechatUserCrudService
     */
    @Override
    public List<WechatUserDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(WechatUserDto.SQLID.LIKE_SEARCH, condition, WechatUserDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.wechat.entity.crud.impl.WechatUserCrudService
     */
    @Override
    public List<WechatUserDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(WechatUserDto.SQLID.DYNA_SEARCH, condition, WechatUserDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.wechat.entity.crud.impl.WechatUserCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(WechatUserDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(WechatUserDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
