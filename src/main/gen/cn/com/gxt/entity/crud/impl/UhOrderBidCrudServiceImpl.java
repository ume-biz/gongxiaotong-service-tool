package cn.com.gxt.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.entity.UhOrderBidDto;
import cn.com.gxt.entity.crud.UhOrderBidCrudService;

/**
 * 需求竞标信息表:UH_ORDER_BID<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class UhOrderBidCrudServiceImpl extends BaseDBComponent implements UhOrderBidCrudService {
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderBidCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(UhOrderBidDto entity) {
        validate(entity);
        return getDao().update(UhOrderBidDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderBidCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<UhOrderBidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UhOrderBidDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderBidCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(UhOrderBidDto entity) {
        UhOrderBidDto existed = getDao().queryForObject(UhOrderBidDto.SQLID.FIND, entity, UhOrderBidDto.class);
        if (existed == null) {
            return getDao().update(UhOrderBidDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(UhOrderBidDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderBidCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<UhOrderBidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UhOrderBidDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderBidCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(UhOrderBidDto entity) {
        validate(entity);
        return getDao().update(UhOrderBidDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderBidCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<UhOrderBidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UhOrderBidDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderBidCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(UhOrderBidDto entity) {
        validate(entity);
        return getDao().update(UhOrderBidDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderBidCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<UhOrderBidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UhOrderBidDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderBidCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(UhOrderBidDto entity) {
        return getDao().update(UhOrderBidDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderBidCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<UhOrderBidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UhOrderBidDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderBidCrudService
     */
    @Override
    public UhOrderBidDto find(UhOrderBidDto queryParam) {
        return getDao().queryForObject(UhOrderBidDto.SQLID.FIND, queryParam, UhOrderBidDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderBidCrudService
     */
    @Override
    public List<UhOrderBidDto> search(UhOrderBidDto condition) {
        return getDao().queryForObjectList(UhOrderBidDto.SQLID.SEARCH, condition, UhOrderBidDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderBidCrudService
     */
    @Override
    public List<UhOrderBidDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(UhOrderBidDto.SQLID.LIKE_SEARCH, condition, UhOrderBidDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderBidCrudService
     */
    @Override
    public List<UhOrderBidDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(UhOrderBidDto.SQLID.DYNA_SEARCH, condition, UhOrderBidDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.UhOrderBidCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(UhOrderBidDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(UhOrderBidDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
