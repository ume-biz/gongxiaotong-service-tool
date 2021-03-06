package cn.com.gxt.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.entity.OrderBidDto;
import cn.com.gxt.entity.crud.OrderBidCrudService;

/**
 * 需求竞标信息表:ORDER_BID CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@org.springframework.stereotype.Service
public class OrderBidCrudServiceImpl extends BaseDBComponent implements OrderBidCrudService {
    /**
     * Enable operation history table automatic insert flag.<br>
     */
    private boolean enableOperationHistory = true;
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService#setEnableOperationHistory
     */
    @Override
    public void setEnableOperationHistory(boolean enable) {
        this.enableOperationHistory = enable;
    }

    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService#create
     */
    @Override
    @TransactionRequired
    public Integer create(OrderBidDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(OrderBidDto.SQLID.INSERT_HISTORY_C, entity);
        }
        int result = super.getDao().update(OrderBidDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService#createList
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<OrderBidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderBidDto entity : entityList) {
            result.add(this.create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService#createOrUpdate
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(OrderBidDto entity) {
        OrderBidDto existed = super.getDao().queryForObject(OrderBidDto.SQLID.FIND, entity, OrderBidDto.class);
        if (existed == null) {
            return this.create(entity);
        } else {
            validate(entity);
            return this.update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService#createOrUpdateList
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<OrderBidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderBidDto entity : entityList) {
            result.add(this.createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService#update
     */
    @Override
    @TransactionRequired
    public Integer update(OrderBidDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(OrderBidDto.SQLID.INSERT_HISTORY_U, this.find(entity));
        }
        int result = super.getDao().update(OrderBidDto.SQLID.SMART_UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService#updateList
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<OrderBidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderBidDto entity : entityList) {
            result.add(this.update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService#updateFully
     */
    @Override
    @TransactionRequired
    public Integer updateFully(OrderBidDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(OrderBidDto.SQLID.INSERT_HISTORY_U, entity);
        }
        int result = super.getDao().update(OrderBidDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService#updateFullyList
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<OrderBidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderBidDto entity : entityList) {
            result.add(this.updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService#delete
     */
    @Override
    @TransactionRequired
    public Integer delete(OrderBidDto entity) {
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(OrderBidDto.SQLID.INSERT_HISTORY_D, this.find(entity));
        }
        int result = super.getDao().update(OrderBidDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService#deleteList
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<OrderBidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderBidDto entity : entityList) {
            result.add(this.delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService#find
     */
    @Override
    public OrderBidDto find(OrderBidDto queryParam) {
        return super.getDao().queryForObject(OrderBidDto.SQLID.FIND, queryParam, OrderBidDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService#findList
     */
    @Override
    public List<OrderBidDto> findList(OrderBidDto condition) {
        return super.getDao().queryForObjectList(OrderBidDto.SQLID.SEARCH, condition, OrderBidDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService#findListLike
     */
    @Override
    public List<OrderBidDto> findListLike(Map<String, String> condition) {
        return super.getDao().queryForObjectList(OrderBidDto.SQLID.LIKE_SEARCH, condition, OrderBidDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService#findListMatch
     */
    @Override
    public List<OrderBidDto> findListMatch(Map<String, String> dynaCondition) {
        return super.getDao().queryForObjectList(OrderBidDto.SQLID.DYNA_SEARCH, dynaCondition, OrderBidDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return super.getDao().count(OrderBidDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(OrderBidDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
