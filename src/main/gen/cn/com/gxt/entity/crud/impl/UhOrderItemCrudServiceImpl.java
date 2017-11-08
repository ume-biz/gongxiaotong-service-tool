package cn.com.gxt.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.entity.UhOrderItemDto;
import cn.com.gxt.entity.crud.UhOrderItemCrudService;

/**
 * 需求发布明细信息表:UH_ORDER_ITEM<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class UhOrderItemCrudServiceImpl extends BaseDBComponent implements UhOrderItemCrudService {
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderItemCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(UhOrderItemDto entity) {
        validate(entity);
        return getDao().update(UhOrderItemDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderItemCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<UhOrderItemDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UhOrderItemDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderItemCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(UhOrderItemDto entity) {
        UhOrderItemDto existed = getDao().queryForObject(UhOrderItemDto.SQLID.FIND, entity, UhOrderItemDto.class);
        if (existed == null) {
            return getDao().update(UhOrderItemDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(UhOrderItemDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderItemCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<UhOrderItemDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UhOrderItemDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderItemCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(UhOrderItemDto entity) {
        validate(entity);
        return getDao().update(UhOrderItemDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderItemCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<UhOrderItemDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UhOrderItemDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderItemCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(UhOrderItemDto entity) {
        validate(entity);
        return getDao().update(UhOrderItemDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderItemCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<UhOrderItemDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UhOrderItemDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderItemCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(UhOrderItemDto entity) {
        return getDao().update(UhOrderItemDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderItemCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<UhOrderItemDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UhOrderItemDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderItemCrudService
     */
    @Override
    public UhOrderItemDto find(UhOrderItemDto queryParam) {
        return getDao().queryForObject(UhOrderItemDto.SQLID.FIND, queryParam, UhOrderItemDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderItemCrudService
     */
    @Override
    public List<UhOrderItemDto> search(UhOrderItemDto condition) {
        return getDao().queryForObjectList(UhOrderItemDto.SQLID.SEARCH, condition, UhOrderItemDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderItemCrudService
     */
    @Override
    public List<UhOrderItemDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(UhOrderItemDto.SQLID.LIKE_SEARCH, condition, UhOrderItemDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderItemCrudService
     */
    @Override
    public List<UhOrderItemDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(UhOrderItemDto.SQLID.DYNA_SEARCH, condition, UhOrderItemDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderItemCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(UhOrderItemDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(UhOrderItemDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
