package cn.com.gxt.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.entity.OrderDto;
import cn.com.gxt.entity.crud.OrderCrudService;

/**
 * 需求发布主信息表:ORDER<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class OrderCrudServiceImpl extends BaseDBComponent implements OrderCrudService {
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(OrderDto entity) {
        validate(entity);
        return getDao().update(OrderDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<OrderDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(OrderDto entity) {
        OrderDto existed = getDao().queryForObject(OrderDto.SQLID.FIND, entity, OrderDto.class);
        if (existed == null) {
            return getDao().update(OrderDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(OrderDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<OrderDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(OrderDto entity) {
        validate(entity);
        return getDao().update(OrderDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<OrderDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(OrderDto entity) {
        validate(entity);
        return getDao().update(OrderDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<OrderDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(OrderDto entity) {
        return getDao().update(OrderDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<OrderDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    public OrderDto find(OrderDto queryParam) {
        return getDao().queryForObject(OrderDto.SQLID.FIND, queryParam, OrderDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    public List<OrderDto> search(OrderDto condition) {
        return getDao().queryForObjectList(OrderDto.SQLID.SEARCH, condition, OrderDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    public List<OrderDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(OrderDto.SQLID.LIKE_SEARCH, condition, OrderDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    public List<OrderDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(OrderDto.SQLID.DYNA_SEARCH, condition, OrderDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(OrderDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(OrderDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
