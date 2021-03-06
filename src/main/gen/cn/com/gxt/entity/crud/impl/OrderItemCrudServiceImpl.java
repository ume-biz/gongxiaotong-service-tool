package cn.com.gxt.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.entity.OrderItemDto;
import cn.com.gxt.entity.crud.OrderItemCrudService;

/**
 * 需求信息品类明细表:ORDER_ITEM CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@org.springframework.stereotype.Service
public class OrderItemCrudServiceImpl extends BaseDBComponent implements OrderItemCrudService {
    /**
     * Enable operation history table automatic insert flag.<br>
     */
    private boolean enableOperationHistory = true;
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService#setEnableOperationHistory
     */
    @Override
    public void setEnableOperationHistory(boolean enable) {
        this.enableOperationHistory = enable;
    }

    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService#create
     */
    @Override
    @TransactionRequired
    public Integer create(OrderItemDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(OrderItemDto.SQLID.INSERT_HISTORY_C, entity);
        }
        int result = super.getDao().update(OrderItemDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService#createList
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<OrderItemDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderItemDto entity : entityList) {
            result.add(this.create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService#createOrUpdate
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(OrderItemDto entity) {
        OrderItemDto existed = super.getDao().queryForObject(OrderItemDto.SQLID.FIND, entity, OrderItemDto.class);
        if (existed == null) {
            return this.create(entity);
        } else {
            validate(entity);
            return this.update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService#createOrUpdateList
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<OrderItemDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderItemDto entity : entityList) {
            result.add(this.createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService#update
     */
    @Override
    @TransactionRequired
    public Integer update(OrderItemDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(OrderItemDto.SQLID.INSERT_HISTORY_U, this.find(entity));
        }
        int result = super.getDao().update(OrderItemDto.SQLID.SMART_UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService#updateList
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<OrderItemDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderItemDto entity : entityList) {
            result.add(this.update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService#updateFully
     */
    @Override
    @TransactionRequired
    public Integer updateFully(OrderItemDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(OrderItemDto.SQLID.INSERT_HISTORY_U, entity);
        }
        int result = super.getDao().update(OrderItemDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService#updateFullyList
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<OrderItemDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderItemDto entity : entityList) {
            result.add(this.updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService#delete
     */
    @Override
    @TransactionRequired
    public Integer delete(OrderItemDto entity) {
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(OrderItemDto.SQLID.INSERT_HISTORY_D, this.find(entity));
        }
        int result = super.getDao().update(OrderItemDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService#deleteList
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<OrderItemDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderItemDto entity : entityList) {
            result.add(this.delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService#find
     */
    @Override
    public OrderItemDto find(OrderItemDto queryParam) {
        return super.getDao().queryForObject(OrderItemDto.SQLID.FIND, queryParam, OrderItemDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService#findList
     */
    @Override
    public List<OrderItemDto> findList(OrderItemDto condition) {
        return super.getDao().queryForObjectList(OrderItemDto.SQLID.SEARCH, condition, OrderItemDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService#findListLike
     */
    @Override
    public List<OrderItemDto> findListLike(Map<String, String> condition) {
        return super.getDao().queryForObjectList(OrderItemDto.SQLID.LIKE_SEARCH, condition, OrderItemDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService#findListMatch
     */
    @Override
    public List<OrderItemDto> findListMatch(Map<String, String> dynaCondition) {
        return super.getDao().queryForObjectList(OrderItemDto.SQLID.DYNA_SEARCH, dynaCondition, OrderItemDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return super.getDao().count(OrderItemDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(OrderItemDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
