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
 * 需求发布明细信息表:ORDER_ITEM<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class OrderItemCrudServiceImpl extends BaseDBComponent implements OrderItemCrudService {
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(OrderItemDto entity) {
        validate(entity);
        return getDao().update(OrderItemDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<OrderItemDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderItemDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(OrderItemDto entity) {
        OrderItemDto existed = getDao().queryForObject(OrderItemDto.SQLID.FIND, entity, OrderItemDto.class);
        if (existed == null) {
            return getDao().update(OrderItemDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(OrderItemDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<OrderItemDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderItemDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(OrderItemDto entity) {
        validate(entity);
        return getDao().update(OrderItemDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<OrderItemDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderItemDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(OrderItemDto entity) {
        validate(entity);
        return getDao().update(OrderItemDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<OrderItemDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderItemDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(OrderItemDto entity) {
        return getDao().update(OrderItemDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<OrderItemDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderItemDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService
     */
    @Override
    public OrderItemDto find(OrderItemDto queryParam) {
        return getDao().queryForObject(OrderItemDto.SQLID.FIND, queryParam, OrderItemDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService
     */
    @Override
    public List<OrderItemDto> search(OrderItemDto condition) {
        return getDao().queryForObjectList(OrderItemDto.SQLID.SEARCH, condition, OrderItemDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService
     */
    @Override
    public List<OrderItemDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(OrderItemDto.SQLID.LIKE_SEARCH, condition, OrderItemDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService
     */
    @Override
    public List<OrderItemDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(OrderItemDto.SQLID.DYNA_SEARCH, condition, OrderItemDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(OrderItemDto.SQLID.COUNT, condition);
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
