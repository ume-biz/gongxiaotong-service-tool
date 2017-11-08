package cn.com.gxt.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.entity.UhOrderDto;
import cn.com.gxt.entity.crud.UhOrderCrudService;

/**
 * 需求发布主信息表:UH_ORDER<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class UhOrderCrudServiceImpl extends BaseDBComponent implements UhOrderCrudService {
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(UhOrderDto entity) {
        validate(entity);
        return getDao().update(UhOrderDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<UhOrderDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UhOrderDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(UhOrderDto entity) {
        UhOrderDto existed = getDao().queryForObject(UhOrderDto.SQLID.FIND, entity, UhOrderDto.class);
        if (existed == null) {
            return getDao().update(UhOrderDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(UhOrderDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<UhOrderDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UhOrderDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(UhOrderDto entity) {
        validate(entity);
        return getDao().update(UhOrderDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<UhOrderDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UhOrderDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(UhOrderDto entity) {
        validate(entity);
        return getDao().update(UhOrderDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<UhOrderDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UhOrderDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(UhOrderDto entity) {
        return getDao().update(UhOrderDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<UhOrderDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UhOrderDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderCrudService
     */
    @Override
    public UhOrderDto find(UhOrderDto queryParam) {
        return getDao().queryForObject(UhOrderDto.SQLID.FIND, queryParam, UhOrderDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderCrudService
     */
    @Override
    public List<UhOrderDto> search(UhOrderDto condition) {
        return getDao().queryForObjectList(UhOrderDto.SQLID.SEARCH, condition, UhOrderDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderCrudService
     */
    @Override
    public List<UhOrderDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(UhOrderDto.SQLID.LIKE_SEARCH, condition, UhOrderDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderCrudService
     */
    @Override
    public List<UhOrderDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(UhOrderDto.SQLID.DYNA_SEARCH, condition, UhOrderDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(UhOrderDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(UhOrderDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
