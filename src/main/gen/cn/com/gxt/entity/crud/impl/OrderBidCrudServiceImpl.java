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
 * 需求竞标信息表:ORDER_BID<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class OrderBidCrudServiceImpl extends BaseDBComponent implements OrderBidCrudService {
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(OrderBidDto entity) {
        validate(entity);
        return getDao().update(OrderBidDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<OrderBidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderBidDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(OrderBidDto entity) {
        OrderBidDto existed = getDao().queryForObject(OrderBidDto.SQLID.FIND, entity, OrderBidDto.class);
        if (existed == null) {
            return getDao().update(OrderBidDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(OrderBidDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<OrderBidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderBidDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(OrderBidDto entity) {
        validate(entity);
        return getDao().update(OrderBidDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<OrderBidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderBidDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(OrderBidDto entity) {
        validate(entity);
        return getDao().update(OrderBidDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<OrderBidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderBidDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(OrderBidDto entity) {
        return getDao().update(OrderBidDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<OrderBidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderBidDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService
     */
    @Override
    public OrderBidDto find(OrderBidDto queryParam) {
        return getDao().queryForObject(OrderBidDto.SQLID.FIND, queryParam, OrderBidDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService
     */
    @Override
    public List<OrderBidDto> search(OrderBidDto condition) {
        return getDao().queryForObjectList(OrderBidDto.SQLID.SEARCH, condition, OrderBidDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService
     */
    @Override
    public List<OrderBidDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(OrderBidDto.SQLID.LIKE_SEARCH, condition, OrderBidDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService
     */
    @Override
    public List<OrderBidDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(OrderBidDto.SQLID.DYNA_SEARCH, condition, OrderBidDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderBidCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(OrderBidDto.SQLID.COUNT, condition);
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
